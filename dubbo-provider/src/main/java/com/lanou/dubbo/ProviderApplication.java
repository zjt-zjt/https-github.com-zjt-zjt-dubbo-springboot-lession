package com.lanou.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderApplication {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.start();
        ctx.registerShutdownHook();

        System.out.println("Provider启动完成");

        // 阻塞当前应用，直到输入任意字符后才退出
        System.in.read();


    }
}
