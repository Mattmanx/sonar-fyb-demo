package com.captech.fyb.sonar.runnerdemo.printer.h;

import com.captech.fyb.sonar.runnerdemo.printer.HelloWorldPrinterHelper;

public class HPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "H";
	
	public HPrinter(HelloWorldPrinterHelper helper) 
	
	{
		this.helper = helper;
	}
	
	public void print() { helper.o.println(MY_TEXT);}
}
