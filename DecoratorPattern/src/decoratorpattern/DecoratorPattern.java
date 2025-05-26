package decoratorpattern;

public class DecoratorPattern {

    public static void main(String[] args) {
        Sandwich firstsandwich  = new BasicSandwich();
        System.out.println(firstsandwich.getcost());
        System.out.println(firstsandwich.getdescription());
        
        //wa7d fool 
        Sandwich secondsandwich  = new Foul(new BasicSandwich()); 
        System.out.println(secondsandwich.getcost());
        System.out.println(secondsandwich.getdescription());
        
        //wa7d fool zeet haar hna ya abo3mo
        Sandwich thirdsandwich  = new ZetHaar(new Foul(new BasicSandwich())); 
        System.out.println(thirdsandwich.getcost());
        System.out.println(thirdsandwich.getdescription());
        
    }
    
}
