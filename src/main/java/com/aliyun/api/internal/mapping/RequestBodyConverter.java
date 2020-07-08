package com.aliyun.api.internal.mapping;

import com.taobao.api.ApiException;
import com.taobao.api.Constants;
import com.taobao.api.internal.mapping.ApiBodyField;
import com.taobao.api.internal.util.StringUtils;
import com.taobao.api.internal.util.TaobaoUtils;
import com.taobao.api.internal.util.json.JSONWriter;

import java.lang.reflect.Field;
import java.util.HashMap;

public class RequestBodyConverter {

    public static String getRequestBody(Object taobaoRequest, String type) throws ApiException {
        if(taobaoRequest == null){
            return null;
        }
        Field[] fields =  taobaoRequest.getClass().getDeclaredFields();
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        for(Field field : fields){
            ApiBodyField bodyField = field.getAnnotation(ApiBodyField.class);
            if(bodyField == null){
                continue;
            }
            try {
                field.setAccessible(true);
                if(Constants.CONTENT_TYPE_XML.equalsIgnoreCase(type)){
                    //目前不支持XML格式的传参，需要使用form形式的
                    return null;
//                    return field.get(taobaoRequest) == null ? null : field.get(taobaoRequest).toString();
                }
                if(Constants.CONTENT_TYPE_JSON.equalsIgnoreCase(type)){
                    if("object".equalsIgnoreCase(bodyField.value()) || "list".equalsIgnoreCase(bodyField.value())){
                        if(field.get(taobaoRequest) != null){
                            hashMap.put(StringUtils.isEmpty(bodyField.fieldName()) ? field.getName() : bodyField.fieldName(), TaobaoUtils.jsonToObject(field.get(taobaoRequest).toString()));
                        }
                    }else{
                        if(field.get(taobaoRequest) != null){
                           hashMap.put(StringUtils.isEmpty(bodyField.fieldName()) ? field.getName() : bodyField.fieldName(), field.get(taobaoRequest).toString());
                        }
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        if(hashMap.size() == 0){
            return null;
        }
        return new JSONWriter(false, false, true).write(hashMap);
    }


    public static void main(String[] args) {
        String text = "{\"apiParams\": [\n" +
                "      {\n" +
                "        \"id\": 12,\n" +
                "        \"apiId\": 12,\n" +
                "        \"requireType\": \"REQUIRED\",\n" +
                "        \"name\": \"12\",\n" +
                "        \"inputType\": \"test\"\n" +
                "      }\n" +
                "    ]}";
        Object object = TaobaoUtils.jsonToObject(text);
        System.out.println(object.toString());
    }

}
