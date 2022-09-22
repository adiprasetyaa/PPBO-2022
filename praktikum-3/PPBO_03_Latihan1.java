// Nama : Adi Prasetya
// NIM  : M0521003

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
        
        // tambahkan code untuk menyimpan nominal total pembelian
        long TOTALPAYMENT = sc.nextLong();

        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if (TOTALPAYMENT < 50000) {
            TOTALPAYMENT = TOTALPAYMENT * (100 / 100);
        }

        else if (TOTALPAYMENT >= 50000 && TOTALPAYMENT < 75000) {
            TOTALPAYMENT = (long) (TOTALPAYMENT - TOTALPAYMENT * 0.05);
        }

        else if (TOTALPAYMENT >= 75000 && TOTALPAYMENT < 125000) {
            TOTALPAYMENT = (long) (TOTALPAYMENT - TOTALPAYMENT * 0.15);
        }

        else if (TOTALPAYMENT >= 125000) {
            TOTALPAYMENT = (long) (TOTALPAYMENT - TOTALPAYMENT * 0.2);
        }

        else {
            System.out.println("!! MAAF NOMINAL YANG ANDA MASUKKAN SALAH/TIDAK VALID !!");
        }

        // tambahkan code untuk menampilkan nominal yang harus dibayar
        System.out.println("TOTAL PEMBAYARAN : " + TOTALPAYMENT);

        sc.close();// tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        
        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000
