// Nama     : Adi Prasetya 
// Kelas    : M0521003

//SOAL [3]

package com.java.p8a;

import com.java.p8.Buku;

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
 *  Error terjadi karena sebagai berikut.
 *  a) File Buku.java berada pada package com.java.p8, sedangkan file ClassX.java
 *     berada pada package com.java.p8a. Maka dari itu, Class Buku pada package 
 *     com.java.p8 tidak dapat diakses oleh package ClassX pada package com.java.p8a.
 *     Solusinya adalah dengan menambahkan import com.java.p8.Buku pada source code
 *     ClassX.java dalam package com.java.p8a.
 * 
 *  Akan tetapi, setelah dilakukan import tetap muncul error sebagai berikut.
 *  a) Access modifier pada variabel isbn adalah default
 *  b) Access modifier pada variabel penulis adalah private
 *  c) Access modifier pada variabel penerbit adalah protected
 *  d) Access modifier pada variabel tahunTerbit adalah default
 *  Salah satu cara mengatasi hal ini adalah dengan cara mengubah access modifier
 *  pada keempat variabel tersebut menjadi public sehingga dapat diakses oleh file
 *  yang berada dalam package yang berbeda.
 *  
 *  Selain itu, juga terdapat error, yaitu Access modifier pada method printDataBuku()
 *  merupakan protected, sehingga tidak dapat diakses oleh ClassX pada package p8a
 *  karena ClassX bukan merupakan subclass dari class Buku.
 */

