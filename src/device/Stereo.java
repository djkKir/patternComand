package device;


public class Stereo {
    private String name;
    public Stereo(String s) {
        name = s;
    }

    public Stereo() {
    }

    public void on(){
        System.out.println(name + " Stereo On");
    }
    public void off(){
        System.out.println(name + " Stereo Off");
    }
    public void setCD(){
        System.out.println(name + " Stereo  Set CD");
    }
    public void setDvd(){
        System.out.println(name + " Stereo Set DVD");
    }
    public void setRadio(){
        System.out.println(name + " Stereo set Radio");
    }
    public void setVolume(int volume){
        System.out.println(name + " Stereo volume is " + volume);
    }

    @Override
    public String toString() {
        return "Stereo name= " + name + " ";
    }
}
