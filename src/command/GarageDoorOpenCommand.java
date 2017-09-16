package command;

import device.GarageDoor;

/**
 * Created by k.dodonov on 15.09.2017.
 */
public class GarageDoorOpenCommand implements Command {
    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
