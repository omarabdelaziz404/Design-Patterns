package adapterpattern;

public class AdapterPattern {

    public static void main(String[] args) {
       Vehicle c = new Car();
       useVehicle(c);
       
       Bicycle b = new Bicycle();
       Vehicle bike = new BicycleAdapter(b);
       useVehicle(bike);
       
        //Vehicle c = new Car();  // any method car implents are available
        //Car c1 = new Car();    // all methods in car are available        
    }
    
    public static void useVehicle(Vehicle car){
        car.accelerate();
        car.pushbreak();
        car.soundhorn();
        System.out.println("");
    }    
}
