import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        //Tr:Kullanıcıdan girmek istediği mesafeyi alma
        // En: Get the distance the user wants to travel
        System.out.println("Gitmek istediğiniz mesafeyi km cinsinden giriniz:");
        double mesafe=scan.nextDouble();
        //Tr:Kullanıcıdan ne kadar sürede gitmek istediğini alma
        // En: Get the time the user wants to take to travel
        System.out.println("Gitmek istediğiniz süreyi saat cinsinden giriniz :");
        double zaman=scan.nextDouble();
        //Tr: Sürati hesaplayan formül
        //En:Formula to calculate speed
        double v=mesafe/zaman;
        //Tr:Ekrana yazdırma
        //En:Print to the screen
        System.out.println("Gitmeniz gereken ortalama süratiniz: "+v+" km/s'dir.");

    }
}