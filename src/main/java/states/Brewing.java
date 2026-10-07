package states;

import core.Machine;
import enums.Menu;
import exception.MachineException;

public class Brewing implements StateI {
@Override
public void selectItem (Machine machine, Menu menu) {
	throw new MachineException ("No use interaction required here");

}

@Override
public void makePayment (Machine machine) {
	throw new MachineException ("No use interaction required here");

}

@Override
public void collectItem (Machine machine) {
	
	System.out.println("Your"+machine.getSelected ()+ "is ready");
	
	
	System.out.println(machine.getSelected ()+ " is collected by user");
	
	machine.setState (new IdleState ());
	
	

}
}
