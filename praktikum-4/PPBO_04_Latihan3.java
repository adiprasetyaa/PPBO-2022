// Nama : Adi Prasetya
// NIM  : M0521003

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan3 {
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
            // Tambahkan catch statement tambahan di sini
            catch(ArithmeticException e){
                sc.next();
                System.out.println("Pembagian dengan nol tidak bisa dilakukan!");
            }
            /* 
            Saya sudah menambahkan Exception untuk menangani pembagian nol
            tetapi ketika saya melakuan pembagian dengan nol, tidak memunculkan 
            exception message apapun dan hasilnya tetap infinity.
            Akan Tetapi ketika tipe data bil1 & bil2 tetap bertipe data integer
            dan saya mencoba melakukan pembagian dengan nol
            maka exception message akan ditampilkan.

            Arithmetic Exception termasuk dalama UNCHECKED EXCEPTION sehingga tidak
            dicek pada waktu compiling (run-time exception).
            
            */
            
        }

        sc.close();
    }
}

// Pembagian bilangan dengan 0 seharusnya tidak dapat dilakukan. Tambahkan catch statement
// tambahan untuk menangani pembagian dengan 0 pada source code tersebut!

