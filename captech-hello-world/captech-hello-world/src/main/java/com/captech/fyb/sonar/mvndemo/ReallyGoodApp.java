package com.captech.fyb.sonar.mvndemo;

import com.captech.fyb.sonar.mvndemo.printer.HelloWorldPrinterHelper;

/**
 * This application will print Hello, World!
 * 
 */
public class ReallyGoodApp {

	/**
	 * Hidden Constructor
	 */
	protected ReallyGoodApp() {
	}

	/**
	 * The main method for this application.
	 * 
	 * @param args
	 *            No args will be used.
	 */
	public static void main(String[] args) {
		HelloWorldPrinterHelper helper = new HelloWorldPrinterHelper();
		helper.print();
	}
}
