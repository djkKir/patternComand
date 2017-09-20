package command;

import device.TV;

public class TVOffCommand implements Command
{
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();

    }

    @Override
    public void undo() {
        tv.on();
        tv.setInputChannel(12);
        tv.setVolume(10);

    }
}
