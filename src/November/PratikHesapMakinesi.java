package November;

import java.util.Scanner;

public class PratikHesapMakinesi {

    public static void main(String[] args) {

        int sayi1, sayi2,secim;

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz");

        sayi1= scan.nextInt();
        sayi2= scan.nextInt();


        System.out.println("Lütfen yapmak istediginiz islemi seciniz" +
                "\n1-Toplama"+"\n2-Cıkarma"+"\n3-Carpma"+"\n4-Bölme");

        secim= scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplama Sonucu : " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Cıkarma Sonucu : " + (sayi1 - sayi2));
                break;
            case 3  : System.out.println("Carpma Sonucu : " +(sayi1*sayi2));
                break;
            case 4  : System.out.println("Bölme Sonucu : " +(sayi1/sayi2));
                break;



        }
    }
}