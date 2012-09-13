package com.capitalone.fyb.sonar.antdemo;

import com.capitalone.fyb.sonar.antdemo.printer.HelloWorldPrinterHelper;

public class ReallyMediocreApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length > 0) {
			// do nothing.
		} else {
			(new HelloWorldPrinterHelper()).print();
		}
	}
}
