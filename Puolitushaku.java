import java.util.*;

public class Puolitushaku {

    public static boolean linearSearch(int key, int[] data) {

        for (int i = 0; i < data.length; i++) {
            if (key == data[i])
                return true;
        }
        return false;
    }

    public static boolean binarySearch(int key, int[] data) 
    {
        int size = data.length;
        int low = 0;
        int high = size - 1;
            
        while(high >= low) {
            int middle = (low + high) / 2;
            if(data[middle] == key) {
                return true;
            }
            if(data[middle] < key) {
                low = middle + 1;
            }
            if(data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }   
    public static void main(String[] args) {
        // tehdään satunnaislukugeneraattori
        Random gen = new Random();

        // aineiston koko
        int n = 10000000;

        int luvut[] = new int[n];

        for (int i = 0; i < luvut.length; i++) {
            luvut[i] = gen.nextInt(n);
        }

        // etsittävä tieto
        int key = gen.nextInt(n);

        // haetaan
        // lisää ajanotto, kokeile valmista funktiota, tee lineaarinen hake 
        long startBin = System.nanoTime();
        boolean tulos = binarySearch(key, luvut);
        long stopBin = System.nanoTime();
        if (tulos)
            System.out.println("löytyi");
        else
            System.out.println("ei löytynyt");
        System.out.println("Binäärihaku " + (stopBin-startBin));

    }
}
