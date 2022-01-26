public class Main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 25;
        int number3 = 2;

        int bigNumber = number1 <= number2 ? number2 : number1;
        bigNumber = bigNumber <= number3 ? number3 : bigNumber;
        System.out.println("En büyük sayı : " + bigNumber);

    }
}
