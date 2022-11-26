// Nama     : Adi Prasetya 
// Kelas    : M0521003

//SOAL [4]

package com.java.p8;

public class BukuInherit extends Buku{

    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit){
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
 *  Ada error yang ditemui pada BukuInherit yang berkatain dengan access modifier.
 *  Hal ini dikarenakan access modifier pada variabel 'penulis' adalah private.
 *  Variabel dengan access modifier private hanya dapat diakses, baik
 *  itu sebagai setter ataupun getter dalam Class tersebut.
 */
