package commandpattern;

public class CommandPattern {

    public static void main(String[] args) {
        
        RemoteControl RC = new RemoteControl(); // Invoker: collect commands
        
        Television TV = new Television(); // Receiver: accept commands
        
        // Commands:
        TurnOnCommand TVon = new TurnOnCommand(TV);
        TurnOffCommand TVoff = new TurnOffCommand(TV);
        IncreaseVolumeCommand IC = new IncreaseVolumeCommand(TV);
        DecreaseVolumeCommand DC = new DecreaseVolumeCommand(TV);
        
        // Add commands in remote control 
        RC.addCommand(0, TVon);
        RC.addCommand(1, TVoff);
        RC.addCommand(2, IC);
        RC.addCommand(3, DC);
        
        // simulating button pressed: execute commands
        // 44:00 Lec 9
        RC.buttonPressed(0);
        RC.buttonPressed(2);
        RC.buttonPressed(2);
        RC.buttonPressed(3);
        RC.buttonPressed(1);
     
    }
    
}
