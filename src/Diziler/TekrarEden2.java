package Diziler;

public class TekrarEden2 {

    public static   boolean isPrinted(int[] arr, int a){

        for (int i =0; i<= arr.length-1; i++){
        if (a == arr[i]){
            return true;
        }


    }
        return false;
    }


    public static void main(String[] args) {

        int list[] = {10, 20, 20, 10, 10, 20, 5, 20};
        int printedList[] = new int[list.length];

        System.out.println("Tekrar Sayıları");


        for (int i = 0; i < list.length;i++){

            int count = 0;

            for (int j = 0; j < list.length;j++){
                if(list[i]==list[j]){
                    count ++;
                }
            }

            if (!isPrinted(printedList,list[i])){
            System.out.println(list[i] + " Sayısı " + count + " Kere tekrar edildi.");
            printedList[i] = list[i];
            }


        }
    }
}
