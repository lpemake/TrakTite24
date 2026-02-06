import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MapTest1 {
    public static void main(String[] args) {
        // alustetaan lukija ja lista, johon syotteet luetaan
        Scanner lukija = new Scanner(System.in);
        List<String> syotteet = new ArrayList<>();

        // luetaan syotteet
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }

            syotteet.add(rivi);
        }

        // selvitetään kolmella jaollisten lukumaara
        long kolmellaJaollistenLukumaara = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .filter(luku -> luku % 3 == 0)
            .count();

        // selvitetään keskiarvo
        double keskiarvo = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();

        int summa = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .sum();

        // tulostetaan tilastot
        System.out.println("Kolmella jaollisia: " + kolmellaJaollistenLukumaara);
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
        System.out.println("Lukujen summa: " + summa);
    }
}
