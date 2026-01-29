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

            for (Kunta kunta : kunnat) {
                System.out.println(kunta);
            }
            
        } catch (Exception e) {
            System.out.println("Virhe");
        }
    }
}
