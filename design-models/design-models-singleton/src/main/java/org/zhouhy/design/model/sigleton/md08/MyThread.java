package org.zhouhy.design.model.sigleton.md08;



public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println(Singleton8.getInstance().hashCode());
	}
	
	public static void main(String args[]) {
		MyThread[] mts = new MyThread[100];
		for(int i=0;i<mts.length;i++) {
			mts[i] = new MyThread();
		}		
		for(int i=0;i<mts.length;i++) {
			mts[i].start();
		}		
	}
	
}
