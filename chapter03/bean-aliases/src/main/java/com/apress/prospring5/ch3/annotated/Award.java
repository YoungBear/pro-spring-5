package com.apress.prospring5.ch3.annotated;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * Created by iuliana.cosmina on 2/19/17.
 * prize和value互为别名 使用 @AliasFor
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Award {

	@AliasFor("prize")
	String[] value() default {};

	@AliasFor("value")
	String[] prize() default {};
}
