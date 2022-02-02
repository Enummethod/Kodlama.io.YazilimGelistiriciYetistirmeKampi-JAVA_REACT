class Main {
    public static void main(String[] args) {
        System.out.println(topla(7,6,3,6));
    }

    public static int topla (int sayi1, int sayi2){
        return sayi1 + sayi2 ;
    }

    public static int topla(int... sayilar ){
        int toplam = 0;
        for (int sayı : sayilar) {
            toplam += sayı;
        }
        return toplam;
    }
}