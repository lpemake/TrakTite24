import java.util.*;

public class ViisiNimea {
    public static void main(String[] args) {
        
        String[] nimet = new String[5];

        Scanner lukija = new Scanner(System.in);

        int i = 0;
        while (i < nimet.length) {
            System.out.println("Anna nimi: ");
            nimet[i] = lukija.nextLine();
            i++;
        }

        Arrays.sort(nimet);

        for (String nimi : nimet) {
            System.out.println(nimi);
        }

        lukija.close();
    }
}
