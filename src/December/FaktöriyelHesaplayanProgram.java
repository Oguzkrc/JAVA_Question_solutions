package December;

import java.util.Scanner;

public class FaktöriyelHesaplayanProgram {

    public static void main(String[] args) {
       // N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı
        // farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
        // N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        // n! = 1 * 2 * 3 * 4 * ... * n
        Scanner scan = new Scanner(System.in);
        System.out.println("Faktöriyel Sayısı : ");
        int n = scan.nextInt();
        int faktöriyel = 1;

        for (int i = n; i >=1 ; i--) {
            faktöriyel = faktöriyel *i;
        }
        System.out.println(n +"!=  " + faktöriyel);
    }
}
