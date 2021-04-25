public class Main {

    public static void main(String[] args) {
        int sayi = 4;
        int us = 5;




        int total = 1;

        for (int i = 0; i < us; i++) {
            total = total * sayi;
        }
        if (sayi == 0 && us == 0) {
            total = 0;
        }
        System.out.println(sayi + "^" + us + "=" + total);
        System.out.println(sayi + " üssü " + us + "=" + total);
    }
}
