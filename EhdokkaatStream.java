import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EhdokkaatStream {
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
            // Tulosta kaikki ehdokkaat Streamilla
            // ehdokkaat.stream()
            //    .forEach(e -> System.out.println(e.toString()));

            // Tulosta ehdokkaat, joilla on yli 100 ääntä äänimäärän mukaisessa järjestyksessä
            ehdokkaat.stream()
                .filter(e -> e.getAanimaara() > 100)
                .sorted((e1, e2) -> e2.getAanimaara() - e1.getAanimaara())
                .forEach(e -> System.out.println(e.toString()));    
                
            System.out.println("------------PUOLUEET------------------");
            // Tulosta kaikkien puoleiden nimet kertaalleen aakkosjärjestyksessä (distinct)
            ehdokkaat.stream()
                .map(ehdokas -> ehdokas.getPuolue())
                .distinct()
                .sorted((p1, p2) -> p1.compareTo(p2))
                .forEach(puolue -> System.out.println(puolue));

            // Tulosta kaikkien puoleiden nimet kertaalleen äänimäärän mukaisessa järjestyksessä
            // liian hankala tehtävä?
            
        } catch (Exception e) {
            System.out.println("virhe");
        }  
    }
}
