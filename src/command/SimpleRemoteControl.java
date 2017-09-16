package command;



/**
 * Created by k.dodonov on 15.09.2017.
 */
public class SimpleRemoteControl  {

    private Command slot;

    public SimpleRemoteControl() {
                 }
    public void setCommand(Command command){
        slot = command;
        }
    public void buttonWasPressed(){
        slot.execute();
    }
}
