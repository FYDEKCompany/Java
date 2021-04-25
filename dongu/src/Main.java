public class Main {

    public static void main(String[] args) {
        int i = 0;
        int a = 0;
        for (; i <= 20; i++) {
            System.out.println("i= " + i);

        }
        System.out.println("döngü bitti");
        System.out.println("while başlıyor");
        while (i < 30) {
            System.out.println("while i= " + i);
            i = i + 1;
            if (i == 30) {
                while (a < 30) {
                    System.out.println("a = " + a);
                    a = a + 1;

                }
            }
        }
        System.out.println("while bitti");
    }
}
