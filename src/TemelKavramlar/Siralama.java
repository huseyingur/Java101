package TemelKavramlar;
import javax.swing.*;
import java.util.Scanner;

public class Siralama {
    public static void main(String[] args) {

        int a, b, c;
        Scanner inp = new Scanner(System.in);

        System.out.print("1. Sayı : ");
        a = inp.nextInt();
        System.out.print("2. Sayı : ");
        b = inp.nextInt();
        System.out.print("3. Sayı : ");
        c = inp.nextInt();

        if (a < b) {
            if (a < c) {
                System.out.println("En küçük sayı :" + a);
                if (b<c){
                    System.out.println("2. En küçük sayı :" + b);
                    System.out.println("3. En küçük sayı :" + c);
                }else{
                    System.out.println("2. En küçük sayı :" + c);
                    System.out.println("3. En küçük sayı :" + b);
                }

            } else {
                System.out.println("En küçük sayı :" + c);
                System.out.println("2. En küçük sayı :" + a);
                System.out.println("3. En küçük sayı :" + b);


            }

        } else if(b<c){
            System.out.println("En küçük sayı :" + b);
                if (a<c){
                    System.out.println("2. En küçük sayı :" + a);
                    System.out.println("3. En küçük sayı :" + c);
                }else   {
                    System.out.println("2. En küçük sayı :" + c);
                    System.out.println("3. En küçük sayı :" + a);
                }

        }else {
            System.out.println("En küçük sayı :" + c);
            System.out.println("2. En küçük sayı :" + b);
            System.out.println("3. En küçük sayı :" + a);


        }
    }
}



