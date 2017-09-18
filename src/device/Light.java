package device;


public class Light {
    private String name;
    public Light(){}
    public Light(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(name + " Light is On");
    }
    public void off(){
        System.out.println(name + " Light is Off");
    }

    @Override
    public String toString() {
        return " " + name + " ";
    }
}
