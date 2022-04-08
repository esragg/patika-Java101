/* Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve 
nuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız. */
import java.util.Scanner;

public class SifreYenileme {
    public static void main(String[] args) {
        String userName, password, passwordNew;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanici Adinizi giriniz : ");
        userName = input.nextLine();
        System.out.print("Sifrenizi giriniz : ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giris Yaptiniz :)");
        } else{
            System.out.println("Bilgileriniz Yanlis!");
            System.out.print("Sifre Sifirlama y/n\n");
            String renewPassword = input.nextLine();
            if(renewPassword.equals("y")) {
                System.out.print("Yeni sifreyi giriniz : ");
                passwordNew = input.nextLine();
                if(passwordNew.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Daha sonra tekrar deneyiniz.");
            }
        }
    }
}
