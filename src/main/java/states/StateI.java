package states;

import core.Machine;

public interface StateI {

void selectItem(Machine machine);
void makePayment(Machine machine);
void collectItem(Machine machine);



}
