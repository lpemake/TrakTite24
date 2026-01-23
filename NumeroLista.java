import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class NumeroLista {
    public static void main(String[] args) {
        ArrayList<Integer> luvut = new ArrayList<>();
        ArrayList<Double> mittaukset = new ArrayList<>();

        luvut.add(1);
        int a = 2;
        luvut.add(a);
        luvut.add(3);

        double ka = 0;
        for (int i = 0; i < luvut.size(); i++) {
            ka += luvut.get(i);
        }
        ka /= luvut.size();
        System.out.println("Keskiarvo = " + ka);

        Collections.sort(luvut);
    }
}
