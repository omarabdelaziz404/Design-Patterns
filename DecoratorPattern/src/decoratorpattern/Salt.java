package decoratorpattern;

public class Salt extends BasicSandwichDecorator {
    
    public Salt(Sandwich sandwich) {
        super(sandwich);
    }
    
    @Override
    public double getcost() {
        return super.getcost()+ 5;
    }

    @Override
    public String getdescription() {
        return super.getdescription() + " Added salt";
    }

}
