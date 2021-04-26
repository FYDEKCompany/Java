
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> ucler = new ArrayList<>();
        ArrayList<Integer> besler = new ArrayList<>();
        ArrayList<Integer> dokuzlar = new ArrayList<>();


        int[] dizi = {15,30,45,60,75,90,27,10};


        for (int i : dizi) {
            if (i % 3 == 0) {
                ucler.add(i);
            }
        }
        for (int i : dizi) {
                if (i % 5 == 0) {
                    besler.add(i);
                }
        }
        for (int i : dizi) {
            if (i % 9 == 0) {
                dokuzlar.add(i);
            }
        }
        System.out.println("üçe bölünebilenler: " + ucler);
        System.out.println("beşe bölünebilenler: " + besler);
        System.out.println("dokuza bölünebilenler: " + dokuzlar);
    }

}
