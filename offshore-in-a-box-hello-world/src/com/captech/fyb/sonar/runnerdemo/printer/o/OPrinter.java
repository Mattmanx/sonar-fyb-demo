package com.captech.fyb.sonar.runnerdemo.printer.o;

import com.captech.fyb.sonar.runnerdemo.printer.HelloWorldPrinterHelper;

public class OPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "O";
	
	public OPrinter(HelloWorldPrinterHelper helper) {
		this.helper = helper;
	}
	
	public void print() {	helper.o.println(MY_TEXT);	}
}
