package com.captech.fyb.sonar.mvndemo.printer.l;

import com.captech.fyb.sonar.mvndemo.printer.HelloWorldPrinterHelper;

public class LPrinter {
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "L";
	
	public LPrinter(HelloWorldPrinterHelper helper) {
		this.helper = helper;
	}
	
	public void print() {helper.o.println(MY_TEXT);	}
}
