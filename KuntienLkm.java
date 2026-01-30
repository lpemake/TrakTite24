import java.util.*;
import java.nio.file.*;;

public class KuntienLkm {
    public static void main(String[] args) {

        try {
            Scanner reader = new Scanner(Paths.get("kunnat.txt"));

            HashMap<String, Integer> kunnatMaakunnissa = new HashMap<>();

            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] pieces = row.split("\\s+");
                String maakunta = pieces[2];

                if (!kunnatMaakunnissa.containsKey(maakunta)) {
                    // maakuntaa ei ole. Lisätään se hajautustauluun
                    kunnatMaakunnissa.put(maakunta, 0);
                }
                int lkm = kunnatMaakunnissa.get(maakunta);
                lkm++;
                kunnatMaakunnissa.put(maakunta, lkm);
            }
            reader.close();

            // tulostetaan maakunnat ja kuntien lukumäärät niissä
            for (HashMap.Entry<String, Integer> mk : kunnatMaakunnissa.entrySet()) {
                System.out.println(mk.getKey() + " kunnat = " + mk.getValue() + " kpl");
            }
        }
        catch (Exception e) {
            System.out.println("virhe");
        }

    }
}
