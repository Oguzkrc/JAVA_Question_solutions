package December;

import java.util.Scanner;

public class HavaSıcaklığınaGöreEtkinlikÖnerme {

    //Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    //Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    //Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
    //Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

    public static void main(String[] args) {

        // Scanner scan= new Scanner(System.in);

        // System.out.println("Lutfen sıcaklık derecesini giriniz");

        int derece=15;              // scan.nextInt();

        if (derece<=5){
            System.out.println("Kayak yapabilirsiniz");
        } else if (derece>5 && derece<=15 ) {
            System.out.println("Sinema  etkinligi yapabilirsiniz");
        } else if (derece>15 && derece<=25) {
            System.out.println("Piknik etkinligi yapabilirsiniz");
        } else if (derece>25) {
            System.out.println("Yüzme etkinligi yapabilirsiniz");
        }


    }
}
