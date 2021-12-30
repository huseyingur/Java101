import  java.util.Scanner;

public class DaireAlani {

    public static void main(String[] args) {

        //Değişkenleri Oluştur
        double yaricap, merkezAci,alan,pi=3.14;

        //Veriler Al
        Scanner inp = new Scanner(System.in);
        System.out.println("Daire Diliminin Alanını Hesaplayacağız");
        System.out.print("Yarı Çapı Giriniz : ");
        yaricap=inp.nextDouble();
        System.out.print("Merkez Açıyı giriniz : ");
        merkezAci = inp.nextDouble();

        //Hesapla
        alan= (pi*(yaricap*yaricap)*merkezAci)/360;

        //Ekrana Yazdır
        System.out.println("Bu Dairenin  alanı :"+ alan + "cm2'dir");

    }
}
