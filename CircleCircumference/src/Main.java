import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //Türkçe :Çemberin çevresini hesaplama.
        // English: Calculates the circumference of a circle
        System.out.println("Çemberin yarı çapını giriniz :");
        double r = scan.nextDouble();
        double pi = 3.14;
        //Türkçe:Çemberin çevresinin hesaplamak için gerekli olan formül:2*pi*r1
        //English:The formula to calculate the circumference of a circle: 2 * pi * r
        double cevre = 2 * pi * r;
        //Türkçe:Çemberin çevresini yazdırmak için.
        //English:To print the circumference of a circle."
        System.out.println("Yarıçapını girmiş olduğunuz dairenin çevresi:" + cevre);
    }
}