package November;

import java.util.Scanner;

public class SınıfıGecmeDurumu {

    // Dersler : Matematik, Fizik, Türkce, Kimya, Müzik
    //Geçme Notu : 55
    // Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

    public static void main(String[] args) {

        double NotOrtalaması,Matematik, Fizik, Türkce, Kimya, Müzik;

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen notlarınızı giriniz");

        Matematik= scan.nextDouble();
        Fizik= scan.nextDouble();
        Türkce= scan.nextDouble();
        Kimya= scan.nextDouble();
        Müzik= scan.nextDouble();

        NotOrtalaması=(Matematik+Fizik+Türkce+Kimya+Müzik)/5;
        if (NotOrtalaması<0 || NotOrtalaması>100 ){
            System.out.println("Gecerli not giriniz");
            System.exit(0);
        }


        System.out.println("Not ortalamanız : "+ NotOrtalaması);

        if (NotOrtalaması<55 ){
            System.out.println("Kaldınız");
        }else System.out.println("Gectiniz");








    }
}
