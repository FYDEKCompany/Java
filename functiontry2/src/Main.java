public class Main {

    public static void main(String[] args) {
        int total = usalma(3, 4);
        System.out.println(total);
        System.out.println("------------");
        usalma2(4,3);

    }

    public static int usalma(int sayi, int us) {

        int total = 1;

        for (int i = 0; i < us; i++) {
            total = total * sayi;
        }
        if (sayi == 0 && us == 0) {
            total = 0;
        }
        return total;
    }
    public static void usalma2(int sayi,int us){

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
