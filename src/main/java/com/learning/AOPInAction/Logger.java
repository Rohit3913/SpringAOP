package com.learning.AOPInAction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class Logger {
	@Before("camsnap()")
	public void aboutToClickPhoto() {
		System.out.println("Say Cheezzzzzz");
	}

	@Pointcut("execution(void com.learning.AOPInAction.Camera.snap())")
	public void camsnap() {
	}
}
