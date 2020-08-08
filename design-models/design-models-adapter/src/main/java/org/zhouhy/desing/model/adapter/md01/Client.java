package org.zhouhy.desing.model.adapter.md01;

import org.zhouhy.desing.model.adapter.md01.adapter.Adapter;
import org.zhouhy.desing.model.adapter.md01.target.Target;

public class Client {
	
	public static void main(String[] args) {
		Target target = new Adapter();
		target.targetMethod1();
		target.targetMethod2();
	}

}
