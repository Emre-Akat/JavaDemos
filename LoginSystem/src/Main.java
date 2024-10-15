import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //kullanıcı adı ve şifresi
        // username and password
        String sys_kul_adi = "admin";
        String paraloa = "12345";
        //kullanıcıdan ad ve şifre alma
        // getting username and password from the user
        System.out.println("Kullanıcı adınıızı giriniz :");
        String kullanici_adi = scan.nextLine();

        System.out.println("Parolanızı Giriniz:");
        String kullanici_parola = scan.nextLine();
            //Karşılaştırma
            // Comparison
        if (!(paraloa.equals(kullanici_parola)) && !(kullanici_adi.equals(sys_kul_adi)))
        {
            System.out.println("Kullanıcı adı ve parola yanlış");
        }
     else if ((paraloa.equals(kullanici_parola)) && !(kullanici_adi.equals(sys_kul_adi)))
        {
            System.out.println("Kullanıcı adı yanlış");
        }
      else if (!(paraloa.equals(kullanici_parola)) && (kullanici_adi.equals(sys_kul_adi)))
        {
            System.out.println("Parola yanlış");
        }
      else
        {
            System.out.println("Hoş geldiniz");

        }
    }
}