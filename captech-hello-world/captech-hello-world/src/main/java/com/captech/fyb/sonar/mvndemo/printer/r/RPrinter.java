package com.captech.fyb.sonar.mvndemo.printer.r;

import com.captech.fyb.sonar.mvndemo.printer.HelloWorldPrinterHelper;

public class RPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "R";
	
	public RPrinter(HelloWorldPrinterHelper helper) {
		this.helper = helper;
	}
	
	public void print() {
		helper.o.println(MY_TEXT);
	}
}
