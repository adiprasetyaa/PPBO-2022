// Nama : Adi Prasetya
// NIM  : M0521003

import java.util.Scanner;

public class PPBO_04_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ketik bilangan pertama : ");
        int bil1 = sc.nextInt();
        System.out.print("Ketik bilangan kedua : ");
        int bil2 = sc.nextInt();
        double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);
        System.out.println(bil1 + " / " + bil2 + " = " + hasil);
        sc.close();
    }
}

/* a. Ketik huruf misalnya f untuk input bilangan pertama kemudian tekan ENTER
 - Apakah program masih dapat dijalankan setelah user memasukkan f sebagai input untuk bilangan pertama?
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
    Exception in thread "main" java.util.InputMismatchException
        at java.base/java.util.Scanner.throwFor(Scanner.java:939)
        at java.base/java.util.Scanner.next(Scanner.java:1594)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2258)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
        at PPBO_04_Latihan1.main(PPBO_04_Latihan1.java:10)

    EXCEPTION ini terjadi karena masukkan (input) yang dimasukkan oleh user adalah salah
    Input yang dapat diterima oleh program adalah INTEGER tetapi input yg dimasukkan oleh
    user adalah 'f' yang bertipe data char/string sehingga menyebabkan munculnya
    InputMismatchException

*/

/* b. Pilih salah satu angka sebagai bilangan pertama misal 5, kemudian ketik angka 0 untuk input bilangan kedua. 
    Jelaskan output yang muncul!
 - Tulis output yang muncul!
 - Jelaskan maksud dari output tersebut! */
/*  JAWAB :
    OUTPUT : 
    5 / 0 = Infinity

    Output yang muncul adalah 5 dibagi dengan 0 yang menghasilkan hasil tak terhingga 
    (infinity). Input ini tidak memunculkan exception apapun karena tipe data dari 
    bil1 & bil2 sudah dicasting ke tipe data double.
*/
