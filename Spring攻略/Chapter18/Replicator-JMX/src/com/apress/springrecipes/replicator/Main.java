package com.apress.springrecipes.replicator;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        new ClassPathXmlApplicationContext("beans.xml");
        System.in.read();
    }
}
