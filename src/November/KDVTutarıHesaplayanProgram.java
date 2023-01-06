package November;

import java.util.Scanner;

public class KDVTutarıHesaplayanProgram {

    public static void main(String[] args) {

        // Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Almış olduğunuz ürünün tutarını giriniz");

        int tutar = scan.nextInt();
        if (tutar<1000){
            System.out.println("almış olduğunuz ürünün toplam tutarı : "+ tutar*1.18);
        }
        else System.out.println("almış olduğunuz ürünün toplam tutarı : "+ tutar*1.08);


    }
}
