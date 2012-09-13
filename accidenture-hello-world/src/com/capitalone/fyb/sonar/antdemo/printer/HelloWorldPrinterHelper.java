/**
 * 
 */
package com.capitalone.fyb.sonar.antdemo.printer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.capitalone.fyb.sonar.antdemo.printer.d.DPrinter;
import com.capitalone.fyb.sonar.antdemo.printer.e.EPrinter;
import com.capitalone.fyb.sonar.antdemo.printer.h.HPrinter;
import com.capitalone.fyb.sonar.antdemo.printer.l.LPrinter;
import com.capitalone.fyb.sonar.antdemo.printer.o.OPrinter;
import com.capitalone.fyb.sonar.antdemo.printer.r.RPrinter;
import com.capitalone.fyb.sonar.antdemo.printer.w.WPrinter;

/**
 * @author mmehalso
 *
 */
public class HelloWorldPrinterHelper {

	public PrintStream o = System.out;
	
	public HPrinter hPrinter;
	public EPrinter ePrinter;
	public LPrinter lPrinter;
	public OPrinter oPrinter;
	public WPrinter wPrinter;
	public RPrinter rPrinter;
	public DPrinter dPrinter;
	
	public HelloWorldPrinterHelper() {
		hPrinter = new HPrinter(this); ePrinter = new EPrinter(this); lPrinter = new LPrinter(this); 
		oPrinter = new OPrinter(this); wPrinter = new WPrinter(this); rPrinter =
			new RPrinter(this); dPrinter = new DPrinter(this);
	}
	
	public int print() {
		List print_order = new ArrayList();
		print_order.add(hPrinter);
		print_order.add(ePrinter);
		print_order.add(lPrinter);
		print_order.add(lPrinter);
		print_order.add(oPrinter);
		print_order.add(wPrinter);
		print_order.add(oPrinter);
		print_order.add(rPrinter);
		print_order.add(lPrinter);
		print_order.add(dPrinter);
		
		PrintH(print_order);
		PrintE(print_order);
		PrintL1(print_order);
		PrintL2(print_order);
		PrintO1(print_order);
		PrintSpace(print_order);
		PrintW(print_order);
		PrintO2(print_order);
		PrintR(print_order);
		PrintL3(print_order);
		PrintD(print_order);	
		
		return 1;
	}
	
	public void PrintH(List print_order) {
		((HPrinter) print_order.get(0)).print();
	}
	
	public void PrintE(List print_order) {
		((EPrinter) print_order.get(1)).print();
	}
	
	public void PrintL1(List print_order) {
		((LPrinter) print_order.get(2)).print();
	}
	
	public void PrintL2(List print_order) {
		((LPrinter) print_order.get(3)).print();
	}
	
	public void PrintO1(List print_order) {
		((OPrinter) print_order.get(4)).print();
	}
	
	public void PrintSpace(List print_order) {
		o.println(" ");
	}
	
	public void PrintW(List print_order) {
		((WPrinter) print_order.get(5)).print();
	}
	
	public void PrintO2(List print_order) {
		((OPrinter) print_order.get(6)).print();
	}
	
	public void PrintR(List print_order) {
		((RPrinter) print_order.get(7)).print();
	}
	
	public void PrintL3(List print_order) {
		((LPrinter) print_order.get(8)).print();
	}
	
	public void PrintD(List print_order) {
		((DPrinter) print_order.get(9)).print();
	}
	
	private int doSomeCalculations(int y) {
		int x = 5;
		
		x = y * 2;
		
		x = y + x;
		
		x = x * x + y * y;
		
		return x;
	}
}
