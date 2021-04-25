public class Main {

    public static void main(String[] args) {
        char harf = 'Ö';
        if (harf == 'A' || harf == 'I' || harf == 'O' || harf == 'U') {
            System.out.println(harf+" = Kalın harf");
        }
        else if (harf == 'E' || harf == 'İ' || harf == 'Ö' || harf == 'Ü'){
            System.out.println(harf+" = ince harf");
        }
        else{
            System.out.println(harf+" = sesli ve BÜYÜK karakter girin");
        }
    }
}
