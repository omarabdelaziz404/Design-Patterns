package decoratorpattern;

public class BasicSandwichDecorator implements Sandwich{
    private Sandwich sandwich;
    
    public BasicSandwichDecorator (Sandwich sandwich){
        this.sandwich = sandwich;
    }

    @Override
    public double getcost() {
        return sandwich.getcost();
    }

    @Override
    public String getdescription() {
        return sandwich.getdescription();
    }
    
}
