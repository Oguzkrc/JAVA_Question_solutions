package December;


import java.util.Scanner;

public class ArmstrongSayılarıBulanProgram {

    // N haneli bir sayının basamaklarının n’inci üstlerinin toplamı,
    // sayının kendisine eşitse,
    // böyle sayılara Armstrong sayı denir.

    // Örneğin 407 sayısını ele alalım.
    // (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir.
    // Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.
    //1342 sayısına da bakalım.
    // (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
    //1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634
    //54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");

        int sayi = scan.nextInt();
        int basamaksayi=0;
        int toplam=0;
        int sayi2=sayi;
        int sayi3=sayi;

        for (int i =0; i <sayi; i++) {

            sayi =sayi/10;
            basamaksayi ++;
            System.out.println(sayi);

        }
        int amstrongsayi=0;
        int amstrongsayi2=1;

        for (int i = 1; i <=basamaksayi; i++) {

            amstrongsayi=(sayi2 %10);
            amstrongsayi2=amstrongsayi;

            for (int j = 1; j <basamaksayi ; j++) {

                amstrongsayi2 *= amstrongsayi;

            }

            sayi2 = sayi2 /10;

            toplam += amstrongsayi2;

        }
        System.out.println(toplam);

        if (sayi3== toplam){
            System.out.println("amstrong saydir");
        }else{
            System.out.println("Amstrong sayi degildir");
        }

    }
}