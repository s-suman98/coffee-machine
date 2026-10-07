


package states;

import core.Machine;
import enums.Menu;
import exception.MachineException;

public class PayemntReceivedState implements StateI {
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
	throw new MachineException ("No use interaction required here");

}
}
