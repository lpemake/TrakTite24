import java.util.ArrayList;
import java.util.Collections;

public class KorttiPakka {
    
    private ArrayList<Kortti> pakka;

    public KorttiPakka() {
        teePakka();
    }

    public ArrayList<Kortti> jaa(int n) {
        ArrayList<Kortti> kasi = new ArrayList<>(this.pakka.subList(0, n));

        this.pakka.removeAll(kasi);
        // this.pakka.subList(0, n).clear();
        
        return kasi;
    }

    public void teePakka() {
        pakka = new ArrayList<>();

        String[] maat = {"Hertta", "Ruutu", "Risti", "Pata"};

        for (String maa : maat) {
            for (int i = 1; i <= 13; i++) {
                pakka.add(new Kortti(maa, i));
            }
        }
    }

    public void sekoita() {
        // shuffle
        Collections.shuffle(this.pakka);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (Kortti k : pakka) {
            sb.append(k.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
