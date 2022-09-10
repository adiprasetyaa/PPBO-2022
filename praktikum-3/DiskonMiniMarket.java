import java.util.Scanner;

public class DiskonMiniMarket {
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

        sc.close();
    }
}
