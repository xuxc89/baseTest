package com.xuxc.baseTest.proxy.classFile;

import com.xuxc.baseTest.proxy.bean.benz;
import com.xuxc.baseTest.proxy.handler.DynamicProxy;
import com.xuxc.baseTest.proxy.inteFace.car;
import org.junit.Test;

/**
 * Created by xuxc
 * since  2017/10/18 15:49.
 * version 1
 */

public class DynamicTest {

    @Test
    public void test() {
        car car = (car) DynamicProxy.factory(new benz());
        car.carSize();
//        car.power();
    }
}
