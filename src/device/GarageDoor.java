package device;

import command.Command;

/**
 * Created by k.dodonov on 15.09.2017.
 */
public class GarageDoor {
    public void up(){
        System.out.println("GarageDoor is Open");
    }

    public void down(){
        System.out.println("GarageDoor is Close");
    }

    public void stop(){
        System.out.println("GarageDoor is Stop");
    }

    public void lightOn(){
        System.out.println("GarageDoor is light On");
    }

    public void lightOff(){
        System.out.println("GarageDoor is lightOff");
    }


}
