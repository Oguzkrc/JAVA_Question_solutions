package November;

import java.util.Scanner;

public class DikÜçgendeHipotenüsBulanProgram {
    public static void main(String[] args) {

        // üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üç kenar uzunlugu giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int esitlik = c * c;
        if (a * a + b * b == esitlik) {
            System.out.println("Bu bi dik açıdır");
        } else System.out.println("dık acı degildir");


    }


}
