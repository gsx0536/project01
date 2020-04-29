package com.tieda.alarm.util.excel.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * excel注解定义
 *
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelField {

	/**
	 * 导出字段名（默认调用当前字段的“get”方法，如指定导出字段为对象，请填写“对象名.对象属性”，例：“area.name”、“office.name”）
	 */
	String value() default "";
	
	/**
	 * 导出字段标题（需要添加批注请用“**”分隔，标题**批注，仅对导出模板有效）
	 */
	String title();
	
	/**
	 * 字段类型（0：导出导入；1：仅导出；2：仅导入）
	 * 导入尚未开发
	 */
	int type() default 0;
	
	/**
	 * 导出字段字段排序（升序）
	 * 默认为100
	 */
	int sort() default 100;

	/**
	 * 先设置table,
	 * 如果是字典类型，请设置字典的dicttype值
	 */
	String dictType() default "";
	
	/**
	 * 与dicttype 对应，dict所在表
	 */
	String table() default "";

}
