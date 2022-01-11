package TemelKavramlar;
import java.util.Scanner;
public class KullaniciGirisi {

    public static void main(String[] args) {

        String userName,password,newPassword;
        int p;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName= inp.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password = inp.nextLine();

        if (userName.equals("huseyin") && password.equals("şifrem")){
            System.out.println("Giriş Başarılı");

        }else{
            System.out.print("Hatalı Bilgi Girdiniz. Şifrenizi değiştirmek için 1 e basınız.");
            p = inp.nextInt();
            inp.nextLine();
            if (p==1){
                System.out.print("Yeni Şifre giriniz: ");
                newPassword = inp.nextLine();

                if(!newPassword.equals("şifrem")){
                    System.out.println("Şifre güncellendi");
                } else
                {
                    System.out.println("Hatalı Şifre Girdiniz");

                }
            }
             }
        }
    }

