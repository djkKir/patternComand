import command.*;
import device.Light;


public class RemoteLoaderWithUndo {
    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        //create devices
        Light livingRoomLight = new Light("Livin Room");

        //set light command
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        //set remote Control slot
        remoteControl.setCommand(0, livingRoomLightOn,livingRoomLightOff);


        System.out.println(remoteControl);

        //test remote control
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();




    }
}
