package decoratorpattern;

public class Foul extends BasicSandwichDecorator{
 
    public Foul(Sandwich sandwich) {
        super(sandwich);
    }
    
    @Override
    public double getcost() {
        return super.getcost() + 10 ;
    }

    @Override
    public String getdescription() {
        return super.getdescription() + " Added foul";
    }
   
}
