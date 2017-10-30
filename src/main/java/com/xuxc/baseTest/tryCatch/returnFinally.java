package com.xuxc.baseTest.tryCatch;

import org.junit.Test;

/**
 * Created by xuxc
 * since  2017/9/27 10:56.
 * version 1
 */

public class returnFinally {

    /**
     * 测试结果一：finally一定会运行
     * 测试结果二：finally会在return之后运行
     *              或者说return结果返回之后程序阻塞
     *              回归运行finally中代码
     * 测试结果三：在finally中如果还有一个return
     *              返回结果会覆盖原返回结果
     * @return
     */
    public int returnFially() {
        int i =1;
        int j = 9;
        try {
            return i;
        }finally{
            System.out.println("in finally");
            i++;
            System.out.println("returnFially return " +i);
            return j;
        }
    }

    @Test
    public void doTest() {
        System.out.print(returnFially());
    }
}
