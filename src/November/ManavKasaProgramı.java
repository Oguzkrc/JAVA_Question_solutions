package November;

import java.util.Scanner;

public class ManavKasaProgramı {
    public static void main(String[] args) {

        int secim = 1;

        // Meyveler ve KG Fiyatları

        // Armut : 2,14 TL
        // Elma : 3,67 TL
        // Domates : 1,11 TL
        // Muz: 0,95 TL
        // Patlıcan : 5,00 TL

        Scanner scan = new Scanner(System.in);
        double Armut = 2.14, Elma = 3.67, Domates = 1.11, Muz = 0.95, Patlıcan = 5.00;
        double ToplamMiktar = 0;
        double Kilo = 0;
        while (secim >0 && secim <=5) {
            System.out.println("Lutfen almak istediginiz ürünleri yazınız.Bitirmek için 6 tuşuna basınız" +
                    "\n1-Armut\n2-Elma\n3-Domates\n4-Muz\n5-Patlıcan");

            secim = scan.nextInt();

            if (secim == 6) {
                System.out.println("Alınan ürünlerin toplam tutarı:" + ToplamMiktar + " TL'dir");
                break;
            }
            System.out.println("Kaç kg ürün aldıgınızı giriniz");
            Kilo= scan.nextDouble();
            if (secim<=0 || secim>6){
                System.out.println("Hatalı giriş yaptınız 5 parça ürün bulunmaktadır");
                break;
            }
            switch (secim) {
                case 1:
                    ToplamMiktar+=Armut*Kilo;
                    System.out.println("Toplam tutar :  "+ ToplamMiktar+"TL'dir");
                    break;
                case 2:
                    ToplamMiktar+=Elma*Kilo;
                    System.out.println("Toplam tutar :  "+ ToplamMiktar+"TL'dir");
                    break;
                case 3:
                    ToplamMiktar+=Domates*Kilo;
                    System.out.println("Toplam tutar :  "+ ToplamMiktar+"TL'dir");
                    break;
                case 4:
                    ToplamMiktar+=Muz*Kilo;
                    System.out.println("Toplam tutar :  "+ ToplamMiktar+"TL'dir");
                    break;
                case 5:
                    ToplamMiktar+=Patlıcan*Kilo;
                    System.out.println("Toplam tutar :  "+ ToplamMiktar+"TL'dir");
                    break;


            }

        }

    }
}