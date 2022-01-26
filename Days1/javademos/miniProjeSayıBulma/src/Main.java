public class Main {
    public static void main(String[] args) {
        int[] sayılar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 3;
        boolean varMı = false;


        for (int sayı : sayılar) {
            if (sayı == aranacak) {
                varMı = true;
                break;
            }
        }
        if (varMı) {
            System.out.println("Dizi Sayıyı içermekte...");
        } else {
            System.out.println("Dizi sayıyı içermemekte...");
        }
    }
}
