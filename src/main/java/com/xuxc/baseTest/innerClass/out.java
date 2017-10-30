package com.xuxc.baseTest.innerClass;

import org.junit.Test;

/**
 * Created by xuxc
 * since  2017/10/19 16:47.
 * version 1
 */

public class out {
    public out() {
        System.out.println("out class");
    }
    public void dosomething() {
        System.out.println("do");
    }

    public class in {
        public out getoutClass() {
            return out.this;
        }

        public void dosome() {
            dosomething();
        }
    }

    /**
     * 外部类创建内部类
     * 内部对象调用外部方法
     */
    @Test
    public void test() {
        out out1 = new out();
        out.in in = out1.new in();
        in.getoutClass().dosomething();
        in.dosome();
    }
}

//class testclass{
//    @Test
//    public void test() {
//        out out1 = new out();
//        out.in in = out1.new in();
//        in.getoutClass().dosomething();
//    }
//}
