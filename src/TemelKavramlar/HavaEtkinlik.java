package TemelKavramlar;
import java.util.Scanner;

public class HavaEtkinlik {
    public static void main(String[] args) {
        int degree;
        Scanner inp = new Scanner(System.in);
        System.out.println("Hava sıcaklığını Giriniz: ");
        degree = inp.nextInt();

        if (degree < 5) {
            System.out.println("Kayak Yapabilirsin.");
        }
        if (degree >= 5 && degree <=15) {
            System.out.println("Sinemaya Gidebilirsin.");
        }
        if (degree >= 10 && degree <=25) {
            System.out.println("Piknik Yapabilirsin.");
        }
        if (degree >25 ) {
            System.out.println("Yüzmeye Gidebilirsin.");
        }

        }
    }
