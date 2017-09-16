package device;

/**
 * Created by k.dodonov on 14.09.2017.
 */
public class Stereo {
    public void on(){
        System.out.println("Stereo On");
    }
    public void off(){
        System.out.println("Stereo Off");
    }
    public void setCD(){
        System.out.println("Stereo  Set CD");
    }
    public void setDvd(){
        System.out.println("Stereo Set DVD");
    }
    public void setRadio(){
        System.out.println("Stereo set Radio");
    }
    public void setVolume(int volume){
        System.out.println("Stereo volume is " + volume);
    }
}
