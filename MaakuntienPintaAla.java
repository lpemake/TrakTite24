import java.util.*;
import java.nio.file.*;;

public class MaakuntienPintaAla {
    public static void main(String[] args) {

        try {
            Scanner reader = new Scanner(Paths.get("kunnat.txt"));

            HashMap<String, Double> maakuntienPintaAla = new HashMap<>();

            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] pieces = row.split("\\s+");
                String maakunta = pieces[2];

                if (!maakuntienPintaAla.containsKey(maakunta)) {
                    // maakuntaa ei ole. Lisätään se hajautustauluun
                    maakuntienPintaAla.put(maakunta, 0.0);
                }
                double pintaAla = maakuntienPintaAla.get(maakunta);
                // kasvatetaan maakunnan pinta-alaa uuden kunnan pinta-alalla
                pintaAla += Double.parseDouble(pieces[4]);
                maakuntienPintaAla.put(maakunta, pintaAla);
            }
            reader.close();

            // tulostetaan maakunnat ja niiden pinta-alat
            for (HashMap.Entry<String, Double> mk : maakuntienPintaAla.entrySet()) {
                System.out.println(mk.getKey() + " pinta-ala = " + mk.getValue() + " km2");
            }
        }
        catch (Exception e) {
            System.out.println("virhe");
        }

    }
}
