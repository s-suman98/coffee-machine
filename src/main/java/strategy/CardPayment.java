package strategy;

import enums.PaymentType;

public class CardPayment extends PaymentStrategy {


public CardPayment (PaymentType paymentType) {
	super (paymentType);
}

@Override
public Boolean pay () {
	
	System.out.println ("Paid using the card");
	
	return true;
	
}

}
