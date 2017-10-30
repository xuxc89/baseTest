package com.xuxc.baseTest.InteFace;

public interface InteFace {
	static int returnInt(int i) {
		return i;
	}

	default void doSomeThing() {
		System.out.println("just do it");
	}
	void notAFunction();
}
