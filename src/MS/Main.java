package MS;

import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz. \n # Zorluk Seçimi #");

        Scanner inp = new Scanner(System.in);
        System.out.print("Satır Giriniz: ");
        int sa= inp.nextInt();
        System.out.print("Sutun Giriniz: ");
        int su = inp.nextInt();

        int level = MineSweeper.SetLevel(inp);
        String[][]  field = MineSweeper.CreateField(sa,su,level);

           MineSweeper.PrintField(field);
           System.out.println("Açmak istediğiniz kutu için \n");
        System.out.print("Satır Giriniz: ");
        int sa2= inp.nextInt();
        System.out.print("Sutun Giriniz: ");
        int su2 = inp.nextInt();
        int count = MineSweeper.MineCount(sa2,su2,field);
        field[sa2-1][su2-1] = String.valueOf(count);
        MineSweeper.PrintField(field);







    }
}
