public class Main {
    public static void main(String[] args) {
        System.out.println("----------DERS 1------------------");
        // Diziler birer char[] dir.
        String mesaj = "Bugün hava çok güzel.";
        System.out.println(mesaj);

        System.out.println("Eleman sayısı : " + mesaj.length()); // Dizinin Eleman sayısı.
        System.out.println("5. Eleman : " + mesaj.charAt(4)); // Dizinin 4 elemanı.
        System.out.println(mesaj.concat(("Yaşasın!"))); // Birleştirme.
        System.out.println(mesaj.startsWith("B")); // Dizinin ilk elemanı "B" mi ? (True/false)
        System.out.println(mesaj.endsWith(".")); // Dizinin son elemanı "." mı ? (True/false)
        char [] karekterler = new char[5];
        mesaj.getChars(0,5,karekterler,0); // Bir diziden A. elemanından B. elemanına kadar başka bir dizinin C. elemanından başlayarak aktarma (A:srcBegin, B:SrcEnd, C:dstBegin)
        System.out.println(mesaj.indexOf('a')); // istenilen karekteri-metni  bulma.
        System.out.println(mesaj.lastIndexOf("e")); // Sondan aramaya başlar.

        System.out.println("----------DERS 2------------------");

        System.out.println(mesaj.replace(' ', '-')); // Karekter değiştirme.
        System.out.println(mesaj.substring(2,5)); // Kesme işlemi...

        // split metodu : Bir metni belli karekter veya karekter dosyası olarak parçalamaya yarar.
        for (String kelime : mesaj.split(" ")){
            System.out.println(kelime); // Her bir kelimeyi yazma.
        }

        System.out.println(mesaj.toLowerCase()); // Küçük harfe çevirme...
        System.out.println(mesaj.toUpperCase()); // Büyük harfe çevirme...

        System.out.println(mesaj.trim()); // Başında ve sonundaki boşlukları atar..


     }
}
