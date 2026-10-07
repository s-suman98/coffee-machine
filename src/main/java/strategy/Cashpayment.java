package strategy;


import enums.PaymentType;

public class Cashpayment extends PaymentStrategy {



@Override
public Boolean pay () {
	
	System.out.println ("Paid using the card");
	
	return true;
	
}
	
}
