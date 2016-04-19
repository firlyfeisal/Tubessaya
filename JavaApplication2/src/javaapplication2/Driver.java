/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

public class Driver {

    public static void main(String[]  args){
        
        Aplikasi app = new Aplikasi();
        app.addPetugas(new Petugas(1,"Krishajar"));
        app.addPenyedia(new Penyedia(1,"Firly"));
        app.addPenyedia(new Penyedia(2,"Udin"));
        app.getPenyedia(1).createBarang(new Barang(1,"Coklat",15));
        app.getPenyedia(1).createBarang(new Barang(2,"Keju Craft",5));
        app.getPenyedia(2).createBarang(new Barang(3,"Susu Bendera",10));
        app.getPenyedia(2).createBarang(new Barang(4,"Coca-cola",6));
        app.addGudang(new Gudang(1,"Buahbatu"));
        app.addGudang(new Gudang(2,"Sarirejo"));

        
        
        Scanner input = new Scanner(System.in);
        int pilihan = -1;
        while (pilihan != 0)
        {
        System.out.println("");
        System.out.println("------------------------------------------------------------");
        System.out.println("Menu Admin");
        System.out.println("1.  Tambah Penyedia           2.  Hapus Penyedia");
        System.out.println("3.  Lihat Penyedia            4.  Tambah Petugas");
        System.out.println("5.  Hapus Petugas             6.  Lihat Petugas");
        System.out.println("7.  Tambah Gudang             8.  Lihat Gudang");
        
        System.out.println("Menu Penyedia");
        System.out.println("9.  Tambah Barang             10. Hapus Barang");
        System.out.println("11. Lihat Barang");
        
        System.out.println("Menu Petugas");
        System.out.println("12. Tambah Barang ke Gudang  13. Hapus Barang di Gudang");
        System.out.println("14. Lihat Barang");
        
        System.out.println("0. Exit");
        
        /*System.out.println("1. Tambah Penyedia            2. Lihat Penyedia");
        System.out.println("3. Hapus Penyedia             4. Tambah Barang");
        System.out.println("5. Lihat Barang               6. Tambah Petugas");
        System.out.println("7. Lihat Petugas              8. Hapus Petugas");
        System.out.println("9. Tambah Gudang              10. Lihat Gudang");
        System.out.println("11. Tambah Barang ke Gudang   12. Lihat Barang di Gudang");
        System.out.println("0. Keluar");*/
        System.out.print("Silakan Input Pilihan : ");
        pilihan = input.nextInt();
        app.mainMenu(pilihan);
        }
    }
}