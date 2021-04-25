public class Main {

    public static void main(String[] args) {
        int number = 0;
        for (int a = 0; true; a++) {
            number = number + a;
            System.out.println(number);
            if (number > 1000000) {
                break;
            }
        }

    }
}
