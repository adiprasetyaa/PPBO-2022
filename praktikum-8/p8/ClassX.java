// Nama     : Adi Prasetya 
// Kelas    : M0521003

//SOAL [2]

package com.java.p8;

public class ClassX {
    public static void main(String[] args) {
        //buat objek buku
        Buku buku = new Buku ("432A3284", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);
        //tampilkan data buku lewat method printDataBuku
        buku.printDataBuku();

        // akses ke variabel yang ada di objek buku 
        System.out.println(buku.isbn);
        System.out.println(buku.judul);
        System.out.println(buku.penulis);
        System.out.println(buku.penerbit);
        System.out.println(buku.tahunTerbit);
        
    }
}

/*
 * [SOAL] 
 * Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier?
 * Jelaskan penyebab errornya!
 */

/*
 * [JAWABAN]
 *  Ada error yang ditemui pada ClassX yang berkaitan dengan access modifier.
 *  Hal ini dikarenakan access modifier dari variabel "penulis" adalah private 
 *  sehingga tidak dapat diakses oleh ClassX pada file ClassX.java meskipun
 *  file ClassX.java berada dalam satu package yyg sama dengan file Buku.java.
 *  Solusi untuk  mengatasi error ini adalah dengan cara mengubah access modifier
 *  pada variabel "penulis" menjadi public / protected.
 * 
 */
