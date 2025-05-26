package commandpattern;

public class IncreaseVolumeCommand implements Command {
    private Television TV; 
   
    public IncreaseVolumeCommand (Television TV){ 
        this.TV=TV; 
    }
    
    @Override
    public void execute() {
        this.TV.increaseVolume();
    } 
}
