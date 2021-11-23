package com.taobao.api.internal.mapping;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.qimen.api.QimenResponse;
import com.qimencloud.api.QimenCloudResponse;
import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.TaobaoResponse;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.json.JSONWriter;

/**
 * 转换工具类。
 * 
 * @author carver.gu
 * @since 1.0, Apr 11, 2010
 */
public class Converters {

	/**
	 * 是否对JSON返回的数据类型进行校验，默认不校验。给内部测试JSON返回时用的开关。
	 * 规则：返回的"基本"类型只有String,Long,Boolean,Date,采取严格校验方式，如果类型不匹配，报错
	 */
	public static boolean isCheckJsonType = false;
	/**
	 * 空缓存，避免缓存击穿后影响Field和Method的获取性能。
	 */
	private static final Object emptyCache = new Object();

	private static final Map<String, Set<String>> baseProps = new HashMap<String, Set<String>>();
	private static final Map<String, Object> fieldCache = new ConcurrentHashMap<String, Object>();
	private static final Map<String, Object> methodCache = new ConcurrentHashMap<String, Object>();

	static {
		baseProps.put(TaobaoResponse.class.getName(), StringUtils.getClassProperties(TaobaoResponse.class, false));
		baseProps.put(QimenResponse.class.getName(), StringUtils.getClassProperties(QimenResponse.class, false));
	}

	private Converters() {
	}

	/**
	 * 使用指定 的读取器去转换字符串为对象。
	 * 
	 * @param <T> 领域泛型
	 * @param clazz 领域类型
	 * @param reader 读取器
	 * @return 领域对象
	 * @throws ApiException
	 */
	public static <T> T convert(Class<T> clazz, Reader reader, String responseType) throws ApiException {
		T rsp = null;

		try {
			rsp = clazz.newInstance();

			Field successField = null;
			Field[] successFields = clazz.getDeclaredFields();
			if(successFields != null && successFields.length > 0) {
				for (Field field : successFields) {
					if(field.getName().equals("success")) {
						successField = field;
					}
				}
			}
			Method successMethod = null;
					Method[] methods = clazz.getMethods();
			if(methods != null && methods.length > 0) {
				for (Method method : methods) {
					if(method.getName().equals("setSuccess")) {
						successMethod = method;
					}
				}
			}
			if(successField != null && successMethod != null) {
				String successItemName = successField.getName();
				String successListName = null;
				ApiField jsonField = successField.getAnnotation(ApiField.class);
				if (jsonField != null) {
					successItemName = jsonField.value();
				}
				ApiListField jsonListField = successField.getAnnotation(ApiListField.class);
				if (jsonListField != null) {
					successListName = jsonListField.value();
				}

				if (!reader.hasReturnField(successItemName)) {
					if (successListName == null || !reader.hasReturnField(successListName)) {
					}
				}

				setMethodValue(rsp, reader, successItemName, successListName, successField, successMethod);
			}

			BeanInfo beanInfo = Introspector.getBeanInfo(clazz);
			PropertyDescriptor[] pds = beanInfo.getPropertyDescriptors();

			for (PropertyDescriptor pd : pds) {
				Method method = getCacheMethod(clazz, pd);
				if (method == null) { // ignore read-only fields
					continue;
				}

				String itemName = pd.getName();
				String listName = null;

				Field field = null;
				boolean isErrorParam = false;
				if((TaobaoResponse.class.isAssignableFrom(clazz)
						|| QimenCloudResponse.class.isAssignableFrom(clazz)
						|| QimenResponse.class.isAssignableFrom(clazz))
					&& clazz.getSuperclass().getName().equals("java.lang.Object")) {
					isErrorParam = true;
					field = getField(clazz, pd);
				} else {
					Set<String> stopProps = baseProps.get(clazz.getSuperclass().getName());
					boolean isImplMethod = false;
					//判断该方法是否是属于实现类中
					if(successFields != null) {
						for (Field implField : successFields) {
							if(implField.getName().equals(itemName)) {
								isImplMethod = true;
								break;
							}
						}
					}

					if (stopProps != null && stopProps.contains(itemName) && !isImplMethod) {
						isErrorParam = true;
						field = getField(clazz.getSuperclass(), pd);
					} else {
						field = getField(clazz, pd);
					}
				}
				if (field == null) {
					continue;
				}

				if(isErrorParam) {
					if(null == responseType || Constants.RESPONSE_TYPE_TOP.equals(responseType)) {
						TopErrorField jsonField = field.getAnnotation(TopErrorField.class);
						if(jsonField == null) {
							continue;
						}
						itemName = jsonField.value();
						setMethodValue(rsp, reader, itemName, listName, field, method);
					} else if(Constants.RESPONSE_TYPE_QIMEN.equals(responseType)
							|| Constants.RESPONSE_TYPE_QIMEN2.equals(responseType)) {
						QimenErrorField jsonField = field.getAnnotation(QimenErrorField.class);
						if(jsonField == null) {
							continue;
						}
						itemName = jsonField.value();
						setMethodValue(rsp, reader, itemName, listName, field, method);
					} else if(Constants.RESPONSE_TYPE_DINGTALK_OAPI.equals(responseType)) {
						DingTalkErrorField jsonField = field.getAnnotation(DingTalkErrorField.class);
						if(jsonField == null) {
							continue;
						}
						itemName = jsonField.value();
						setMethodValue(rsp, reader, itemName, listName, field, method);
					}
				} else {
					ApiField jsonField = field.getAnnotation(ApiField.class);
					if (jsonField != null) {
						itemName = jsonField.value();
					}
					ApiListField jsonListField = field.getAnnotation(ApiListField.class);
					if (jsonListField != null) {
						listName = jsonListField.value();
					}

					if (!reader.hasReturnField(itemName)) {
						if (listName == null || !reader.hasReturnField(listName)) {
							continue; // ignore non-return field
						}
					}

					setMethodValue(rsp, reader, itemName, listName, field, method);
				}
			}
		} catch (Exception e) {
			throw new ApiException(e);
		}

		return rsp;
	}

	public static Field getField(Class<?> clazz, PropertyDescriptor pd) throws Exception {
		String key = new StringBuilder(clazz.getName()).append("_").append(pd.getName()).toString();
		Object field = fieldCache.get(key);
		if (field == null) {
			try {
				field = clazz.getDeclaredField(pd.getName());
			} catch (NoSuchFieldException e) {
				//如果当前类找不到字段，找父级类是否包含字段，直到顶级类Object
				Class<?> superClazz = clazz.getSuperclass();
				if(!superClazz.getName().equals("java.lang.Object")) {
					try {
						field = superClazz.getDeclaredField(pd.getName());
					} catch (NoSuchFieldException e1) {
						field = emptyCache; // cache isolated field
					}
				} else {
					field = emptyCache; // cache isolated field
				}
			}
			fieldCache.put(key, field);
		}
		return field == emptyCache ? null : (Field) field;
	}

	private static Method getCacheMethod(Class<?> clazz, PropertyDescriptor pd) {
		String key = new StringBuilder(clazz.getName()).append("_").append(pd.getName()).toString();
		Object method = methodCache.get(key);
		if (method == null) {
			method = pd.getWriteMethod();
			if (method == null) {
				method = emptyCache; // cache read-only method
			}
			methodCache.put(key, method);
		}

		return method == emptyCache ? null : (Method) method;
	}

	private static <T> void setMethodValue(T rsp, Reader reader, String itemName, String listName, Field field, Method method) throws Exception {
		Class<?> typeClass = field.getType();
		// 目前
		if (String.class.isAssignableFrom(typeClass)) {
			Object value = reader.getPrimitiveObject(itemName);
			if (value instanceof String) {
				method.invoke(rsp, value.toString());
			} else if(value instanceof Map){
				method.invoke(rsp,  new JSONWriter().write(value));
			} else {
				if (isCheckJsonType && value != null) {
					throw new ApiException(itemName + " is not a String");
				}
				if (value != null) {
					method.invoke(rsp, value.toString());
				} else {
					method.invoke(rsp, "");
				}
			}
		} else if (Long.class.isAssignableFrom(typeClass)) {
			Object value = reader.getPrimitiveObject(itemName);
			if (value instanceof Long) {
				method.invoke(rsp, (Long) value);
			} else {
				if (isCheckJsonType && value != null) {
					throw new ApiException(itemName + " is not a Number(Long)");
				}
				if (StringUtils.isNumeric(value)) {
					method.invoke(rsp, Long.valueOf(value.toString()));
				}
			}
		} else if (Boolean.class.isAssignableFrom(typeClass)) {
			Object value = reader.getPrimitiveObject(itemName);
			if (value instanceof Boolean) {
				method.invoke(rsp, (Boolean) value);
			} else {
				if (isCheckJsonType && value != null) {
					throw new ApiException(itemName + " is not a Boolean");
				}
				if (value != null) {
					method.invoke(rsp, Boolean.valueOf(value.toString()));
				}
			}
		} else if (Date.class.isAssignableFrom(typeClass)) {
			Object value = reader.getPrimitiveObject(itemName);
			if (value instanceof String) {
				method.invoke(rsp, StringUtils.parseDateTime(value.toString()));
			} else if (value instanceof Long) {
				method.invoke(rsp, new Date((Long) value));
			}
		} else if (List.class.isAssignableFrom(typeClass)) {
			Type fieldType = field.getGenericType();
			if (fieldType instanceof ParameterizedType) {
				ParameterizedType paramType = (ParameterizedType) fieldType;
				Type[] genericTypes = paramType.getActualTypeArguments();
				if (genericTypes != null && genericTypes.length > 0) {
					if (genericTypes[0] instanceof Class<?>) {
						Class<?> subType = (Class<?>) genericTypes[0];
						List<?> listObjs = reader.getListObjects(listName, itemName, subType);
						if (listObjs != null) {
							method.invoke(rsp, listObjs);
						}
					}
				}
			}
		} else if (Integer.class.isAssignableFrom(typeClass)) {
			Object value = reader.getPrimitiveObject(itemName);
			if (value instanceof Integer) {
				method.invoke(rsp, (Integer) value);
			} else {
				if (isCheckJsonType && value != null) {
					throw new ApiException(itemName + " is not a Number(Integer)");
				}
				if (StringUtils.isNumeric(value)) {
					method.invoke(rsp, Integer.valueOf(value.toString()));
				}
			}
		} else if (Double.class.isAssignableFrom(typeClass)) {
			Object value = reader.getPrimitiveObject(itemName);
			if (value instanceof Double) {
				method.invoke(rsp, (Double) value);
			} else {
				if (isCheckJsonType && value != null) {
					throw new ApiException(itemName + " is not a Double");
				}
			}
		} else if (Number.class.isAssignableFrom(typeClass)) {
			Object value = reader.getPrimitiveObject(itemName);
			if (value instanceof Number) {
				method.invoke(rsp, (Number) value);
			} else {
				if (isCheckJsonType && value != null) {
					throw new ApiException(itemName + " is not a Number");
				}
			}
		} else {
			Object obj = reader.getObject(itemName, typeClass);
			if (obj != null) {
				method.invoke(rsp, obj);
			}
		}
	}
}
