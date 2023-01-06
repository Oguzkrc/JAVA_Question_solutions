package November;


import java.sql.SQLOutput;
import java.util.Scanner;

public class NotOrtalamasıHesaplayanProgram {
    public static void main(String[] args) {

        // Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını
        // kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

        nothesaplama();

    }

    public static void nothesaplama() {

        double Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sınav notlarını giriniz");

        System.out.println("Matematik:");
        Matematik=scan.nextDouble();

        System.out.println("Fizik:");
        Fizik=scan.nextDouble();

        System.out.println("Kimya:");
        Kimya=scan.nextDouble();

        System.out.println("Türkce:");
        Türkçe=scan.nextDouble();

        System.out.println("Tarih:");
        Tarih=scan.nextDouble();

        System.out.println("Müzik:");
        Müzik=scan.nextDouble();



       double sonuc=(Matematik+Fizik+Kimya+Türkçe+Tarih+Müzik);

        double Ortalama= sonuc/6;


        System.out.println(Ortalama);

        if (Ortalama>=60)
            System.out.println("Sınıfı geçtiniz");

        else System.out.println("Sınıfta Kaldınız");

    }
}
