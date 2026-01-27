import java.util.*;
import java.nio.*;
import java.nio.file.Paths;

public class LueEhdokkaat {
    public static void main(String[] args) {

        try {
            ArrayList<String> ehdokkaat = new ArrayList<>();

            Scanner scanner = new Scanner(Paths.get("ehdokkaat.txt"));

            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }

        } catch (Exception e) {
            System.out.println("virhe");
        }
    }
}
