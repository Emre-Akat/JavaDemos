import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

         int bakiye=1000;
         int islem;
         boolean devam=true;
         //tekrarlanabilir işlem için while döngüsü
        // While loop for repeatable operations
        while (devam) {
            //Seçenekler
            // Options
            System.out.println("1: Bakiye görüntüle");
            System.out.println("2: Para yatırma");
            System.out.println("3: Para çekme");
            System.out.println("4 :Sistemden çıkış");
            islem = scan.nextInt();

            switch (islem) {
                case 1:
                    System.out.println("Mevcut Bakiyeniz :" + bakiye);
                    break;
                case 2:
                    System.out.println("Yatırmak istediğiniz miktarı giriniz");
                    int miktar = scan.nextInt();
                    bakiye += miktar;
                    System.out.println("Mevcut bakiyeniz :" + bakiye);
                    break;
                case 3:
                    System.out.println("Çekmek istediğiniz miktarı giriniz ");
                    miktar = scan.nextInt();
                    // yerterli bakiye var mı kontrolü ve işlemi
                    // Check if there is sufficient balance and perform the transaction
                    if (miktar <= bakiye) {
                        bakiye -= miktar;
                        System.out.println("Kalan bakiyeniz");
                    } else {
                        System.out.println("Yeterli bakiyeniz bulunmamaktadır");
                    }
                    break;
                case 4:
                    System.out.println("Sistemden çıkılıyor.");
                    devam=false;
                    break;
                default:
                    System.out.println("Geçersiz işlem yaptınız :");
                    break;
            }
        }

    }
}