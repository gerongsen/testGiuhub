package com.gnnt.gers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;


public class Property {

	public static void main(String[] args) throws IOException {
		System.out.println(new Date());
		InputStream ips = Enumeration.class.getResourceAsStream("/test.properties");
		Properties p = new Properties();
		/*p=System.getProperties();*/
		p.load(ips);
		System.out.println(p.get("1"));
		
		PrintWriter out = new PrintWriter(new FileWriter("/test.txt"),true);

		Math.random();
		p.list(out);
		
		out.close();
		
		System.out.println("--Memory Usage:");
		Runtime rt =Runtime.getRuntime();
		System.out.println("Total Memory = "+ rt.totalMemory() 
							+ " Free Memory = " +rt.freeMemory());
	}

}
