package com.captech.fyb.sonar.runnerdemo.printer.e;

import com.captech.fyb.sonar.runnerdemo.printer.HelloWorldPrinterHelper;

public class EPrinter 
{
	public HelloWorldPrinterHelper helper;
	
	public static final String MY_TEXT = "E";
	
	public EPrinter(HelloWorldPrinterHelper helper) {this.helper = helper;}
	
	public void print() {
		helper.o.println(MY_TEXT);	}}
