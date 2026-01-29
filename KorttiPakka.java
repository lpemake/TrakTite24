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

    public void jarjesta() {
        // maan ja arvon mukaan
        Collections.sort(this.pakka, (k1, k2) -> {
            int result = k1.getMaa().compareTo(k2.getMaa());
            if (result == 0)
                result = k1.getArvo() - k2.getArvo();
            return result;
        });
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
