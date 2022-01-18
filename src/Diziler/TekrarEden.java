package Diziler;
import java.util.Arrays;

public class TekrarEden {

    static boolean isFind(int[] arr, int value){
        for (int i: arr){
            if(i == value)
            {return true;}
        }

return false;
    }

    public static void main(String[] args) {
        int[] list = {3,5,5,9,11,9,21,25,28,22,21,11,10,28,10};
        int[] duplicate = new int[list.length];
        int starti = 0;

        for (int i = 0; i <list.length; i++){

            for (int j =0;j<list.length;j++){

                if ((i!=j) && (list[i]==list[j])){

                    if (!isFind(duplicate,list[i]))
                    {
                        if (list[i]%2==0)
                        duplicate[starti++]=list[i];
                    }


                    break;
                }

            }

        }
System.out.println(Arrays.toString(duplicate));
    }
}
