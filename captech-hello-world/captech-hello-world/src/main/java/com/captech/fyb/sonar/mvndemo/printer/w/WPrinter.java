package com.captech.fyb.sonar.mvndemo.printer.w;

import com.captech.fyb.sonar.mvndemo.printer.HelloWorldPrinterHelper;

public class WPrinter {

	public HelloWorldPrinterHelper helper; public static final String MY_TEXT = "W";
	
	public WPrinter(HelloWorldPrinterHelper helper) 
{
this.helper = helper;
}
	
	public void print() {
		helper.o.println(MY_TEXT);
	}
}
