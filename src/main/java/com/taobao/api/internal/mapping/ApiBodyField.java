package com.taobao.api.internal.mapping;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 给body参数打标
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(value = { ElementType.FIELD })
public @interface ApiBodyField {

	/** JSON属性映射名称 **/
	String value() default "";

	/**
	 * map字段名
	 * @return
	 */
	String fieldName() default "";

}
