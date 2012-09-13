package com.captech.fyb.sonar.mvndemo.printer;

import java.io.PrintStream;

/**
 * Class to create a PrintStream and delegate printing duties to a printer.
 * 
 * @author mmehalso
 * 
 */
public class HelloWorldPrinterHelper {

	/**
	 * The static text to print 'Hello, World!'.
	 */
	private static final String HELLO_WORLD = "Hello, World!";

	/**
	 * The PrintStream to use.
	 */
	private PrintStream o = System.out;

	/**
	 * Prints "hello world"
	 */
	public void print() {
		o.print(HELLO_WORLD);
	}

}
