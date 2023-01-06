package December;

import java.util.Scanner;

public class GirilenSayıdanKücük2ninKuvvetleriniBulanProgram {

    public static void main(String[] args) {

        int sayi ;
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir deger giriniz : ");
        sayi = scan.nextInt();
        for (int i = 2; i <= sayi ; i*=2) {
            System.out.println(i);

        }


    }
}
