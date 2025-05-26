package statepattern;

public class MobileContext {
    private MobileAlertState MobileState;
    
    public MobileContext () {
        MobileState = new Ringing(); //default state                
    } 
    public void changeState (MobileAlertState state){
        MobileState = state;
    }
    public void outputState () {
        MobileState.alert();
    }    
}
