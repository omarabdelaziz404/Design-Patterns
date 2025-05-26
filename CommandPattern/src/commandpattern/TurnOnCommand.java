package commandpattern;

public class TurnOnCommand implements Command {
    
    private Television TV; //refrance from reciver class
   
    public TurnOnCommand (Television TV){ 
        this.TV=TV; //this.TV: means the field in the current object.
                    //TV: means the parameter passed to the constructor.
    }
    
    @Override
    public void execute() {
        this.TV.turnOn();
    }
    
}
