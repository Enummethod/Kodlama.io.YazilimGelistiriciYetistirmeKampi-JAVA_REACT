public class Main {
    public static void main(String[] args) {

        char harf = 'C';
        char[] sesliHarfler = {'A', 'E', 'I', 'İ', 'O', 'Ö', 'U', 'Ü'};


        for (char c : sesliHarfler) {
            if (harf == c) {
                System.out.println(harf + " Harfi sesli bir harftir.");
                break;
            } else {
                System.out.println(harf + " Harfi sesli bir harf değildir.");
                break;
            }
        }
    }
}
