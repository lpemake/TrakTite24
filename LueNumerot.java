import java.util.*;
import java.nio.file.*;

public class LueNumerot {
    public static void main(String[] args) {
        try {
            ArrayList<Double> numbers = new ArrayList<>();

            Scanner scanner = new Scanner(Paths.get("numbers.txt"));

            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                double x = Double.parseDouble(s);
                numbers.add(x);
            }

            double sum = 0;
            for (double x : numbers) {
                sum += x;
            }
            System.out.println("ka = " + sum);
            
        } catch (Exception e) {
            System.out.println("virhe!");
        }
    }
}
