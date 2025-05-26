package statepattern;

public class StatePattern {
    
    public static void main(String[] args) {
        MobileContext MC = new MobileContext();
        
        MC.outputState();
        MC.changeState(new Silent());
        MC.outputState(); 
        MC.changeState(new Ringing());
        MC.outputState(); 
    }   
}
