package statepattern;

public class Silent implements MobileAlertState{

    @Override
    public void alert() {
        System.out.println("Mobile is in Silent mode");
    }
}
