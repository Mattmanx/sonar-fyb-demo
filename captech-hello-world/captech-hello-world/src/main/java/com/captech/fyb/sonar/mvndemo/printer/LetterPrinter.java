package com.captech.fyb.sonar.mvndemo.printer;

import java.io.PrintStream;

/**
 * A class to print a letter on a PrintStream.
 * 
 * @author mmehalso
 * 
 */
public class LetterPrinter {

	private String letter;
	private PrintStream outputStream;

	/**
	 * Parameterized constructor, providing the letter and output stream.
	 * 
	 * @param letter
	 *            - a letter to print.
	 * @param outputStream
	 *            - the print stream on which to print my letter.
	 */
	public LetterPrinter(String letter, PrintStream outputStream) {
		this.letter = letter;
		this.outputStream = outputStream;
	}

	/**
	 * Prints the injected letter.
	 */
	public void print() {
		outputStream.print(letter);
	}
}
