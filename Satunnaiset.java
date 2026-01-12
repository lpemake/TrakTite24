import java.util.*;

public class Satunnaiset {
    
    public static void main(String args[]) {

        int[] luvut = new int[20];

        Random gen = new Random();

        for (int i = 0; i < 20; i++) {
            luvut[i] = gen.nextInt(51);
        }

        Arrays.sort(luvut);

        for (int luku : luvut) {
            System.out.println(luku);
        }
    }
}
