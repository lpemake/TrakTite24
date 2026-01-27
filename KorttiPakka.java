import java.util.ArrayList;

public class KorttiPakka {
    
    private ArrayList<Kortti> pakka;

    public KorttiPakka() {
        TeePakka();
    }

    public ArrayList<Kortti> jaa(int n) {
        ArrayList<Kortti> kasi = new ArrayList<>(this.pakka.subList(0, n));

        this.pakka.removeAll(kasi);
        
        return kasi;
    }

    public void TeePakka() {
        pakka = new ArrayList<>();

        String[] maat = {"Hertta", "Ruutu", "Risti", "Pata"};

        for (String maa : maat) {
            for (int i = 1; i <= 13; i++) {
                pakka.add(new Kortti(maa, i));
            }
        }
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
