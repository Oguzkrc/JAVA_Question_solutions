package December;

import java.util.Scanner;

public class EBOB_EKOKBulanProgram {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("sayi1 sayısını giriniz : ");
        int sayi1 = input.nextInt();

        System.out.print("sayi2 sayisini giriniz : ");
        int sayi2 = input.nextInt();
        int ebob =1;

        // birim maliyeti = 18 döngü
        for (int i = 1; i <= sayi1; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }
        System.out.println("==========");

        // birim maliyeti = 14 döngü
        for (int k = sayi1; k >= 1 ; k--) {
            System.out.println(k);
            if (sayi1 % k == 0  && sayi2 % k==0) {
                ebob = k;
                System.out.println(ebob);
                break;

            }

        }


        System.out.println(ebob);
    }
}
