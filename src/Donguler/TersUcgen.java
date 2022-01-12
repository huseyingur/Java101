package Donguler;
import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print("Üçgen Boyutunu Giriniz :");
        int n=inp.nextInt();

        for (int m=n;m>=1;m--){

            for (int j=1;j<=(n-m);j++){
                System.out.print(" ");
            }
            for (int k=(2*m)-1;k>=1;k--){
                System.out.print("*");
            }

        }

    }
}