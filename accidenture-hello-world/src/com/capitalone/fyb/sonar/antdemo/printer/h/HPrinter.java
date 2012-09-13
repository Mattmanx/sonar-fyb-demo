package com.capitalone.fyb.sonar.antdemo.printer.h;

import com.capitalone.fyb.sonar.antdemo.printer.HelloWorldPrinterHelper;

public class HPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "H";
	
	public HPrinter(HelloWorldPrinterHelper helper) 
	
	{
		this.helper = helper;
	}
	
	public void print() { helper.o.println(MY_TEXT);}
	
	private int doSomeCalculations(int y) {
		int x = 5;
		
		x = y * 2;
		
		x = y + x;
		
		x = x * x + y * y;
		
		return x;
	}
}
