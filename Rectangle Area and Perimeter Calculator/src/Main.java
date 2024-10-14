import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan =new Scanner(System.in);
        //Tr:Kullanıcıdan Dikdörtgenin kenarlarının alınması
        //En: Get the sides of the rectangle from the user
        System.out.println("Dikdörtgenin 1.Kenarını giriniz:");
        double kenar1=scan.nextDouble();
        System.out.println("Dikdörtgenin 2.Kenarını giriniz:");
        double kenar2=scan.nextDouble();
        //Tr:Dikdörtgenin alanını hesaplayan formül
        //En: Formula to calculate the area of the rectangle
        double alan=kenar1*kenar2;
        //Tr:Dikdörtgenin çevresini hesaplayan formül
        //En: Formula to calculate the perimeter of the rectangle
        double cevre=(kenar1+kenar2)*2;
        //Tr: Ekrana yazdırma
        //En: Print to the screen
        System.out.println("Kenarlarını girmiş olduğunuz dikdörtgenin alanı :"+alan+"\n Çevresi :"+cevre);
    }
}




