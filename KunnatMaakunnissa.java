import java.util.*;
import java.nio.file.*;;

public class KunnatMaakunnissa {
    public static void main(String[] args) {

        try {
            Scanner reader = new Scanner(Paths.get("kunnat.txt"));

            HashMap<String, Maakunta> kunnatMaakunnissa = new HashMap<>();

            while (reader.hasNextLine()) {
                String row = reader.nextLine();
                String[] pieces = row.split("\\s+");

                int koodi = Integer.parseInt(pieces[0]);
                String kunta = pieces[1];
                String maakunta = pieces[2];
                int vakiluku = Integer.parseInt(pieces[3]);
                double pintaAla = Double.parseDouble(pieces[4]);

                Kunta k = new Kunta(koodi, kunta, maakunta, vakiluku, pintaAla);

                // lisää maakunta hajautustauluun, jos sitä ei ole vielä

                if (!kunnatMaakunnissa.containsKey(maakunta)) {
                    // maakuntaa ei ole. Lisätään se hajautustauluun
                    kunnatMaakunnissa.put(maakunta, new Maakunta(maakunta));
                }
                // lisää kunta maakuntaan
                Maakunta mk = kunnatMaakunnissa.get(maakunta);
                mk.lisaaKunta(k);
            }
            reader.close();

            // tulostetaan kunnat maakunnittain
            for (String avain : kunnatMaakunnissa.keySet()) {
                Maakunta mk = kunnatMaakunnissa.get(avain);
                mk.jarjestaVakiluvunMukaan();
                System.out.println(mk.toString());
                System.out.println("---------------------");
            }
        }
        catch (Exception e) {
            System.out.println("virhe");
        }

    }
}
