package com.xuxc.baseTest.type;

import org.junit.Test;

/**
 * Created by xuxc
 * since  2017/10/23 9:19.
 * version 1
 */

public class ByteTest {

    @Test
    public void test() {
        int i = 1;
        System.out.println("int :"+i);
        byte b = 'a';
        System.out.println("byte :"+b);
        byte b2 = (byte)(b-i);
        System.out.println("byte-int :" + b2);
        System.out.println("byte-int (byte) :" + (byte)(b-i));
        short s = 'a';
        System.out.println("short :"+s);
        System.out.println("short-int (short):" + (short)(s-i));

        long l = 1L;
        System.out.println("long :"+l);
        boolean bool = Boolean.TRUE;
        System.out.println("boolean :"+bool);
        float f = 1.1f;
        System.out.println("float :"+f);
        double d = 1.1;
        System.out.println("double :"+d);

        char c = 'a';
        System.out.println("char :"+c);
        System.out.println("char-int (char):" + (char)(c-i));
    }
}
