package com.captech.fyb.sonar.runnerdemo.printer.d;

import com.captech.fyb.sonar.runnerdemo.printer.HelloWorldPrinterHelper;

public class DPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "D";
	
	public DPrinter(HelloWorldPrinterHelper helper) {
		this.helper = helper;
	}
	
	public void print() {
		helper.o.println(MY_TEXT);
	}
}
