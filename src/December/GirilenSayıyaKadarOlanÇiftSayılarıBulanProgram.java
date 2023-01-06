package December;


import java.util.Scanner;

public class GirilenSayıyaKadarOlanÇiftSayılarıBulanProgram {
    public static void main(String[] args) {

    // Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
    // 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.

        int k ;
        int toplam =0;
        int sayac =0 ;
        double ortalama;
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");
        k = scan.nextInt();

        for (int i = 1; i <=k ; i++) {
            if (i % 3 ==0  || i % 4 == 0){
                toplam+=i;
                sayac++;

            }
        }
        System.out.println(sayac);
        ortalama= toplam/sayac;
        System.out.println(toplam);
        System.out.println(ortalama);
    }
}
