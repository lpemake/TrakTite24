import java.util.*;
import java.nio.file.Paths;

public class Osavaltiot {
    public static void main(String[] args) {
        try {
            // hajautustaulu osavaltiosta. Arvoina lista kunnista
            HashMap<String, ArrayList<String>> osavaltiot = new HashMap<>();
            
            Scanner scanner = new Scanner(Paths.get("cities.txt"));

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                String[] pieces = row.split(";");
                String city = pieces[0];
                String state = pieces[1];

                // onko osavaltio hajautustaulussa?
                if (!osavaltiot.containsKey(state)) {
                    // osavaltiota ei ole vielä. Lisätään osavaltio avaimeksi
                    // ja tyhjä lista kuntia varten
                    osavaltiot.put(state, new ArrayList<String>());
                }
                // lisätään kunta listaan oikean osavaltion alle
                osavaltiot.get(state).add(city);

                // ArrayList<String> osavaltionKunnat = osavaltiot.get(state);
                // osavaltionKunnat.add(city);
            }
            scanner.close();

            for (String osavaltio : osavaltiot.keySet()) {
                System.out.println(osavaltio);
                // haetaan tähän osavaltioon kuuluvat kaupungit
                ArrayList<String> cities = osavaltiot.get(osavaltio);
                for (String city : cities) {
                    System.out.println(" - " + city);
                }
            }

            // käydään hajautustaulu läpi avain-arvo-pareina
            for (HashMap.Entry<String, ArrayList<String>> osavaltio : osavaltiot.entrySet()) {
                System.out.println(osavaltio.getKey());
                // käydään läpi osavaltion kunnat
                for (String city : osavaltio.getValue()) {
                    System.out.println(" - " + city);
                }
            }

        } catch (Exception e) {
            System.out.println("virhe");
        }
    }
}
