package com.gnnt.gers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;


public class Property {

	public static void main(String[] args) throws IOException {
		System.out.println(new Date());
		InputStream ips = Enumeration.class.getResourceAsStream("/test.properties");
		Properties p = new Properties();
		p=System.getProperties();
		//p.load(ips);
		File file = new File("src/test");		
		PrintWriter out = new PrintWriter(file);
		
		
		LinkedList linkedList = new LinkedList();
		linkedList.add("1");
		linkedList.add("2");
		linkedList.add("3");
		
		Iterator iterator = linkedList.iterator();
		
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			out.println();
		}
		
		
		p.list(out);
		out.flush();
		out.close();
		System.out.println(file.getCanonicalPath());
		System.out.println(file.getAbsolutePath());
		System.out.println("--Memory Usage:");
		Runtime rt =Runtime.getRuntime();
		System.out.println("Total Memory = "+ rt.totalMemory() 
							+ " Free Memory = " +rt.freeMemory());
	}

}
