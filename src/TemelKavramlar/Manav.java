import java.util.Scanner;


public class Manav {

    public static void main(String[] args) {

        //Değişkenleri oluştur.

        double toplam, armut=2.14, elma=3.67, domates=1.11, muz =0.95,patlican = 5;

        //Verileri al
         Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç kilo : ");
        armut=inp.nextDouble();
        System.out.print("Elma Kaç kilo : ");
        elma=inp.nextDouble();
        System.out.print("Domates Kaç kilo : ");
        armut=inp.nextDouble();
        System.out.print("Muz Kaç kilo : ");
        muz=inp.nextDouble();
        System.out.print("Patlıcan Kaç kilo : ");
        patlican=inp.nextDouble();

        //Hesapla ve yazdır
        toplam = armut+elma+muz+domates+patlican;
        System.out.println("Toplam Tutar = " + toplam);

    }
}
