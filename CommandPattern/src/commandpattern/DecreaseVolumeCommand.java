package commandpattern;

public class DecreaseVolumeCommand implements Command{
    private Television TV; 
   
    public DecreaseVolumeCommand (Television TV){ 
        this.TV=TV; 
    }
    
    @Override
    public void execute() {
        this.TV.decreaseVolume();
    } 
    
}
