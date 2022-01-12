package Donguler;
import java.util.Scanner;

public class SayiBulma {
    public static void main(String[] args) {
        int sayi,count=0,toplam=0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz: ");
        sayi = inp.nextInt();
        for (int i = 1; i<= sayi;i++){
            if ((i%4==0)&&(i%3==0)){
                count++;
                toplam = toplam+i;
                System.out.println(toplam/count);

            }
        }
         
        
        
    }
}
