import java.util.Scanner;


public class NotOrtalama {

    public static void  main(String[] args){
        //Değişkenler
        int mat, fizik,kimya,turkce,tarih,muzik;

        //Veri almak için Scanner oluştur.
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan Değerli al
        System.out.print("Matematik Notunuz : ");
        mat =input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik =input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya =input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce =input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih =input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik =input.nextInt();
        double ortalama = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        System.out.println("Not Ortalamanız : "+ ortalama );
        System.out.println(ortalama >= 60 ? "Sınıfı Geçti":" Sınıfta Kaldı");

    }

}
