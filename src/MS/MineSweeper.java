package MS;

import java.util.Scanner;

public class MineSweeper {

  public static int SetLevel(Scanner inp){
        System.out.print("Level Giriniz(1-5 arasında): ");

        int level = inp.nextInt();

        if (level<=5 && level >=1)
        { level = level*16;
            return level;}
        else{SetLevel(inp);}

        return level;

    }

  public static String[][] CreateField(int satir, int sutun,int level){

      String[][] field = new String[satir][sutun];

      for (int i = 0; i<=satir -1; i++){

          for (int j = 0; j <=sutun-1;j++){

              if (Random(level)){
                  field[i][j]="*";
              }else{field[i][j]="-";}
          }
      }

  return field;
  }

  public static void PrintField(String[][] field){

      for (int i = 0; i<field.length;i++) {
          for (int j = 0; j < field[i].length; j++) {

              if(field[i][j].equals("*")){
               System.out.print("-" + " ");
              }else{
              System.out.print(field[i][j] + " ");
              }
          }
          System.out.println("\n");
      }

  }

  public static boolean Random(int level) {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= level;
    }

  public static int MineCount(int satir,int sutun,String[][] arr){
        int count = 0;
        int sat = satir-1 ;
        int su=sutun-1;


        if (sat!=0){


            if (su!=0){
      if (arr[sat-1][su-1]=="*")
        count++;}

      if (arr[sat-1][su]=="*")
          count++;

            if (su!=arr[0].length-1){
      if (arr[sat-1][su+1]=="*")
          count++;}
    }

      if (su!=0){
      if (arr[sat][su-1]=="*")
          count++;}
      if (arr[sat][su]=="*")
          count++;
      if (su!=arr[0].length-1){
      if (arr[sat][su+1]=="*")
          count++;}

      if (sat!=arr.length-1){
          if (su!=0){
      if (arr[sat+1][su-1]=="*")
          count++;}
      if (arr[sat+1][su]=="*")
          count++;
          if (su!=arr[0].length-1){
      if (arr[sat+1][su+1]=="*")
          count++;}}


        return count;


}


}
