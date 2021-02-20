package com.geekbrains.aop;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MethodCounter {
    private int counter;

    public void count() {
        counter++;
    }
    public int getCounter() {
        return counter;
    }
}
