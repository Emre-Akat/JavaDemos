import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        //Tr:Kullanıcıdan iki adet sayı alma
        //En: Get two numbers from the user
        int nbr1,nbr2;
        int temp;//En: Temporary variable for swapping  Tr:Değiştirme için geçici değişken.
        System.out.println("1.sayıyı giriniz: ");
        nbr1=scan.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        nbr2=scan.nextInt();
        //Tr:Değişlenlerin değerlerini değiştirme
        //En: Swap the values of the variables
        temp=nbr1;
        nbr1=nbr2;
        nbr2=temp;
        //Tr:Ekrana yazdırma
        //En: Print the results
        System.out.println("ilk girdiğiniz sayı :"+nbr1);
        System.out.println("İkinci girdiğiniz sayı :"+nbr2);



    }
}