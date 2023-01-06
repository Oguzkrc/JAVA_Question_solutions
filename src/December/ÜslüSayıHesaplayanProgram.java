package December;

import java.util.Scanner;

public class ÜslüSayıHesaplayanProgram {
    public static void main(String[] args) {

       // Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

        int a,b;
        Scanner scan= new Scanner(System.in);
        System.out.println("Üstü alınacak sayıyı giriniz");

        a= scan.nextInt();
        System.out.println("Üst sayıyı giriniz");
        b= scan.nextInt();


        int üsthesaplama=1;

        for (int i = 1; i <=b ; i++) {
            üsthesaplama *= a;

        }
        System.out.println("SONUC : " + üsthesaplama );


    }
}
















