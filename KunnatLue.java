import java.nio.file.Paths;
import java.util.*;

public class KunnatLue {
    public static void main(String[] args) {
        
        // 1. tee tiedoston lukeminen
        try {
            // lista kunnista
            ArrayList<Kunta> kunnat = new ArrayList<>();
            Scanner reader = new Scanner(Paths.get("kunnat.txt"));

            while (reader.hasNextLine()) {
                String rivi = reader.nextLine();
                String[] palaset = rivi.split("\\s+");
                if (palaset.length == 5) {
                    int id = Integer.parseInt(palaset[0]);
                    String nimi = palaset[1];
                    String maakunta = palaset[2];
                    int vakiluku = Integer.parseInt(palaset[3]);
                    double pintaAla = Double.parseDouble(palaset[4]);

                    Kunta k = new Kunta(id, nimi, maakunta, vakiluku, pintaAla);
                    // lisätää listaan
                    kunnat.add(k);
                }
            }
            reader.close();

            // JÄRJESTÄ
            // Kunnan koodin mukaan
            Collections.sort(kunnat, (k1, k2) -> k1.getKoodi() - k2.getKoodi());
            // Kunnan nimen mukaan
            Collections.sort(kunnat, (k1, k2) -> k1.getNimi().compareTo(k2.getNimi()));
            // Maakunnan ja kunnan nimen mukaan
            Collections.sort(kunnat, (k1, k2) -> {
                int result = k1.getMaakunta().compareTo(k2.getMaakunta());
                if (result == 0)
                    result = k1.getNimi().compareTo(k2.getNimi());
                return result;
            });
            // Väkiluvun mukaan (int)
            Collections.sort(kunnat, Comparator.comparing(Kunta::getVakiluku));
            // Pinta-alan mukaan (double)
            Collections.sort(kunnat, Comparator.comparing(Kunta::getPintaAla));
            Collections.sort(kunnat, (k1, k2) -> (int)(k1.getPintaAla() - k2.getPintaAla()));

            for (Kunta kunta : kunnat) {
                System.out.println(kunta);
            }
            
        } catch (Exception e) {
            System.out.println("Virhe");
        }
    }
}
