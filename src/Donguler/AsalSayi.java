package Donguler;

public class AsalSayi {
    public static void main(String[] args) {

        for (int i = 2; i<=100;i++){
            boolean control = true;

            for (int j =2 ;j<i;j++){

                if (i%j==0){control=false;}

            }
            if (control){
                System.out.print(" "+ i);

            }



        }


    }



}
