package com.example.interview.interceptor;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author xiaolei
 * @Title: TestInterceptor1
 * @ProjectName interview
 * @Description: TODO
 * @date 2019/9/130:01   
 */
@Component
@Aspect
@Slf4j
public class TestInterceptor1 {
//    @Pointcut("execution(public * com.example.interview.controller.*.*(..))")
    @Pointcut("@annotation(com.example.interview.annotation.ApiDescription) && @annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void pointCut(){
        log.info("\n-----------------before:");

    }

    @Before(value = "pointCut()")
    public void before(JoinPoint joinPoint){
        log.info("\n-----------------before:{}", joinPoint);
        log.info("\n-----------------before:{}", joinPoint);
        Signature sig = joinPoint.getSignature();
        MethodSignature msig = null;
        if (!(sig instanceof MethodSignature)) {
            throw new IllegalArgumentException("该注解只能用于方法");
        }
        msig = (MethodSignature) sig;
        Object target = joinPoint.getTarget();
        try {
            Method currentMethod = target.getClass().getMethod(msig.getName(), msig.getParameterTypes());
            log.info("\ncurrentMethod=================={}", JSON.toJSONString(currentMethod));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    @After(value = "pointCut()")
    public void after(JoinPoint joinPoint){
        log.info("\n-----------------after：{}", joinPoint);
    }
}
