package states;

import core.Machine;
import enums.Menu;

public interface StateI {

void selectItem(Machine machine, Menu menu);
void makePayment(Machine machine);
void collectItem(Machine machine);




}
