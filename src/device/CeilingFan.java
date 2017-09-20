package device;


public class CeilingFan {
    private String name;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;

    public CeilingFan(String name) {
        this.name = name;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(name + " CeilingFan is on high");
    }
    public void medium(){
        speed = MEDIUM;
        System.out.println(name + " CeilingFan is on medium");
            }
    public void low(){
        speed = LOW;
        System.out.println(name + " CeilingFan is on low");
    }

    public int getSpeed(){
        return speed;
    }

    public CeilingFan() {
    }

    public void on(){
        System.out.println(name + " CeilingFan is On");
    }

    public void off(){
        speed = OFF;
        System.out.println(name + " CeilingFan is off");
    }

    @Override
    public String toString() {
        return "CeilingFan name= " + name + " ";
    }
}
