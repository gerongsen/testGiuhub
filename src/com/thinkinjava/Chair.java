package com.thinkinjava;

import org.eclipse.jdt.internal.compiler.ast.SuperReference;

public class Chair {
	static boolean gcrun = false;
	static boolean f = false;
	static int created = 0;
	static int finalized = 0;
	int i;
	
	public Chair() {
		i = ++created;
		System.out.println(i);
		System.out.println(created);
		if (created==47) {
			System.out.println("created 47 ");
		}
	}
	
	protected void finalize() {
		
		if (!gcrun) {
			gcrun = true;
			System.out.println("Beginning to finalize after "+created+" Chairs have been created");
			
		}
		
		if (i==47) {
			System.out.println("finalizing Chair #47 , Setting flag to stop Chair creation ");
			f = true;
		}
		
		finalized++;
		
		if (finalized >= created) {
			System.out.println(" All "+finalized+" finalized ");
		}
	}
	
}
