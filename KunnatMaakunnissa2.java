import java.util.*;
import java.nio.file.*;;

public class KunnatMaakunnissa2 {
    public static void main(String[] args) {

        try {
            Scanner reader = new Scanner(Paths.get("kunnat.txt"));

            HashMap<String, ArrayList<Kunta>> kunnatMaakunnissa = new HashMap<>();

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
                    // maakunnan kuntalistaa ei ole. Lisätään se hajautustauluun
                    kunnatMaakunnissa.put(maakunta, new ArrayList<>());
                }
                // lisää kunta maakuntaan
                ArrayList<Kunta> mk = kunnatMaakunnissa.get(maakunta);
                mk.add(k);
                //ArrayList<Kunta> mk = kunnatMaakunnissa.get(maakunta).add(k);
            }
            reader.close();

            // tulostetaan kunnat maakunnittain
            for (String avain : kunnatMaakunnissa.keySet()) {
                ArrayList<Kunta> mk = kunnatMaakunnissa.get(avain);
                Collections.sort(mk, (k1, k2) -> k2.getVakiluku() - k1.getVakiluku());

                System.out.println(avain);
                for (Kunta kunta : mk) {
                    System.out.println(kunta.toString());
                }
                System.out.println("---------------------");
            }
        }
        catch (Exception e) {
            System.out.println("virhe");
        }

    }
}
