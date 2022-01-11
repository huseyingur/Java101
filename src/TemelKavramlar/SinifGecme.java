package TemelKavramlar;
import java.util.Scanner;

public class SinifGecme {

    public static void main(String[] args) {

        int  mat,fiz,turkce,kimya,muzik,toplamDers=0;
        double  toplamNot=0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        if (mat>=0 && mat<=100){
        toplamNot += mat;
        toplamDers ++;
                    }
        System.out.print("Fizik notunuz : ");
        fiz = inp.nextInt();
        if (fiz>=0 && fiz<=100){
            toplamNot += fiz;
            toplamDers ++;
        }
        System.out.print("Turkce notunuz : ");
        turkce = inp.nextInt();
        if (turkce>=0 && turkce<=100){
            toplamNot += turkce;
            toplamDers ++;
        }
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        if (kimya>=0 && kimya<=100){
            toplamNot += kimya  ;
            toplamDers ++;
        }
        System.out.print("Muzik notunuz : ");
        muzik = inp.nextInt();
        if (muzik>=0 && muzik<=100){
            toplamNot += muzik;
            toplamDers ++;
        }

    double avarage = toplamNot/toplamDers;

        if (avarage<=55){
            System.out.println(" Sınıfta Kaldınız");
        }else{
            System.out.println("Tebrikler, Sınıfı Geçtiniz.");

        }
        System.out.println("Not ortalamanız: "+ avarage);}}



