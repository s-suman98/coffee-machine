package strategy;



import enums.PaymentType;

public class Upipayment extends PaymentStrategy {


public Upipayment (PaymentType paymentType) {
	super (paymentType);
}

@Override
public Boolean pay () {
	
	System.out.println ("Paid using the card");
	
	return true;
	
}

}
