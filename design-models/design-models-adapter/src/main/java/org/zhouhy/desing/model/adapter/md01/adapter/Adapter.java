package org.zhouhy.desing.model.adapter.md01.adapter;

import org.zhouhy.desing.model.adapter.md01.adaptee.Adaptee;
import org.zhouhy.desing.model.adapter.md01.target.Target;

/**
 * ¿‡  ≈‰∆˜
 * */
public class Adapter extends Adaptee implements Target{

	@Override
	public void targetMethod1() {
		System.out.println("Adapter targetMethond1 invoked!");
		methodA();
	}

	@Override
	public void targetMethod2() {
		System.out.println("Adapter targetMethond2 invoked!");
		methodB();
	}
	
}
