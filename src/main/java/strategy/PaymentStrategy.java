package strategy;

import enums.PaymentType;

public abstract class  PaymentStrategy {

  private PaymentType paymentType;
  
   public PaymentStrategy(PaymentType paymentStrategy){
	   this.paymentType=paymentStrategy;
   };
	
	  abstract Boolean pay ();
}
