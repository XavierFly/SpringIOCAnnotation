package com.xavier.demo2;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean1")
public class Bean1 {
    @PostConstruct
    private void init() {
        System.out.println("init");
    }

    public void say() {
        System.out.println("say");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("destroy");
    }
}
