
package states;

import core.Machine;
import enums.Menu;
import exception.MachineException;

public class ItemSelectedState implements StateI{
@Override
public void selectItem (Machine machine, Menu menu) {
	throw  new MachineException ("item is alrredy selected");
	
	
}

@Override
public void makePayment (Machine machine) {
	
	machine.setState (new PayemntReceivedState ());
	
	machine.setState (new Brewing ());

}

@Override
public void collectItem (Machine machine) {
	throw  new MachineException ("first make payment then you can collect");
	
	
}
}
