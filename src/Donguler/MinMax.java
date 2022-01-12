package Donguler;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
    int adet,sayi,min,max;
    boolean init=true;

    Scanner inp = new Scanner(System.in);
    System.out.print("Kaç Sayı girecesiniz: ");
    adet = inp.nextInt();

        System.out.print("1. Sayıyı Giriniz: ");
        sayi=inp.nextInt();
        min=sayi;
        max=sayi;

    for (int i = 2; i<= adet; i++)
    {
        System.out.print(i+ ". Sayıyı Giriniz: ");
           sayi=inp.nextInt();
            if (sayi<min){min=sayi;}
            if (sayi>max){max=sayi;}

     }
        System.out.println("En Küçük Sayı : "+ min + " ve En Büyük Sayi : "+ max );
        }
    }

