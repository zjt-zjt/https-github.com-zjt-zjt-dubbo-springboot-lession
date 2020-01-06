package com.lanou.dobbo;


import com.lanou.dubbo.service.ICalcService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ctx.registerShutdownHook();
        ctx.start();

        ICalcService calcService = ctx.getBean("calcService", ICalcService.class);
        int result = calcService.plus(41, 29);
        System.out.println("调用远程服务计算结果：" + result);


        System.in.read();
    }
}
