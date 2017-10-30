package com.xuxc.baseTest;

import org.junit.Test;

/**
 * Created by xuxc
 * since  2017/10/9 16:57.
 * version v1
 */

public class referent {
    @Test
    public void testStrongReferent() {
        Object object = new Object();
        System.out.println("object:"+object);
        Object storgReferent = object;
        System.out.println("storgReferent:"+storgReferent);

        object = null;
        System.out.println("object:"+object);
        System.out.println("storgReferent:"+storgReferent);
        System.gc();
        System.out.println("System.gc()-------------");
        System.out.println("object:"+object);
        System.out.println("storgReferent:"+storgReferent);
    }
}
