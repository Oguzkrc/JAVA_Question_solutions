package November;

import java.util.Scanner;

public class CinZodyagıHesaplama {
    public static void main(String[] args) {

        // 4000 bin yıldır kullanılan bir astroloji çeşididir
        // Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar.
        // Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde)
        // sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

        CinZodyagı();
    }


    public static void CinZodyagı(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Dogum Yilinizi giriniz");
        int Dogumyili= scan.nextInt();
        int Kalan=Dogumyili %12;

        switch (Kalan){
            case 0:{
                System.out.println("Kalan 0 buna göre astrolojide maymundur");

            }
            break;
            case 1:{
                System.out.println("Kalan 1 buna göre astrolojide Horozdur");

            }
            break;
            case 2:{
                System.out.println("Kalan 2 buna göre astrolojide Kopekdir");

            }
            break;
            case 3:{
                System.out.println("Kalan 3 buna göre astrolojide Domuzdur");

            }
            break;
            case 4:{
                System.out.println("Kalan 4 buna göre astrolojide Faredir");

            }
            break;
            case 5:{
                System.out.println("Kalan 5 buna göre astrolojide Öküzdür");

            }
            break;
            case 6:{
                System.out.println("Kalan 6 buna göre astrolojide Kaplandır ");

            }
            break;
            case 7:{
                System.out.println("Kalan 7 buna göre astrolojide Tavsandır");

            }
            break;
            case 8:{
                System.out.println("Kalan 8 buna göre astrolojide Ejdarhadır");

            }
            break;
            case 9:{
                System.out.println("Kalan 9 buna göre astrolojide Yılandır");

            }
            break;
            case 10:{
                System.out.println("Kalan 10 buna göre astrolojide Atdır");

            }
            break;
            case 11:{
                System.out.println("Kalan 11 buna göre astrolojide Koyundur");

            }
            break;


        }

    }

}
