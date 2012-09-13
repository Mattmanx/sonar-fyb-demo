package com.capitalone.fyb.sonar.antdemo.printer.r;

import com.capitalone.fyb.sonar.antdemo.printer.HelloWorldPrinterHelper;

public class RPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "R";
	
	public RPrinter(HelloWorldPrinterHelper helper) {
		this.helper = helper;
	}
	
	public void print() {
		helper.o.println(MY_TEXT);
	}
	
	private int doSomeCalculations(int y) {
		int x = 5;
		
		x = y * 2;
		
		x = y + x;
		
		x = x * x + y * y;
		
		return x;
	}
}
