package spring.aop.pointCutAdvisor.smartProxyCreator.defaultProxyCreator.bean;

import java.lang.reflect.Method;		

import org.springframework.aop.AfterReturningAdvice;

public class AfterAdvice implements AfterReturningAdvice{

	@Override
	public void afterReturning(Object returnValue, Method method,
			Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		if(returnValue!=null){
			System.out.println("afterReturning returnVale : "+((String)returnValue).toUpperCase());
		}
	}

}
