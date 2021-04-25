public class Main {

    public static void main(String[] args) {
        int number = 28; //sayı dirilecek yer
        int total = 0;
        boolean gaf = true;
        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                gaf = false;

            } else {
                gaf = true;
            }
            if (gaf == false) {
                total = total + i;

            }
        }

        if (total == number) {
            System.out.println(number + " = mükemmelel sayıdır");
        } else {
            System.out.println(number + " = mükemmelel sayı değildir");
        }
    }
}
