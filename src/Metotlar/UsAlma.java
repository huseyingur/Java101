package Metotlar;
import java.awt.*;
import java.util.Scanner;

public class UsAlma {

    static int UsAl(int taban, int us){ if(us < 1){
        return 1;
    }
    else{
        return taban * UsAl(taban,us-1);
    }
    }

    public static void main(String[] args) {

        int taban,us;

        Scanner inp = new Scanner(System.in);
        System.out.print("Taban Değeri Giriniz: ");
        taban = inp.nextInt();
        System.out.print("Üs Değeri Giriniz: ");
        us=inp.nextInt();

        System.out.println("Sonuc: " + UsAl(taban,us));



    }
}
