public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin"; // Değişken Tanımlama ve Değer Atama
        String ogrenci2 = "Salih";
        String ogrenci3 = "Derin";
        String ogrenci4 = "Ahmet";

        // A Kısmı
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println(ogrenci4);

        System.out.println("-----------------------------------------");

        String[] ogrenciler = new String[4];  // Dizi Tanımlama
        ogrenciler[0] = "Engin"; //Diziye Değer Atama
        ogrenciler[1] = "Salih";
        ogrenciler[2] = "Derin";
        ogrenciler[3] = "Ahemet";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]); // A Kısmının Tek satırda Çağırılması
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);  // For-each Dögüsü ile Çağırma
        }

    }
}
