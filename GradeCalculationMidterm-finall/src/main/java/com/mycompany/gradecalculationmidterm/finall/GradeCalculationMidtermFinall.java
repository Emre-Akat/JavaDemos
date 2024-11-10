package com.mycompany.gradecalculationmidterm.finall;

import java.util.Scanner;

public class GradeCalculationMidtermFinall {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // kullanıcıdan vize ve final notlarını alma
        // Get midterm and final grades from the user
        System.out.print("Vize notunuzu giriniz:");
        double vize = scan.nextDouble();
        System.out.println("Final notunuzu giriniz:");
        double finall = scan.nextDouble();
        //kullanıcının yıl sonu notunu hesaplama
        // Calculate the user's year-end grade
        double not = (vize * 0.4) + (finall * 0.6);
        System.out.println("Yıl sonu notunuz  =" + not);
        //kulllanıcının geçip geçmediğini kontrol etme ve yazdırma
        // Check if the user has passed or failed and display the result
        if (not > 90) {
            System.out.println("AA ile dersi geçtiniz.");
        } else if (not >= 85) {
            System.out.println("BA ile geçtiniz.");
        } else if (not >= 80) {
            System.out.println("BB ile dersi geçtiniz.");
        } else if (not >= 75) {
            System.out.println("CB ile geçtiniz .");
        } else if (not >= 50) {
            System.out.println("Koşullu geçtiniz");
        } else {
            System.out.println("Kaldınız");
        }

    }
}
