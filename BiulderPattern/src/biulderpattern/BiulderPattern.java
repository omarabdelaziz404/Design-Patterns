package biulderpattern;

public class BiulderPattern {

    public static void main(String[] args) {

        /*
        CarBuilder builder = new CarBuilder();
        //create object with id, brand only
        builder.id(100).brand("Toyta");
        Car c1 = builder.build();
        System.out.println(c1.getId());
        System.out.println(c1.getBrand());
        System.out.println(c1.getHeight()); //0

        System.out.println(c1.getColor()); //null
        c1.setColor("Red");
        System.out.println(c1.getColor()); //Red

        //second object with id, brand, weight
        builder.id(200).brand("Honda").weight(5000);
        Car c2 = builder.build();
        System.out.println(c2.getId());
        System.out.println(c2.getBrand());
        System.out.println(c2.getWeight());

        //creat Immutable object 
        CarBuilder builder1 = new CarBuilder();
        builder.id(100).brand("Lada");
        Car c3 = builder1.build();
        // c3.setId(200) = error bec it's private and there is no setId method in car class
         */
        Director D = new Director();      // creating object from Director
        CarBuilder CB = new CarBuilder(); // creating object from CarBuilder
        D.buildHyundai(CB);               // send refrance from CarBuilder to buildHyundai in Director
        Car hyundai1 = CB.build();
        hyundai1.setId(1);
        
        Car hyundai2 = CB.build();
        hyundai2.setId(2);
    }

}
