import java.util.Scanner;
public class Main {
    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        //Kullanıdan iki sayı alma
        // Get two numbers from the user
        int nbr1,nbr2;
        System.out.println("Karşılaştırmak isteiğiniz iki adet sayıyı giriniz:");
        System.out.println("1.sayı: ");
        nbr1=scan.nextInt();
        System.out.println("2.sayı: ");
        nbr2=scan.nextInt();
        //Sayıları karşılaştırma ve ekrana yazdırma
        // Compare the numbers and print the results
        if (nbr1>nbr2)
        {
            System.out.println("1.sayı:"+nbr1+" 2.sayı:"+nbr2+" Birinci sayı ikinci sayıdan büyüktür.");
        }
        else if (nbr2>nbr1)
        {
            System.out.println("2.sayı:"+nbr2+" 1.sayı:"+nbr1+" İkinci sayı birinci sayıdan büyüktür.");
        }
        else
        {
            System.out.println( "sayılar  birbirine eşittir.");
        }

    }
}