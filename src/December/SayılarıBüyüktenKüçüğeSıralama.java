package December;

import java.util.Scanner;

public class SayılarıBüyüktenKüçüğeSıralama {

    // Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

    public static void main(String[] args) {

        int sayi1=6;
        int sayi2=15;
        int sayi3=8;

        if (sayi1>sayi2 && sayi1>sayi3){

            if (sayi2>sayi3){
                System.out.println("Girilen sayi sıralaması" +  sayi1 + ">"+ sayi2 + ">"+ sayi3);
            } else if (sayi3>sayi2) System.out.println("Girilen sayi sıralaması" +  sayi1 + ">"+ sayi3 + ">"+ sayi2);
        }
        if (sayi2>sayi1 && sayi2>sayi3){

            if (sayi1>sayi3 ){
                System.out.println("Girilen sayi sıralaması" +  sayi2 + ">"+ sayi1 + ">"+ sayi3);
            }else if (sayi3>sayi1) System.out.println("Girilen sayi sıralaması" +  sayi2 + ">"+ sayi3 + ">"+ sayi1);
        }
        if (sayi3>sayi2 && sayi3>sayi1){

            if (sayi1>sayi2){
                System.out.println("Girilen sayi sıralaması" +  sayi3 + ">"+ sayi1 + ">"+ sayi2);
            } else if (sayi2>sayi1) System.out.println("Girilen sayi sıralaması" +  sayi3 + ">"+ sayi2 + ">"+ sayi1);
        }
    }
}
