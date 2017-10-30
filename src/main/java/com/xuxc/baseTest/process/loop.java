package com.xuxc.baseTest.process;

import org.junit.Test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 跳转标记
 * Created by xuxc
 * since  2017/10/19 14:59.
 * version v1
 */

public class loop {

    @Test
    public void test() {
        int i = 0;
        int j = 0;

        for(;i<10;i++) {
            for(;j<5;j++) {
                break;
            }
        }
        System.out.println("添加标记前");
        System.out.println(i);
        System.out.println(j);

        i = 0;
        j = 0;
        loop: for(;i<10;i++) {
            for(;j<5;j++) {
                break loop;
            }
        }
        System.out.println("添加标记后");
        System.out.println(i);
        System.out.println(j);
    }

}
