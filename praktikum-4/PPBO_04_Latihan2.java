// Nama : Adi Prasetya
// NIM  : M0521003

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
// Jawab: 
/*
    Ketik bilangan pertama : a 
    Input salah, masukkan angka
    Ketik bilangan pertama : b
    Input salah, masukkan angka
    Ketik bilangan pertama : 10
    Ketik bilangan kedua : 4
    10 / 4 = 2.5

    Pada source code ini, ketika mencoba memasukkan nilai (value) berupa char/string
    program tidak langsung berhenti (keluar), tetapi memunculkan sebuah pesan, yaitu
    input salah, masukkan angka. Hal ini terjadi karena exception berhasil diatasi
    dengan menambahkan try dan catch sehingga program tetap berjalan dan dieksekusi.
    Hal ini tentunya berbeda dengan soal A pada souce code (latihan1), dimana program 
    berhenti dan memunculkan exception error. Hal ini disebabkan karena exception
    tidak dan/atau belum berhasil diatasi. 

 */
