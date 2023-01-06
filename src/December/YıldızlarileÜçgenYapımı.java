package December;

import java.util.Scanner;

public class YıldızlarileÜçgenYapımı {

   // Java'da döngüler kullanılarak yıldızlar ile üçgen yapıyoruz.

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Bir sayi giriniz : ");
        int yildiz = scan.nextInt();

        for (int i = 0; i <= yildiz; i++) {
            for (int j = 0; j < yildiz-2; j++) {
                System.out.print("  ");
            }
            for (int k =0 ; k < i; k++) {
                System.out.print(" * ");
            }
            System.out.println(" ");
        }


    }
}
