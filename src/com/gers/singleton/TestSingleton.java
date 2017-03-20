package com.gers.singleton;

public class TestSingleton {

	/**
	 * 1.����ʽд�����޷���֤�̰߳�ȫ
	 */
	/*
	private static TestSingleton singleton;
	//˽�еĹ��췽��ֻ���Լ��ܷ���
	private TestSingleton(){
		
	}
	public static TestSingleton getInstance() {
		//�˴��޷���֤�̰߳�ȫ
		if(singleton==null){
			singleton = new TestSingleton();
		}
		return singleton;
	}
	*/
	/**
	 * 1.1����ʽ���֣��Է�������synchronized �ؼ��֣�
	 * ���Խ�����̵߳ķ������⣬�����ڸ߲�������»�����Ӱ������
	 */
	/*
	private static TestSingleton singleton;
	//˽�еĹ��췽��ֻ���Լ��ܷ���
	private TestSingleton(){
		
	}
	public static synchronized TestSingleton getInstance() {
		//�˴��޷���֤�̰߳�ȫ
		if(singleton==null){
			singleton = new TestSingleton();
		}
		return singleton;
	}*/
	
	/**
	 * 2.˫�ؼ����
	 */
	/*
	//volatile �ؼ��� ��֤ÿ���߳���ȡ���ֵ�Ƕ���ȡ��������ֵ
	private static volatile TestSingleton singleton;
	//˽�еĹ��췽��ֻ���Լ��ܷ���
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
	 * 3.��̬�ڲ��෽ʽ
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
