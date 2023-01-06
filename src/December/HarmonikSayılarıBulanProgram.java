package December;

import java.util.Scanner;

public class HarmonikSayılarıBulanProgram {

    // Java ile girilen sayının harmonik serisini bulan program yazacağız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        double sayi= scan.nextDouble();
        double toplam=0;
        for (int i = 1; i <sayi ; i++) {
            toplam += 1.0/i;

        }

        System.out.println(toplam);
    }

}
