// Nama     : Adi Prasetya 
// Kelas    : M0521003

//SOAL [5]

package com.java.p8a;

import com.java.p8.Buku;

public class BukuInherit extends Buku{

    public BukuInherit(String isbn, String judul,String penulis, String penerbit, int tahunTerbit){
        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
    
}

/*
 * [SOAL] 
 * Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier?
 * Jelaskan penyebab errornya!
 */

/*
 * [JAWABAN]
 *  Ada error yang ditemui pada ClassX yang berkaitan dengan access modifier.
 *  Error yang terjadi hampir sama seperti error yang terjadi pada soal [3]. 
 *  Error terjadi karena sebagai berikut.
 *  a) Access modifier pada variabel isbn adalah default
 *  b) Access modifier pada variabel penulis adalah private
 *  c) Access modifier pada variabel tahunTerbit adalah default
 *  Salah satu cara mengatasi hal ini adalah dengan cara mengubah access modifier
 *  pada ketiga variabel tersebut menjadi public sehingga dapat diakses oleh file
 *  yang berada dalam package yang berbeda.
 *  
 */