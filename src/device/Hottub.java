package device;


public class Hottub {
    private String name;
    private int temperature;

    public Hottub(String name) {
        this.name = name;
    }

    public Hottub() {
    }

    public void on(){
        System.out.println(name + " Huttub is On");
    }
    public void off(){System.out.println(name + " Huttub is Off");}
    public void circulate(){System.out.println(name + " Huttub is circulate");}
    public void jetsOn(){System.out.println(name + " Huttub is jetsOn");}
    public void jetsOff(){System.out.println(name + " Huttub is jetsOff");}
    public void setTemperaturet(int temperature){
        this.temperature = temperature;
        System.out.println(name + " Huttub  temperature set " + temperature);}
}
