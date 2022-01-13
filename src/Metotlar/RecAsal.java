package Metotlar;
import java.util.Scanner;

public class RecAsal {

    static boolean  IsAsal(int sayi,int bolen)
    {
        if (sayi==2){return true;}

        if (sayi %bolen ==0 ){
            return false;
        }else
        {
            bolen=bolen-1;
            if (bolen<2){return true;}
            return IsAsal(sayi,bolen);
        }

    }

    public static void main(String[] args) {

     Scanner inp = new Scanner(System.in);
     System.out.print("Sayı Giriniz : ");
     int sayi = inp.nextInt();
     int bolen = sayi -1;

     if ( IsAsal( sayi,bolen)){
         System.out.println(sayi +"  Asal Sayıdır");
     }else{
         System.out.println(sayi +"  Asal Sayı Değildir");
     }

    }
}
