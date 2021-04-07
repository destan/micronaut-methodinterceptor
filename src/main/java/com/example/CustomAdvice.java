package com.example;

import io.micronaut.aop.Around;
import io.micronaut.aop.Introduction;
import io.micronaut.context.annotation.Type;
import io.micronaut.core.annotation.Internal;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

//@Around
//@Documented
@Retention(RUNTIME)
@Introduction
@Type(CustomInterceptor.class)
@Internal
@interface CustomAdvice {

}