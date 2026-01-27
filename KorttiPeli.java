import java.util.*;

public class KorttiPeli {
    public static void main(String[] args) {
        KorttiPakka pakka = new KorttiPakka();
        pakka.sekoita();
        System.out.println(pakka.toString());   

        System.out.println("Jaa viisi korttia");

        ArrayList<Kortti> kasi = pakka.jaa(5);

        for (Kortti kortti : kasi) {
            System.out.println(kortti);
        }

        System.out.println("pakka jaon jälkeen");
        System.out.println(pakka.toString());
    }
}
