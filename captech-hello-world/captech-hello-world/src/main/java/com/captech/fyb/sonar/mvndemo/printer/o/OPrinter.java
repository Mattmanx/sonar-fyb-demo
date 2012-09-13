package com.captech.fyb.sonar.mvndemo.printer.o;

import com.captech.fyb.sonar.mvndemo.printer.HelloWorldPrinterHelper;

public class OPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "O";
	
	public OPrinter(HelloWorldPrinterHelper helper) {
		this.helper = helper;
	}
	
	public void print() {	helper.o.println(MY_TEXT);	}
}
