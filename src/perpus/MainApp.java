/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpus;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perpustakaan lib = new Perpustakaan();

        // Data contoh awal
        lib.tambahBuku(new Buku("B001", "Laskar Pelangi", "Andrea Hirata"));
        lib.tambahBuku(new Buku("B002", "Bumi Manusia", "Pramoedya Ananta Toer"));
        lib.tambahAnggota(new Anggota("A001", "Gita Maharani"));
        lib.tambahAnggota(new Anggota("A002", "Indyra Putri"));

        while (true) {
            System.out.println("\n=== SISTEM PERPUSTAKAAN ===");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Tampilkan Buku");
            System.out.println("4. Tampilkan Anggota");
            System.out.println("5. Pinjam Buku");
            System.out.println("6. Kembalikan Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            String pilih = sc.nextLine().trim();

            switch (pilih) {
                case "1" -> {
                    System.out.print("ID Buku: "); String id = sc.nextLine();
                    System.out.print("Judul: "); String judul = sc.nextLine();
                    System.out.print("Penulis: "); String penulis = sc.nextLine();
                    lib.tambahBuku(new Buku(id, judul, penulis));
                    System.out.println("Buku ditambahkan.");
                }
                case "2" -> {
                    System.out.print("ID Anggota: "); String idA = sc.nextLine();
                    System.out.print("Nama: "); String nama = sc.nextLine();
                    lib.tambahAnggota(new Anggota(idA, nama));
                    System.out.println("Anggota ditambahkan.");
                }
                case "3" -> lib.tampilkanBuku();
                case "4" -> lib.tampilkanAnggota();
                case "5" -> {
                    lib.tampilkanAnggota();
                    System.out.print("Masukkan ID Anggota: "); String idA = sc.nextLine();
                    lib.tampilkanBuku();
                    System.out.print("Masukkan ID Buku: "); String idB = sc.nextLine();
                    boolean ok = lib.pinjam(idA, idB);
                    System.out.println(ok ? "Berhasil meminjam." : "Gagal: cek ID atau ketersediaan.");
                }
                case "6" -> {
                    lib.tampilkanAnggota();
                    System.out.print("Masukkan ID Anggota: "); String idA = sc.nextLine();
                    System.out.print("Masukkan ID Buku yang dikembalikan: "); String idB = sc.nextLine();
                    boolean ok = lib.kembali(idA, idB);
                    System.out.println(ok ? "Berhasil mengembalikan." : "Gagal: cek ID atau data peminjaman.");
                }
                case "0" -> {
                    System.out.println("Keluar. Terima kasih.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
