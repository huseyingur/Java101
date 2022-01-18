package Diziler;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Siralama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print(" Dizi boyutunu giriniz: ");
        int boyut = inp.nextInt();

        int[] list = new int[boyut];

        for (int i =0; i <= boyut-1;i++){
            System.out.print(i+1 +". Sayıyı Giriniz: ");
            list[i] = inp.nextInt();
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

    }
}
