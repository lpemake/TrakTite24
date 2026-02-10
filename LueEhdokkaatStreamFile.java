import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class LueEhdokkaatStreamFile {
    public static void main(String[] args) {
        try {
            // ArrayList<Ehdokas> ehdokkaat = new ArrayList<>();

            Files.lines(Paths.get("ehdokkaat.txt"))
                .map(row -> row.split("\\s+"))
                .filter(pieces -> pieces.length == 4)
                .map(pieces -> new Ehdokas(pieces[0], pieces[1], pieces[2], Integer.valueOf(pieces[3])))
                //.forEach(ehdokas -> ehdokkaat.add(ehdokas));
                .sorted((e1, e2) -> e2.getAanimaara() - e1.getAanimaara())
                .forEach(e -> System.out.println(e));

            //ehdokkaat.stream()
            //    .sorted((e1, e2) -> e2.getAanimaara() - e1.getAanimaara())
            //    .forEach(e -> System.out.println(e));

        } catch (Exception e) {
            System.out.println("virhe");
        }
    }
}
