package com.gers.testObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者模式-观察者
 * @author Administrator
 *
 */
public class NumObserver implements Observer {
	
	
	
	/**
	 * 构造方法传入 被观察的对象 NumObservable
	 * @param numObservable
	 */
	public NumObserver(NumObservable numObservable) {
		//将当前类(观察者)，添加为被观察的观察者。
		numObservable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		if ("1".equals(arg)) {
			System.out.println("被观察者data_one发生改变,变化为: " +((NumObservable)o).getData_one());
		}else if("2".equals(arg)){
			System.out.println("被观察者data_two发生改变,变化为: " +((NumObservable)o).getData_two());
		}else {
			System.out.println("被观察者有变量发生变化，变化为");
		} 
		
	}

}
