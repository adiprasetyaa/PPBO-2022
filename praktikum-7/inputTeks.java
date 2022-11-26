// Nama 	: Adi Prasetya
// NIM 		: M0521003

// [SOAL 1]

package com.praktikum7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputTeks {
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
	public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile = new File("/home/atya/sample3.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			outStream.print(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InputTeks it = new InputTeks();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}

}

/* [JAWABAN]
 * 
 * Hasilnya adalah dibuat sebuah file baru dengan nama sample3.data
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
 */
