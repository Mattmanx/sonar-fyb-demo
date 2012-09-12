package com.captech.fyb.sonar.runnerdemo;

import com.captech.fyb.sonar.runnerdemo.printer.HelloWorldPrinterHelper;

public class ReallyBadApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		(new HelloWorldPrinterHelper()).print();
	}

}
