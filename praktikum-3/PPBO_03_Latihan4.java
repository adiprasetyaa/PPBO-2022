// Nama : Adi Prasetya
// NIM  : M0521003

public class PPBO_03_Latihan4 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        //source code awal
        // for (int i = 1; i < 6; i++) {
        //     System.out.println("elemen ke-" + i + " = " + arr[i]);
        // }

        int j = 0;

        //perbaikan source code dengan DO WHILE
        do{
            System.out.println("elemen ke-" + j + " = " + arr[j]);
            j++;

        } while (j < arr.length);
    }
}

// Melanjutkan source code Latihan3 yang sudah diperbaiki, ubahlah source code dengan 
// mengganti dari perulangan FOR menjadi menggunakan DO ... WHILE
