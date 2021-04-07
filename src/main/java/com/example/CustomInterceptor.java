package com.example;

import io.micronaut.aop.InterceptorBean;
import io.micronaut.aop.InvocationContext;
import io.micronaut.aop.MethodInterceptor;
import io.micronaut.aop.MethodInvocationContext;
import io.micronaut.context.annotation.Prototype;

@Prototype
//@InterceptorBean(CustomAdvice.class)
public class CustomInterceptor implements MethodInterceptor<HomeController, Object> {

	@Override
	public Object intercept(InvocationContext<HomeController, Object> context) {
		System.out.println("INTERCEPTED InvocationContext");
		return context.proceed();
	}

	@Override
	public Object intercept(MethodInvocationContext<HomeController, Object> context) {
		System.out.println("INTERCEPTED MethodInvocationContext");
		return context.proceed();
	}
}
