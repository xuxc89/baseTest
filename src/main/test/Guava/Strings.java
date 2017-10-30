package Guava;


import org.junit.Test;

/**
 * Created by xuxc
 * since  2017/10/27 11:41.
 * version 1
 */

public class Strings {

    /**
     * 截取自前缀不在相同的地方
     */
    @Test
    public void commonPrefix() {
//        com.google.common.base.Strings.commonSuffix();
        String a = "com.jd.coo.Hello";
        String b = "com.jd.coo.Hi";
        String ourCommonPrefix = com.google.common.base.Strings.commonPrefix(a,b);
        System.out.println("a,b common prefix is " + ourCommonPrefix);
    }
}
