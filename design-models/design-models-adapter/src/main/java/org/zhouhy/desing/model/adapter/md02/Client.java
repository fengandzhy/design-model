package org.zhouhy.desing.model.adapter.md02;

import org.zhouhy.desing.model.adapter.md02.adaptee.Adaptee;
import org.zhouhy.desing.model.adapter.md02.adapter.Adapter;
import org.zhouhy.desing.model.adapter.md02.target.Target;

public class Client {

	public static void main(String[] args) {
		Adaptee adaptee = new Adaptee();
		Target target = new Adapter(adaptee);
		target.targetMethod1();
		target.targetMethod2();

	}

}
