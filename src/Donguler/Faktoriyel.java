package Donguler;
import java.util.Scanner;


public class Faktoriyel {

    public static void main(String[] args) {


        //C(n,r) = n! / (r! * (n-r)!)
    Scanner inp = new Scanner(System.in);

    System.out.print("1. Sayıyı Giriniz:");
    int a = inp.nextInt();


    System.out.print("2. Sayıyı Giriniz:");
    int b = inp.nextInt();



    int af = 1;
    for (int i = 1; i<=a;i++){
        af = af*i;
    }

        int bf=1;
        for (int i = 1; i<=b;i++){
            bf = bf*i;
        }
        int ab = a-b;
        int abf=1;
        for (int i = 1; i<=ab;i++){
            abf = abf*i;
        }



    System.out.println(af/(bf*abf));

    }
}
