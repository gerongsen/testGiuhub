package com.gers.singleton;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		Thread tone = test.new ThreadOne();
		Thread ttwo = test.new ThreadTwo();
		Thread t1 = new Thread(tone);
		Thread t2 = new Thread(ttwo);
		t1.start();
		t2.start();
	}
	
	class ThreadOne extends Thread{
		@Override
		public void run() {
			for(;;){
				TestSingleton.getInstance();
				System.out.println("1");
			}
		}
	}
	
	class ThreadTwo extends Thread{
		public void run() {
			for(;;){
				TestSingleton.getInstance();
				System.out.println(2);
			}
		}
	}
}
