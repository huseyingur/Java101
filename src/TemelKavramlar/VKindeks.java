import java.util.Scanner;

public class VKindeks {

    public static void main(String[] args) {

        //Değişkenler
        double boy,kilo, indeks;

        //Verileri Al
        Scanner  inp = new Scanner(System.in);
        System.out.println("Vücut kitle İndeksini hesaplayacağız");
        System.out.print("Boyunuzu (metre cinsinden) giriniz :");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu giriniz :");
        kilo=inp.nextDouble();

        //Hesapla ve yazdır
        indeks = kilo/(boy*boy);
        System.out.println("Vücut  Kitle İndeksiniz :" + indeks);
    }
}
