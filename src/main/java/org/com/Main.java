package org.com;

import core.Machine;
import enums.Menu;
import strategy.CardPayment;
import strategy.Upipayment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String[] args) {
	
	
	Machine coffeemachine =new Machine ();
	 coffeemachine.setPaymentStrategy (new Upipayment ());
	 
	  coffeemachine.getMenu ();
	  
	  
	  coffeemachine.selectItem (Menu.COFFEE);
	  
//	  coffeemachine.makePayment ();
	  
	  coffeemachine.collectItem ();
	 
	 
}
}