package com.gers.testObserver;

import java.util.Observable;
/**
 * �۲���ģʽ-���۲�����.
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
		//֪ͨ�۲��ߣ��÷���ֻ����setChanged()������֮��Ż�֪ͨ�۲��ߣ�����ʲô������
		//super.notifyObservers();
		//�������ķ�������������ΪObject ,���޲η���������ͬʱʹ��
		super.notifyObservers("2");
	}

	public int getData_one() {
		return data_one;
	}

	public void setData_one(int data_one) {
		this.data_one = data_one;
		//���۲��߷����ı�
		super.setChanged();
		//֪ͨ�۲��ߣ��÷���ֻ����setChanged()������֮��Ż�֪ͨ�۲��ߣ�����ʲô������
		//super.notifyObservers();
		//�������ķ�������������ΪObject 
		super.notifyObservers("1");
	}
}
