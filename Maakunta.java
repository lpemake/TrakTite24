import java.util.ArrayList;
import java.util.Collections;

public class Maakunta {
    
    private ArrayList<Kunta> kunnat;
    private String nimi; // maakunnan nimi

    public Maakunta(String nimi) {
        this.nimi = nimi;
        kunnat = new ArrayList<>();
    }

    public void lisaaKunta(Kunta kunta) {
        // lisätään uusi kunta maakuntaan
        kunnat.add(kunta);
    }

    public void jarjestaVakiluvunMukaan() {
        Collections.sort(kunnat, (k1, k2) -> k2.getVakiluku() - k1.getVakiluku());
    }

    @Override
    public String toString() {
        String s = this.nimi + '\n';

        for (Kunta kunta : kunnat) {
            s += kunta.toString() + '\n';
        }

        return s;
    }
}
