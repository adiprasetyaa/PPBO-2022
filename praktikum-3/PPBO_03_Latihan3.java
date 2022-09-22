// Nama :  Adi Prasetya
// NIM  : M0521003



public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};

        //source code awal
        // for (int i = 1; i < 6; i++) {
        //     System.out.println("elemen ke-" + i + " = " + arr[i]);
        // }

        //perbaikan source code 
        for(int j = 0; j < arr.length; j++){
            System.out.println("elemen ke-" + j + " = " + arr[j]);
        }

        // penjelasan perulangan :
        // looping array ini dimulai dari j = 0, ketika j = 0, maka j < arr.length,
        // sehingga statement akan diprint, kemudian akan dilakukan increment (j++).
        // lalu, j menjadi bernilai j = 1, karena j = 1 masih kurang dari arr.length,
        // sehingga statement akan diprint, kemudian akan dilakukan increment (j++).
        // kemudian, menjadi bernilai j = 2, karena j = 2 masih kurang dari arr.length,
        // sehingga statement akan diprint, kemudian akan dilakukan increment (j++)
        // lalu. menjadi bernilai j = 3, karena j = 3 masih kurang dari arr.length,
        // sehingga statement akan diprint, kemudian akan dilakukan increment (j++)
        // kemudian, menjadi bernilai j = 4, karena j = 4 masih kurang dari arr.length,
        // sehingga statement akan diprint, kemudian akan dilakukan increment (j++)
        // setelah dilakukan increment, maka value pada j akan berubah menjadi j = 5,
        // sedangkan arr.length = 5. maka dari itu akan keluar dari loop dan program berhenti.
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:  
// Penulisan kode perulangan di atas kurang tepat karena index array dalam
// bahasa pemograman java biasanya dimulai dari 0, bukan 1. Selain itu, 
// panjang array sebelumnya diisi dengan (i<6) yang menyebabkan array 
// mengalami Array Index Out Of Bounds, yaitu suatu kondisi dimana
// sebuah program mencoba mengakses indeks array yang negatif, lebih 
// besar dari, atau sama dengan panjang array. Maka, untuk menghindari 
// terjadinya hal tersebut, sebaiknya menggunakan (j < arr.length).
