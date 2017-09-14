package command;

import device.Light;

/**
 * Created by k.dodonov on 14.09.2017.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light){
        this.light = light;

    }

    @Override
    public void execute() {
        light.on();
    }
}
