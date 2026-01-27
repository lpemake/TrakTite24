import java.nio.file.Paths;
import java.util.ArrayList;
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

            // käydään ehdokkaat läpi ja tulostetaan heidän tietonsa
            for (Ehdokas ehdokas : ehdokkaat) {
                System.out.println(ehdokas);
            }

        } catch (Exception e) {
            System.out.println("virhe");
        }
    }
}
