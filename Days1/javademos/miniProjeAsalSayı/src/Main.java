public class Main {

    public static void main(String[] args) {
        int number = 23;
        boolean isPrime = true;

        if (number < 1){
            System.out.println("Geçersiz Sayı Girdiniz...");
        }
        if(number==1){
            System.out.println(number + " Sayısı Asal Değildir.");
            return;
        }

        for (int i = 2 ; i < number; i++){
            if (number % i == 0 ){
                isPrime = false;
            }
        }
        if(isPrime){
            System.out.println(number + " Sayısı Asaldır.");
        }else {
            System.out.println(number + " Sayısı Asal Değildir.");
        }
    }
}
