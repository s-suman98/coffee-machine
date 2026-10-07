package strategy;


public class Upipayment extends PaymentStrategy {


@Override
public Boolean pay () {
	
	System.out.println ("Paid using the card");
	
	return true;
	
}

}
