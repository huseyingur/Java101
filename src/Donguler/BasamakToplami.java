package Donguler;
import java.util.Scanner;

public class BasamakToplami {

        public static void main(String[] args) {
            int sayi;
            Scanner inp=new Scanner(System.in);
            System.out.print("Bir Sayi giriniz: ");

            sayi=inp.nextInt();

            int sayac=0,sonuc=0,basDeger, sayi2=sayi;

            //basamak sayısı bulma
            while(sayi2!=0){
                sayi2 /=10;
                sayac+=1;
            }

            sayi2=sayi;
            for(int i=0;i<sayac;i++){
                basDeger=sayi2%10;
                sonuc+=basDeger;
                sayi2 /=10;

            }
            System.out.println(sayi+"'nın basamakları toplamı: "+sonuc);
        }
    }

