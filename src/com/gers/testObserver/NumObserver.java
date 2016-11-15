package com.gers.testObserver;

import java.util.Observable;
import java.util.Observer;

/**
 * �۲���ģʽ-�۲���
 * @author Administrator
 *
 */
public class NumObserver implements Observer {
	
	
	
	/**
	 * ���췽������ ���۲�Ķ��� NumObservable
	 * @param numObservable
	 */
	public NumObserver(NumObservable numObservable) {
		//����ǰ��(�۲���)�����Ϊ���۲�Ĺ۲��ߡ�
		numObservable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		if ("1".equals(arg)) {
			System.out.println("���۲���data_one�����ı�,�仯Ϊ: " +((NumObservable)o).getData_one());
		}else if("2".equals(arg)){
			System.out.println("���۲���data_two�����ı�,�仯Ϊ: " +((NumObservable)o).getData_two());
		}else {
			System.out.println("���۲����б��������仯���仯Ϊ");
		} 
		
	}

}
