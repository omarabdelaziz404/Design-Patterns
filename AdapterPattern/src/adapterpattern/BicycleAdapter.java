package adapterpattern;

public class BicycleAdapter implements Vehicle{
    private Bicycle bike; //1- create a refernce from bicycle
    
    public BicycleAdapter (Bicycle bike){ //2- constructor take bike in refernce
        this.bike=bike;
    }

    @Override
    public void accelerate() {
        bike.pedal();
    }

    @Override
    public void pushbreak() {   
        bike.stop();
    }

    @Override
    public void soundhorn() {
        bike.ringbell();
        
    }
    
    
}
