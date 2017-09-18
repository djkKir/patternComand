package device;


public class GarageDoor {
    private String name;
    public GarageDoor(String s) {
        name = s;
    }

    public GarageDoor() {
    }

    public void up(){
        System.out.println(name + " GarageDoor is Open");
    }

    public void down(){
        System.out.println(name + " GarageDoor is Close");
    }

    public void stop(){
        System.out.println(name + " GarageDoor is Stop");
    }

    public void lightOn(){
        System.out.println(name + " GarageDoor is light On");
    }

    public void lightOff(){
        System.out.println(name + " GarageDoor is lightOff");
    }

    @Override
    public String toString() {
        return "GarageDoor name='" + name + " " ;
    }
}
