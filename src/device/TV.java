package device;

/**
 * not used
 */
public class TV {
    private String name;

    public TV(String name) {
        this.name = name;
    }

    public TV() { }

    public void on(){
        System.out.println(name + " TV is On");}
    public void off(){
        System.out.println(name + " TV is On");}
    public void setInputChannel(int channel){
        System.out.println(name + " TV channel is: " + channel);
    }
    public void setVolume(int volume){
        System.out.println(name + " TV volume is: "+volume);
    }
}
