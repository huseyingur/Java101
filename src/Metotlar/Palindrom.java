package Metotlar;

public class Palindrom {

    static boolean isPalindrom(int number){

        int temp =  number, reverseNumber =0,lastNumber=0;

        while(temp !=0){
            lastNumber = temp %10;
            reverseNumber = (reverseNumber*10)+ lastNumber;
            temp /=10;

        }

        return reverseNumber == number;

    }
    public static void main(String[] args) {


if (isPalindrom(456))
{System.out.println("Polindrom Sayı");}

else {System.out.println("Polindrom Sayı Değil");}


    }
}
