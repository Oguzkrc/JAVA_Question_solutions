package December;

import java.util.Scanner;

public class TekSayılarınToplamınıBulanProgram {

    // Java döngüler ile negatif bir değer girilene kadar kullanıcıdan girişleri
    // kabul eden ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.

    public static void main(String[] args) {

        int h=1 ;
        int toplam =0;

        while (h>0 ){
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen sayı giriniz, bitirmek icin eksi deger giriniz");
            h= scan.nextInt();

            if (h % 2 == 1){
                toplam += h;

            }
        }
        System.out.println("Girilen tek sayı Toplamları : " + toplam );
    }
}
