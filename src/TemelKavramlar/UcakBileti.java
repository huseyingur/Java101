package TemelKavramlar;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int km,yas,tip;
        double tutar,indirim=1;
        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi KM türünden giriniz : ");
          km = inp.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
           yas = inp.nextInt();
        System.out.print("Yolculuk tipiniz giriniz(1 => Tek Yön, 2 => Gidiş Dönüş): ");
           tip = inp.nextInt();

if(km<1 || yas<1 || tip<1 || tip>2){
    System.out.println("THatalı Veri Girdiniz");
}else {
   tutar = (km*0.10);

   if (yas<12){indirim = 0.5;}
   if (yas>= 12 && yas<=24){indirim = 0.9;}
   if (yas>65){indirim=0.7;}
   tutar=tutar*indirim;

   if (tip ==2){tutar=tutar*0.8;}

    System.out.println("Toplam Tutar: " + tutar);

           }
}
    }
