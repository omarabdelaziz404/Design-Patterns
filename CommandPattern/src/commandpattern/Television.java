package commandpattern;


//Receiver Class:

public class Television {
    
    private int volume = 10;
    
    public void turnOn(){
        System.out.println("Tv is on");
    }
    
    public void turnOff(){
        System.out.println("Tv is off");
    }
    
    public void increaseVolume() { //volume 0-100
        if (volume < 100 ){
            volume++;
            System.out.println("volume is increased" + " " + volume);
        }else{
            System.out.println("Max volume" );
        }
    }
    
        public void decreaseVolume() { //volume 0-100
        if (volume > 0 ){
            volume--;
            System.out.println("volume is decreased" + " " + volume);
        }else{
            System.out.println("Min volume");
        }
    }
        
}
