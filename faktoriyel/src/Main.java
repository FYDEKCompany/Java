public class Main {

    public static void main(String[] args) {
        int fakt = 7;
        int total = 1;
        System.out.println("Girilen Sayı = " + fakt + "!");
        for (int i = 1; i <= fakt; i++) {
            total = total * i;
        }
        System.out.println("toplam= " + total);

    }
}
