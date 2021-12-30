import java.util.Scanner;


public class KdvTurar {

    public static void main(String[] args) {


        //Değişkenler
        double kdv18=1.18,kdvliTutar = 0,kdvsizTutar,kdv8=1.08;

        //Kullanıcıdan veri al
        Scanner inp = new Scanner(System.in);
        System.out.print("Tutarı Giriniz : ");
        kdvsizTutar = inp.nextDouble();

        //Kdv işlemlerini yap
        kdvliTutar = kdvsizTutar>1000 ? (kdvsizTutar*kdv8):(kdvsizTutar*kdv18);

        //Ekrana Yazdır
        System.out.println("Kdvli  Tutar : " + kdvliTutar );
        System.out.println("Toplam KDV : " + (kdvliTutar-kdvsizTutar) );


    }
}
