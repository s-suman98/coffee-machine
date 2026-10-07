package core;

import enums.Menu;
import lombok.Data;
import states.IdleState;
import states.StateI;
import strategy.PaymentStrategy;

import java.util.Arrays;
import java.util.List;

@Data
public class Machine {

private StateI state =new IdleState ();

private PaymentStrategy paymentStrategy;

private Menu selected;

private static Machine instance=new Machine ();

public static Machine getInstance(){
	
	return instance;
	
	
}


public List<Menu> getMenu(){
	
	return Arrays.asList (Menu.values ());
}


public void selectItem (Menu menu) {
	
	state.selectItem (this, menu);
}

public void makePayment () {
	state.makePayment (this);
}

public  void collectItem () {
	state.collectItem (this);
}

	
}
