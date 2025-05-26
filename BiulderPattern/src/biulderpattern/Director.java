package biulderpattern;

public class Director {

    public void buildHyundai(CarBuilder carbuilder) {
        carbuilder.brand("Hyuandi");
        carbuilder.color("Red");
        carbuilder.noDoors(4);
        carbuilder.screenType("large");
        carbuilder.weight(5000);
        carbuilder.height(200);

    }
}
