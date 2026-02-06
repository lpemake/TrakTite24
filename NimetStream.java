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

            rivit.stream()
                .sorted()
                .forEach(luku -> System.out.println(luku));            
        } catch (Exception e) {
            System.out.println("Virhe: " + e.getMessage());
        }

            
    }
}
