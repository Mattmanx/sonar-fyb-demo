package com.captech.fyb.sonar.runnerdemo.printer.w;

import com.captech.fyb.sonar.runnerdemo.printer.HelloWorldPrinterHelper;

public class WPrinter {

	public HelloWorldPrinterHelper helper; public static final String MY_TEXT = "W";
	
	public WPrinter(HelloWorldPrinterHelper helper) 
{
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
