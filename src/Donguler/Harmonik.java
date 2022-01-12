package Donguler;
import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args){

        Scanner inp = new Scanner(System.in);

        int n;

        System.out.println("Bir Sayı giriniz: ");
        n = inp.nextInt();

        double sonuc = 0;

        for(int i = 1; i<=n;i++){
            sonuc += (1.0/i);
        }

        System.out.println("Sonuç: "+ sonuc);

    }

}