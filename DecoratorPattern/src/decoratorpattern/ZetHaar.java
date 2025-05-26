package decoratorpattern;

public class ZetHaar extends BasicSandwichDecorator{
    
    public ZetHaar(Sandwich sandwich) {
        super(sandwich);
    }
    
    @Override
    public double getcost() {
        return super.getcost()+ 1;
    }

    @Override
    public String getdescription() {
        return super.getdescription() + " Added ZetHaar";
    }
    
}
