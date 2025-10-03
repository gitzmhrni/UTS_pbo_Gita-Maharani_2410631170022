/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

import java.util.ArrayList;

public class Perpustakaan implements Transaksi {
    private ArrayList<Buku> daftarBuku = new ArrayList<>();
    private ArrayList<Anggota> daftarAnggota = new ArrayList<>();

    public void tambahBuku(Buku b) { daftarBuku.add(b); }
    public void tambahAnggota(Anggota a) { daftarAnggota.add(a); }

    public Buku cariBukuById(String id) {
        for (Buku b : daftarBuku) {
            if (b.getId().equalsIgnoreCase(id)) return b;
        }
        return null;
    }

    public Anggota cariAnggotaById(String id) {
        for (Anggota a : daftarAnggota) {
            if (a.getId().equalsIgnoreCase(id)) return a;
        }
        return null;
    }

    public void tampilkanBuku() {
        System.out.println("=== Daftar Buku ===");
        if (daftarBuku.isEmpty()) System.out.println("[Belum ada buku]");
        for (Buku b : daftarBuku) System.out.println(b.getInfo());
    }

    public void tampilkanAnggota() {
        System.out.println("=== Daftar Anggota ===");
        if (daftarAnggota.isEmpty()) System.out.println("[Belum ada anggota]");
        for (Anggota a : daftarAnggota) System.out.println(a);
    }

    @Override
    public boolean pinjam(String idAnggota, String idBuku) {
        Anggota a = cariAnggotaById(idAnggota);
        Buku b = cariBukuById(idBuku);
        if (a == null || b == null) return false;
        return a.pinjamBuku(b);
    }

    @Override
    public boolean kembali(String idAnggota, String idBuku) {
        Anggota a = cariAnggotaById(idAnggota);
        Buku b = cariBukuById(idBuku);
        if (a == null || b == null) return false;
        return a.kembaliBuku(b);
    }
}
