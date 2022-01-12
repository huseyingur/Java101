package Donguler;
import java.util.Scanner;


public class SayiToplam {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sayi,toplam=0;

        do {
            System.out.println("Bir Sayı Giriniz: ");
            sayi = inp.nextInt();
            if (sayi%4==0){
            toplam +=sayi ;
            }

        } while(sayi % 2 == 0);

        System.out.println(toplam);

    }
}
