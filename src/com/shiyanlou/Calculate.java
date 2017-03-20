package com.shiyanlou;


public class Calculate implements Runnable {
	
	private static volatile long seedUniquifier = 8682522807148012L;
	 
	@Override
	public void run() {
		
	}
	
	public static void main(String[] args) {
		while(true){
			try {
				System.out.println(++seedUniquifier+System.nanoTime());
				System.out.println(Math.random());
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
