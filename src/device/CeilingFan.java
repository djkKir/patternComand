package device;


public class CeilingFan {
    private String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    public CeilingFan() {
    }

    public void on(){
        System.out.println(name + " CeilingFan On");
    }

    public void off() {
        System.out.println(name + " CeilingFan off");
    }

    @Override
    public String toString() {
        return "CeilingFan name= " + name + " ";
    }
}
