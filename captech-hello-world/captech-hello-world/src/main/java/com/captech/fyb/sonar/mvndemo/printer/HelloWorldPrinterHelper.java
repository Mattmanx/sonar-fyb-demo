package com.captech.fyb.sonar.mvndemo.printer;

import java.io.PrintStream;

/**
 * Class to create a PrintStream and delegate printing duties to a printer.
 * 
 * @author mmehalso
 * 
 */
public class HelloWorldPrinterHelper {

	public PrintStream o = System.out;

	public LetterPrinter hPrinter;
	public LetterPrinter ePrinter;
	public LetterPrinter lPrinter;
	public LetterPrinter oPrinter;
	public LetterPrinter wPrinter;
	public LetterPrinter rPrinter;
	public LetterPrinter dPrinter;

	/**
	 * Default constructor.
	 */
	public HelloWorldPrinterHelper() {
		hPrinter = new LetterPrinter("h", o);
		ePrinter = new LetterPrinter("e", o);
		lPrinter = new LetterPrinter("l", o);
		oPrinter = new LetterPrinter("o", o);
		wPrinter = new LetterPrinter("w", o);
		rPrinter = new LetterPrinter("r", o);
		dPrinter = new LetterPrinter("d", o);
	}

	/**
	 * Prints "hello world"
	 */
	public void print() {
		hPrinter.print();
		ePrinter.print();
		lPrinter.print();
		lPrinter.print();
		oPrinter.print();
		o.print(" ");
		wPrinter.print();
		oPrinter.print();
		rPrinter.print();
		lPrinter.print();
		dPrinter.print();

	}

}
