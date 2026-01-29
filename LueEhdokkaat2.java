import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class LueEhdokkaat2 {
    public static void main(String[] args) {
        try {
            ArrayList<Ehdokas> ehdokkaat = new ArrayList<>();

            Scanner scanner = new Scanner(Paths.get("ehdokkaat.txt"));

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] parts = row.split("\\s+");

                Ehdokas ehdokas = new Ehdokas(parts[0],
                    parts[1], parts[2], Integer.parseInt(parts[3]));
                ehdokkaat.add(ehdokas);
            }

            Comparator<Ehdokas> vertailija = Comparator
                .comparing(Ehdokas::getSukunimi)
                .thenComparing(Ehdokas::getEtunimi);

            Collections.sort(ehdokkaat, vertailija);

            Comparator<Ehdokas> aaniMaaranMukaan = Comparator
                .comparing(Ehdokas::getAanimaara)
                .reversed();

            Collections.sort(ehdokkaat, (h1, h2) -> h2.getAanimaara() - h1.getAanimaara());

            //Collections.sort(ehdokkaat, aaniMaaranMukaan;

            // sukunimen ja etunimen mukaan
            Collections.sort(ehdokkaat, (h1, h2) -> {
                int result = h1.getSukunimi().compareTo(h2.getSukunimi());
                if (result == 0)
                    result = h1.getEtunimi().compareTo(h2.getEtunimi());
                return result;
            });

            // puolueen ja äänimäärän mukaan
            Collections.sort(ehdokkaat, (e1, e2) -> {
                int result = e1.getPuolue().compareTo(e2.getPuolue());
                if (result == 0)
                    result = e2.getAanimaara() - e1.getAanimaara();
                return result;
            });

            // vertailuluvun mukaan
            // Vertailuluku on double-tyyppiä. Selvitä, miten vertaillaan

            // käydään ehdokkaat läpi ja tulostetaan heidän tietonsa
            for (Ehdokas ehdokas : ehdokkaat) {
                System.out.println(ehdokas);
            }

        } catch (Exception e) {
            System.out.println("virhe");
        }
    }
}
