public class Main {

    public static void main(String[] args) {
        int number = 13;
        boolean asalmı = true;

        if (number == 1) {
            System.out.println("=1 asal değil");
            return;
        }
        if (number < 1) {
            System.out.println(number+"=adam gibi sayı gir lan");
            return;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                asalmı = false;
            }
        }

        if (asalmı) {
            System.out.println(number + "=Asaldır");

        }
        if (asalmı == false) {
            System.out.println(number + "=Asal deildir");

        }
    }
}

