package com.gers.singleton;

public class TestSingleton {

	/**
	 * 1.懒汉式写法，无法保证线程安全
	 */
	/*
	private static TestSingleton singleton;
	//私有的构造方法只有自己能访问
	private TestSingleton(){
		
	}
	public static TestSingleton getInstance() {
		//此处无法保证线程安全
		if(singleton==null){
			singleton = new TestSingleton();
		}
		return singleton;
	}
	*/
	/**
	 * 1.1懒汉式变种，对方法增加synchronized 关键字，
	 * 可以解决多线程的访问问题，但是在高并发情况下会严重影响性能
	 */
	/*
	private static TestSingleton singleton;
	//私有的构造方法只有自己能访问
	private TestSingleton(){
		
	}
	public static synchronized TestSingleton getInstance() {
		//此处无法保证线程安全
		if(singleton==null){
			singleton = new TestSingleton();
		}
		return singleton;
	}*/
	
	/**
	 * 2.双重检查锁
	 */
	/*
	//volatile 关键字 保证每个线程在取这个值是都是取到的最新值
	private static volatile TestSingleton singleton;
	//私有的构造方法只有自己能访问
	private TestSingleton() {
	}
	public static TestSingleton getInstance() {
		if(singleton==null){
			synchronized(TestSingleton.class){
				if(singleton==null){
					singleton = new TestSingleton();
				}
			}
		}
		return singleton;
	}*/
	
	/**
	 * 3.静态内部类方式
	 */
	private TestSingleton() {
	}
	public static TestSingleton getInstance() {
		return TestSingletonHolder.INSTANCE;
	}
	private static class TestSingletonHolder{
		private static final TestSingleton INSTANCE = new TestSingleton();
	}
	
}
