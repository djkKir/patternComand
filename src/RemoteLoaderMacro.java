

import command.*;
import device.Hottub;
import device.Light;
import device.Stereo;
import device.TV;

public class RemoteLoaderMacro {

    public static void main(String[] args) {
        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
        //создаём устройства
        Light light = new Light("living room");
        TV tv = new TV("Living room ");
        Stereo stereo = new Stereo("Living room");
        Hottub hottub = new Hottub("Living room");

        //создаем команды
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        //заполняем массив party On und party Off
        Command[] partyOn = {lightOn, tvOn, stereoOn, hottubOn};
        Command[] partyOff = {lightOff, tvOff, stereoOff, hottubOff};

        //добавляем в макрокоманду
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("---pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        System.out.println("-----------------------");
        System.out.println("---pushing Macro Undo---");
        remoteControl.undoButtonWasPushed();


    }
}
