package adapterpattern;

public class Car implements Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Car Starts Moving");
    }

    @Override
    public void pushbreak() {
        System.out.println("Car Stopped");
       
    }

    @Override
    public void soundhorn() {
        System.out.println("Beeb Beeb...");
    }
    
}
