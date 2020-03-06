package org.zhouhy.desing.model.md01;

import org.zhouhy.desing.model.md01.adapter.Adapter;
import org.zhouhy.desing.model.md01.target.Target;

public class Client {
	
	public static void main(String[] args) {
		Target target = new Adapter();
		target.targetMethond1();
		target.targetMethod2();
	}

}
