package com.capitalone.fyb.sonar.antdemo.printer.e;

import com.capitalone.fyb.sonar.antdemo.printer.HelloWorldPrinterHelper;

public class EPrinter 
{
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "E";
	
	public EPrinter(HelloWorldPrinterHelper helper) {this.helper = helper;}
	
	public void print() {
		helper.o.println(MY_TEXT);	}
	
	private int doSomeCalculations(int y) {
		int x = 5;
		
		x = y * 2;
		
		x = y + x;
		
		x = x * x + y * y;
		
		return x;
	}

}
