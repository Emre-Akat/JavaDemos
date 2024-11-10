package com.mycompany.numbertowordsconverter;

import java.util.Scanner;

public class NumberToWordsConverter {

    public static void main(String[] args) 
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("2 basamakli bir sayi giriniz :");
        int nbr1=scan.nextInt();
        //switch-case yapısını kullanarak iki basamklı sayımızı yazı şekilinde ekran yazdıracağız
        
        int birlerBasamagi=nbr1%10;
        int onlarBasamagi=nbr1/10;
        
        switch (onlarBasamagi)
        {
            case 1 -> System.out.println("On");
                case 2 -> System.out.println("Yirmi");
                case 3 -> System.out.println("Otuz");
                case 4 -> System.out.println("Kırk");
                case 5 -> System.out.println("Elli");
                case 6 -> System.out.println("Altmış");
                case 7 -> System.out.println("Yetmiş");
                case 8 -> System.out.println("Seksen");
                case 9 -> System.out.println("Doksan");
            default -> System.out.println("Beklenmeyen bir durum ile karşılaşıldı");
        }
        switch (birlerBasamagi) {
            case 1 -> System.out.println(" Bir");
                 case 2 -> System.out.print(" İki");
                 case 3 -> System.out.print(" Üç");
                 case 4 -> System.out.print(" Dört");
                 case 5 -> System.out.print(" Bes");
                 case 6 -> System.out.print(" alti");
                 case 7 -> System.out.print(" Yedi");
                 case 8 -> System.out.print(" Sekiz");
                 case 9 -> System.out.print(" Dokuz");
            default -> System.out.print("Beklenmeyen bir durum oluştu");
        }
        
    }
}
