import java.util.ArrayList;

public class NimiLista {
    public static void main(String[] args) {
        ArrayList<String> nimet = new ArrayList<>();

        nimet.add("Roope Ankka");
        nimet.add("Iines Ankka");
        nimet.add("Hessu Hopo");

        nimet.sort(null);

        int i = 0;
        while (i < nimet.size()) {
            System.out.println(nimet.get(i));
            i++;
        }
        System.out.println("-----------------");
        for (int j = 0; j < nimet.size(); j++) {
            System.out.println(nimet.get(j));
        }

        // etsi ja poista
        nimet.remove("Roope Ankka");
        nimet.remove(1); // poistetaan 2. alkio

        System.out.println("-----------------");
        for (String nimi : nimet) {
            System.out.println(nimi);
        }
    }
}
