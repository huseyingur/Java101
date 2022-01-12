package Donguler;
import java.util.Scanner;


public class UsluSayiHesap {

        public static void main(String[] args){

            int a,b;
            int total = 1;

            Scanner inp = new Scanner(System.in);

            System.out.print("Bir Sayı Giriniz: ");
            a = inp.nextInt();
            System.out.print("Kaçıncı Kuvvet: ");
            b = inp.nextInt();

            for(int i = 1; i < b+1; i++){
                total = total * a;
            }

            System.out.println("Total: " + total);


        }
    }

