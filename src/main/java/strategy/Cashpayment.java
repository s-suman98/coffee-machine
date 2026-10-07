package strategy;


import enums.PaymentType;

public class Cashpayment extends PaymentStrategy {


public Cashpayment (PaymentType paymentType) {
	super (paymentType);
}

@Override
public Boolean pay () {
	
	System.out.println ("Paid using the card");
	
	return true;
	
}
	
}
