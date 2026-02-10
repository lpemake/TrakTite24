import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NimetStream {
    public static void main(String[] args) {
        List<String> rivit = new ArrayList<>();

        try {
            //Files.lines(Paths.get("names.txt")).sorted().forEach(luku -> System.out.println(luku));

            Files.lines(Paths.get("names.txt")).forEach(rivi -> rivit.add(rivi));

            System.out.println("PITKÄT NIMET -------------------");
            rivit.stream()
                .filter(s -> s.length() > 10)
                .sorted()
                .forEach(luku -> System.out.println(luku)); 
                
            // erilliset nimet
            System.out.println("ERILLISET NIMET -------------------");
            rivit.stream()
                .sorted()
                .distinct()
                .forEach(luku -> System.out.println(luku)); 

        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

            
    }
}
