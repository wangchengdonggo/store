package com.wcd.store.system.query.annotations;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 标识实体对象(Entity)的字段
 * 自动封装Specification时将该字段解析为大于查询
 * 通常用于开始时间，比较对象target应为实体对象中的游离（@Transient）对象或自身
 * @author jiawei
 *
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface QueryGreaterThan {
	/**
	 * 所比较的字段名，需要用@Transient注解标记
	 * @return
	 */
	@AliasFor("value")
	String target() default "";
	@AliasFor("target")
	String value() default "";
}
