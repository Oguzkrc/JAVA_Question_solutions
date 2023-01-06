package November;

import java.util.Scanner;

public class VücutKitleİndeksiHesaplayanProgram {
    public static void main(String[] args) {
        // Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo10000 / (boyboy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo= scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz: ");
        double boy= scan.nextDouble();
        double kitle=kilo*10000/(boy*boy);

        if (kitle>=30){
            System.out.println("obez");

        } else if (kitle>=25 && kitle<30) {
            System.out.println("kilolu");

        } else if (kitle>=20 && kitle<25) {
            System.out.println("normal");

        } else if (kitle<20){
            System.out.println("zayıf");

        }

    }


}
