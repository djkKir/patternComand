package command;

import device.Light;

/**
 * Created by k.dodonov on 15.09.2017.
 */
public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light){
        this.light = light;

    }

    @Override
    public void execute() {
        light.off();
    }
}
