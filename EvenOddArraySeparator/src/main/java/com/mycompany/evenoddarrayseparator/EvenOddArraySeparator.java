

package com.mycompany.evenoddarrayseparator;

/**
 *
 * @author emre-akat
 */
public class EvenOddArraySeparator {

   /*
    // tr Bu method verilen diziyi tek ve çift sayılar olarak ikiye ayırır.
    // en This method separates the given array into even and odd numbers.
    */

    public static int[][] ciftTekAyır(int[] dizi) {
        int ciftSayac = 0; // tr Çift sayıları saymak için sayaç
                           // en Counter to count even numbers
        int tekSayac = 0;  // tr Tek sayıları saymak için sayaç
                           // en Counter to count odd numbers
        // tr Dizide kaç tane tek ve çift sayı olduğunu kontrol ediyoruz.
        // en We check how many even and odd numbers are in the array.
        // tr Tanımlayacağımız çift ve tek dizilerin boyutunu belirlemek için.
        // en To determine the size of the even and odd arrays we will create.
        for (int s : dizi) {
            if (s % 2 == 0) {
                ciftSayac++;
            } else {
                tekSayac++;
            }
        }
        // tr Çift ve tek sayılar için diziler oluşturuluyor
        // en Arrays are created for even and odd numbers.
        int[] cift = new int[ciftSayac];
        int[] tek = new int[tekSayac];
        // tr Dizilerimizin index numaraları için yapılan tanımlamalar
        // en Definitions for the index variables of the arrays.
        int cdeger = 0;
        int tdeger = 0;
        // tr Diziyi kontrol ederek tek ve çift sayıları tanımladığımız dizilere ekliyoruz.
        // en We go through the array and add even and odd numbers to their respective arrays.
        for (int s : dizi) {
            if (s % 2 == 0) {
                cift[cdeger] = s;
                cdeger++;
            } else {
                tek[tdeger] = s;
                tdeger++;
            }
        }
       // tr Tek ve çift sayıları içeren dizileri döndürüyoruz.
       // en Returning the arrays containing even and odd numbers.
        return new int[][]{cift, tek};
    }

    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // tr İşlem yapacağımız dizimiz.
                                               // en The array on which we will perform the operation.
        int[][] sonuc = ciftTekAyır(dizi); // tr Dizimizi tek ve çift sayılara ayırıyoruz
                                          // en We separate the array into even and odd numbers.
        // tr Çift sayıları ekrana yazdırma
        // en Printing even numbers on the screen.
        System.out.print("Çift sayılar :");
        for (int s : sonuc[0]) {
            System.out.print(s + " ");
        }
        System.out.println(""); // tr Bu satır çıktı görünümünü düzenlemek için eklenmiştir
                              // en This line is added for output formatting.
        // tr Tek sayıları ekrana yazdırma
        // en Printing odd numbers on the screen.
        System.out.print("Tek Sayılar :");
        for (int s : sonuc[1]) {
            System.out.print(s + " ");
        }
    }
}



