package biulderpattern;

public class Car {

    private  int id;
    private  String brand;
    private String model;
    private String color;
    private int noDoors;
    private String screenType;
    private int weight;
    private int height;

    public Car(int id, String brand, String model, String color, int noDoors, String screenType, int weight, int height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.noDoors = noDoors;
        this.screenType = screenType;
        this.weight = weight;
        this.height = height;
    }

    public int getId() {
        return id;
    }

 
    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoDoors() {
        return noDoors;
    }

    public void setNoDoors(int noDoors) {
        this.noDoors = noDoors;
    }

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
