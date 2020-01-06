
package com.lanou.dubbo.service.impl;


import com.lanou.dubbo.service.ICalcService;

public class CalcServiceImpl implements ICalcService {
    public int plus(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }

    public int minus(int num1, int num2) {
        int result = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }
}
