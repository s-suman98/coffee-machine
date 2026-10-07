package states;

import core.Machine;
import enums.Menu;
import exception.MachineException;

public class IdleState implements StateI{
@Override
public void selectItem (Machine machine , Menu menu) {

System.out.println ("Item selected"+menu);

   machine.setSelected (menu);
   
   machine.setState (new ItemSelectedState ());

}

@Override
public void makePayment (Machine machine) {
	
	throw  new MachineException ("payment cant be made in the idel state first delcet the product");

}

@Override
public void collectItem (Machine machine) {
	
	throw  new MachineException ("first select and make paymenet");
	
	
}
}
