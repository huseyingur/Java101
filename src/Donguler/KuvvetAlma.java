package Donguler;
import java.util.Scanner;

public class KuvvetAlma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz:");
        int sayi = inp.nextInt();

        System.out.println("4'ün Kuvvetleri: ");

        for (int i = 1; i <=sayi ; i*=4) {
            System.out.print(" "+i);
        }
        System.out.println(" ");
        System.out.println("5'ün Kuvvetleri: ");

        for (int i = 1; i <=sayi ; i*=5) {
            System.out.print(" "+i);
        }
        }
    }

