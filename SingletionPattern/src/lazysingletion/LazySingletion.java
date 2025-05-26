package lazysingletion;

public class LazySingletion {

    public static void main(String[] args) {
        LetterShuffle L1 = LetterShuffle.getinstance();
        LetterShuffle L2 = LetterShuffle.getinstance();

        System.out.println(L1.hashCode());
        L1.printdata();

        System.out.println(L2.hashCode());
        L2.printdata();

    }

}
