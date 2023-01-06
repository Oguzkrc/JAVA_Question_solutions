package December;

import java.util.Scanner;

public class UçakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        // Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan+
        // programı yapın.
        // Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.+
        // Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
        // sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;+
        //
        //Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi
        // ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı
        // verilmelidir.+
        //Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        //Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        //Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        //Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
        //Örnek Ekran Çıktısı
        //Mesafeyi km türünden giriniz : 200
        //Yaşınızı giriniz : 35
        //Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
        //
        //Toplam Tutar = 20.0 TL

        double Km;
        int yas,yolculuktipi;
        double mesafetoplami=0.10;
        Scanner scan = new Scanner(System.in);
        System.out.println("Gitmek istediginiz km'yi yazınız");
        Km= scan.nextDouble();
        System.out.println("Yaşını giriniz");
        yas= scan.nextInt();
        System.out.println("Yolculuk tipini seciniz \n1 => Tek Yön \n2 => Gidiş Dönüş");
        yolculuktipi= scan.nextInt();

        if (Km<=0 || yas<=0 || yolculuktipi<=0 || yolculuktipi>=3){
            System.out.println("Hatalı veri girisi yaptınız");
            System.exit(0);
        }

        System.out.println("Toplam Miktar : "+(mesafetoplami*Km) + " Tl'dir ");

        switch (yolculuktipi){
            case 1 :
                if (yas<=12){
                    System.out.println("ödenecek toplam tutar: " + (mesafetoplami*Km)*0.50+ " Tl'dir " );
                } else if (yas>12 && yas<=24) {
                    System.out.println("ödenecek toplam tutar: " + (mesafetoplami*Km)*0.90+ " Tl'dir " );
                } else if (yas>24 && yas<=65) {
                    System.out.println("ödenecek toplam tutar: " + (mesafetoplami*Km)+ " Tl'dir " );
                } else if (yas>65) {
                    System.out.println("ödenecek toplam tutar: " + (mesafetoplami*Km)*0.70+ " Tl'dir " );
                }

            case 2 :
                if (yas<=12){
                    System.out.println("ödenecek toplam tutar: " + ((mesafetoplami*Km)*0.50)*0.80+ " Tl'dir " );
                } else if (yas>12 && yas<=24) {
                    System.out.println("ödenecek toplam tutar: " + ((mesafetoplami*Km)*0.90)*0.80+ " Tl'dir " );
                } else if (yas>24 && yas<=65) {
                    System.out.println("ödenecek toplam tutar: " + (mesafetoplami*Km)*0.80+ " Tl'dir " );
                } else if (yas>65) {
                    System.out.println("ödenecek toplam tutar: " + ((mesafetoplami*Km)*0.70)*0.80+ " Tl'dir " );
                }

                }

        }


    }

