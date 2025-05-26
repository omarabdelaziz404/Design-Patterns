package biulderpattern;

public class CarBuilder {

    private int id;
    private String brand;
    private String model;
    private String color;
    private int noDoors;
    private String screenType;
    private int weight;
    private int height;

    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder noDoors(int noDoors) {
        this.noDoors = noDoors;
        return this;
    }

    public CarBuilder screenType(String screenType) {
        this.screenType = screenType;
        return this;
    }

    public CarBuilder weight(int weight) {
        this.weight = weight;
        return this;
    }

    public CarBuilder height(int height) {
        this.height = height;
        return this;
    }

    //in any builder pattern you must creat a method called build
    public Car build() {
        //creates instance of the Car class by calling its constructor
        return new Car(id, brand, model, color, noDoors, screenType, weight, height);
    }
}
