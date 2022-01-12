package Donguler;
import java.util.Scanner;

public class EbEk {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        int n1 = inp.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int n2 = inp.nextInt();

        int ebob = 1;
        int ekok = 1;
        boolean asd = true;
        int i = n1;

        while(i > 1){
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
                ekok = (n1*n2) / ebob;
                break;
            }
            i--;
        }
        System.out.println("EBOB: "+ ebob + " EKOK: "+ ekok);
    }
}