package December;

import java.util.Scanner;

public class ATMProjesi {

    public static void main(String[] args) {

        // kullanıcıdan daha önceden kayıtlı kullanıcı adı ve şifresini alın.
        // 3 kere yanlış girme hakkı var fazla girerse bloke edin
        // para yatırma, para çekme, bakiye sorgulama , çıkış menüleri bulunsun.

        String KullaniciAdi, Parola;
        Scanner scan = new Scanner(System.in);
        String UserName = "Java";
        String Password = "0606ANK";
        int KalanHak = 3;
        int Bakiye = 500;
        int Secim;

        while (KalanHak > 0) {
            System.out.println("Kullanıcı adı giriniz");
            KullaniciAdi = scan.nextLine();
            System.out.println("Lütfen parolanızı giriniz");
            Parola = scan.nextLine();

            if (KullaniciAdi.equals(UserName) && Parola.equals(Password)) {
                System.out.println("X bankasına hosgeldiniz");

                do {
                    System.out.println("1-Para yatırma" +
                            "\n 2-Para Çekme" +
                            "\n 3-Bakiye Sorgulama" +
                            "\n 4-Çıkış");
                    System.out.println("Lütfen Yapmak istediginiz işlemi seciniz");
                    Secim = scan.nextInt();
                    switch (Secim) {
                        case 1:
                            System.out.println("Lütfen yatırmak istediginiz miktarı giriniz");
                            int eklenenMiktar = scan.nextInt();
                            Bakiye += eklenenMiktar;
                            break;

                        case 2:
                            System.out.println("Lütfen cekmek istediginiz miktarı giriniz");
                            int cekilenMiktar = scan.nextInt();
                            if (cekilenMiktar <= Bakiye) {
                                Bakiye -= cekilenMiktar;
                            } else System.out.println("Yetersiz Bakiye");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz :" + Bakiye);
                            break;
                        case 4:
                            System.out.println("İyi Günler");
                        default:

                    }

                }
                while (Secim != 4);
                break;

            } else {
                KalanHak--;
                System.out.println("Hatalı giris yaptınız");
            }
            if (KalanHak == 0) {
                System.out.println("Hesabınız Bloke Olmustur");
            } else {
                System.out.println("Kalan hakkınız" + KalanHak);
            }


        }
    }

}

