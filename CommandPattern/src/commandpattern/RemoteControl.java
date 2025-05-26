package commandpattern; 
//invoker
public class RemoteControl { 

    private Command[] command; // Declares an array to hold Command objects, representing different button actions

    public RemoteControl() { // Constructor for the RemoteControl class
        command = new Command[4]; // Initializes the array with 4 slots to hold commands
    }

    // (0, turnOff) --> add 0 to make turnOff
    public void addCommand(int slotid, Command command) { // Method to assign a command to a specific slot (button)
        this.command[slotid] = command; // Stores the given command in the specified slot
    }

    public void buttonPressed(int slotid) { // Method to simulate pressing a button on the remote
        command[slotid].execute(); // Executes the command stored in the specified slot
    }

}
