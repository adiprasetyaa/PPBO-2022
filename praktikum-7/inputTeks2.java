// Nama 	: Adi Prasetya
// NIM 		: M0521003

// [SOAL 2]

package com.praktikum7;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class InputTeks2{
	// method ini untuk input teks oleh user melalui keyboard
	public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		try (Scanner sc = new Scanner(System.in)) {
            // ambil 1 kalimat, setelah tekan enter teks akan diambil
            String str1 = sc.nextLine();
            return str1;
        }
	}

	// untuk menyimpan teks yang diketik user ke file
    // Modifikasi proses output menjadi menggunakan DataOutputStream dan method writeBytes()
    public void simpanTeks(String teks) {
        try{
            FileOutputStream outFile = new FileOutputStream("/home/atya/sample4.data");
            DataOutputStream dataOutput = new DataOutputStream(outFile);
    
            dataOutput.writeBytes(teks);
            dataOutput.flush(); //melakukan flush agar dapat melakukan 'write' pada file
            dataOutput.close(); //menutup file
            System.out.println("!! file sample4.data berhasil disimpan !!");

        } catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

	public static void main(String[] args) {

		InputTeks2 it = new InputTeks2();

		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();

		// memanggil method simpanTeks
		it.simpanTeks(kalimat);

	}
}

/* [JAWABAN]
 * 
 * Hasilnya adalah dibuat sebuah file baru dengan nama sample4.data
 * yang disimpan dalam /home/atya. File tersebut berisi sebuah kalimat
 * yang sudah dituliskan sebelumnya. 
 * 
 * Dibuat objek dari class 'InputTeks' dengan nama 'it' kemudian, dipanggil method 
 * ketikTeks() dimana method tersebut akan menerima input dengan tipe data string 
 * dari user kemudian dikembalikan sebagai string juga. Lalu, hasil return dari method
 * ketikTeks() akan di-assign ke dalam variabel kalimat dengan tipe data string
 * Setelah itu, dipanggil method simpanTeks() dimana method ini akan membuat 
 * sebuah file baru dengan nama sample3.data. Selanjunya, input dari user yang
 * disimpan dalam variabel kalimat akan di-write ke dalam file sample3.data, 
 * bukan pada terminal melalui method print(). Kemudian, file disimpan dan ditutup.
 *
 * 
 * [PERBEDAAN]
 * [PrintWriter.write()]
 * Digunakan untuk mencetak representasi objek yang diformat ke input stream teks. 
 * PrintWriter mengimplementasikan semua metode print() yang ditemukan di PrintStream. 
 * Selain itu juga tidak berisi method untuk menulis raw bytes, di mana program 
 * harus menggunakan byte stream yang tidak dikodekan. write() digunakan untuk
 * menuliskan string yang spesifik dalam stream. 
 * 
 * [DataOutputStream.writeBytes()]
 * Digunakan untuk menulis tipe data Java primitif ke stream output dengan cara portabel.
 * Kemudian, dapat menggunakan input stream data untuk membaca data kembali. Selain itu,
 * writeBytes digunakan untuk menulis satu byte ke output stream sebagai nilai 1-byte.
 * 
 * 
 * 
 * 
 * 
 * 
 *  
 */
