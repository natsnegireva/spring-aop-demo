package com.geekbrains.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SimpleAspect {
    private int counterMax = 0;
    private int counter;

    @Pointcut("execution(* com.geekbrains.aop.*.*(..))")
    private void getCounter() {
    }

    @After("getCounter()")
    public int logAfter(JoinPoint joinPoint) {
        if(counter > counterMax) {
            System.out.println("Метод " + getClass().getName() + " вызывался больше всех = " + counter + " раз");
            counterMax = counter;
        }
        return counterMax;
    }
}

