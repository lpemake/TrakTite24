import java.util.*;

public class KorttiPeli {
    public static void main(String[] args) {
        KorttiPakka pakka = new KorttiPakka();
        pakka.sekoita();
        //pakka.jarjesta();
        System.out.println(pakka.toString());   

        System.out.println("Jaa viisi korttia");

        ArrayList<Kortti> kasi = pakka.jaa(5);

        // järjestetään käsi arvon mukaan
        Collections.sort(kasi, (k1, k2) -> k1.getArvo() - k2.getArvo());        
        for (Kortti kortti : kasi) {
            System.out.println(kortti);
        }

        //System.out.println("pakka jaon jälkeen");
        //System.out.println(pakka.toString());
    }
}
