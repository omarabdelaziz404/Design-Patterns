package lazysingletion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LetterShuffle {

    private String[] letters = {"a", "b", "c", "d", "e"};
    private List<String> data = Arrays.asList(letters);

    // 2- create a reference to the object that will be created inside this class
    private static LetterShuffle oneinstance;

    //3- create a gettter method getinstance,
    //method --> public static
    public static LetterShuffle getinstance() {
        if (oneinstance == null) { //if no object is created. creat an object and just one object
            oneinstance = new LetterShuffle();
        }
        return oneinstance;
    }

    // 1- Make constructor private
    private LetterShuffle() {
        Collections.shuffle(data);
    }

    public void printdata() {
        for (String item : data) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }
}
