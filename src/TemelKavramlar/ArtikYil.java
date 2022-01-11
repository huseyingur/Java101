package TemelKavramlar;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

         int yil;
         Scanner inp = new Scanner(System.in);
         System.out.print("Artık Yıl Hesaplamak İstediğiniz Yılı Giriniz : ");
         yil = inp.nextInt();

         if (yil%4==0){
             if (yil%100!=0){
                 System.out.println(yil + " Artık Yıldır.");
             }else if (yil%400==0){
                 System.out.println(yil + " Artık Yıldır.");
             }else  {System.out.println(yil + " Artık Yıl değildir.");
             }

         }else{
             System.out.println(yil + " Artık Yıl değildir.");
         }






    }
}
