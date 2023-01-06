package November;


import java.util.Scanner;

public class TaksimetreProgramı {

    public static void main(String[] args) {

        // Taksimetre KM başına 2.20 TL tutmaktadır.
        // Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        Scanner scan= new Scanner(System.in);
        System.out.println("Gidilen km'yi yazınız");
        int gidilenkm= scan.nextInt();
        int acılısücreti=10;
        double km=2.20;
        int mintutar=20;
        double toplamtutar= acılısücreti+(gidilenkm*km);
        if (toplamtutar<=mintutar){
            System.out.println("ödenecek tutar:"+ mintutar);

        } else if (toplamtutar>mintutar) {
            System.out.println("ödenecek tutar: "+toplamtutar);

        }

    }
}
