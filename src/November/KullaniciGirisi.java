package November;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {

        /*
        Kullanıcıdan şifre ve parola alın ( önceden tanımlı şifre= , parola=)
        Eğer şifre doğruysa "Giriş Yaptınız" yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
         ve unuttuğu ilk şifre ile aynı olmaması gerektiğini kontrol edip ,
         şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
         sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

         1- tanımlı şifre oluştur +
         2-tanımlı parola oluştur +
         3-kullanıcıya giriş için şifre ve parola sor +
         4- şifre ve parola doğru ise giriş yaptınız +
         5- eğer yanlış girerse; +
            a-kullanıcıya şifre sıfırlayıp sıfırlamayacağıno sor
            eğer değiştirmek isterse
                aa-yebi girilen şifre diğiri ile aynı okursa hata ver
                bb-sorun yoksa yeni şifre oluştur
            b-kullanıcı eğer değiştirmeyeckse çıkış yap
         */

        String TanimliSifre="Kasım";
        String TanimliParola="Aralık";

        String Talep;
        String YeniSifre;

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String Sifre= scan.nextLine();

        System.out.println("Lutfen Parola giriniz");
        String Parola= scan.nextLine();

        if (Sifre.equals(TanimliSifre)&& Parola.equals(TanimliParola)){

            System.out.println("Giris yaptınız");
        }else System.out.println("Hatalı Sifre" + "Tekrar Deneyiniz"+
                "\nSifrenizi sıfırlamak ister misiniz"+
                "\n1: Evet\n2: Hayır");

        Talep= scan.nextLine();
        if (Talep.equalsIgnoreCase("Evet")) {

            System.out.println("Lutfen yeni sifrenizi giriniz");
            YeniSifre=scan.nextLine();

            if (YeniSifre.equals(TanimliSifre)){
                System.out.println("Sifre Olusturulamadı tekrar deneyiniz");
            }else System.out.println("Sifreniz degistirilmiştir");


        }else System.out.println("Sistemden cıkıs yapılmıstır");

    }
}
