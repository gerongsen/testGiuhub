package com.gers.testObserver;

import java.util.Observable;
/**
 * 观察者模式-被观察者类.
 * @author gers@gnnt.com.cn
 *
 */
public class NumObservable extends Observable{
	int data_one = 0;
	int data_two = 0; 
	

	public int getData_two() {
		return data_two;
	}

	public void setData_two(int data_two) {
		this.data_two = data_two;
		super.setChanged();
		//通知观察者，该方法只有在setChanged()被调用之后才会通知观察者，否则什么都不做
		//super.notifyObservers();
		//带参数的方法，参数类型为Object ,与无参方法不可以同时使用
		super.notifyObservers("2");
	}

	public int getData_one() {
		return data_one;
	}

	public void setData_one(int data_one) {
		this.data_one = data_one;
		//被观察者发生改变
		super.setChanged();
		//通知观察者，该方法只有在setChanged()被调用之后才会通知观察者，否则什么都不做
		//super.notifyObservers();
		//带参数的方法，参数类型为Object 
		super.notifyObservers("1");
	}
}
