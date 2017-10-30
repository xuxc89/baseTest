package com.xuxc.baseTest.abstractClass;

/**
 * Created by xxc on 2017/9/27.
 */
public abstract class toStatic {
    /**
     * default 只可以在接口中声明
     * 声明为抽象的方法不能同时声明为 default（默认实现）或 static（静态）
     */
//    default abstract void dosomething();

    /**
     * 不能同时声明为abstract（抽象）与native（本地的）
     */
//    public abstract native void testNative();
}
