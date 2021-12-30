import java.util.Scanner;

public class UcgenAlan {

    public static void main(String[] args) {

        //Değişkenleri oluştur
        int aKenar, bKenar,cKenar;
        double alan;

        //Verileri Al
        Scanner  inp = new Scanner(System.in);
        System.out.println("Kenar uzunluklarını verdiğiniz üçgenin alanını hesaplayacağız ");
        System.out.print("A Kenarını giriniz : ");
        aKenar = inp.nextInt();
        System.out.print("B Kenarını giriniz : ");
        bKenar = inp.nextInt();
        System.out.print("C Kenarını giriniz : ");
        cKenar = inp.nextInt();
        //Alanı Hesapla
        double u = (aKenar+bKenar+cKenar)/2;
        alan =  Math.sqrt(u*(u-aKenar)*(u-bKenar)*(u-cKenar));
        System.out.println("Bu Üçgenin Alanı : "+ alan);


    }
}
