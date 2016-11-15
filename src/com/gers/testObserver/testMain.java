package com.gers.testObserver;

public class testMain {

	public static void main(String[] args) {
		NumObservable doc = new NumObservable();
		NumObserver view = new NumObserver(doc);
		doc.setData_one(1);
		doc.setData_one(2);
		doc.setData_one(2);
		doc.setData_one(3);
		doc.setData_one(4);
		
		doc.setData_two(11);
		doc.setData_two(22);
		doc.setData_two(22);
		doc.setData_two(33);
		doc.setData_two(44);
	}
}
