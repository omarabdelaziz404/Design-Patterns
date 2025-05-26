package commandpattern;

public class TurnOffCommand implements Command {
    private Television TV; 
   
    public TurnOffCommand (Television TV){ 
        this.TV=TV; 
    }
    
    @Override
    public void execute() {
        this.TV.turnOff();
    }  
}

    

