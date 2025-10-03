/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

import java.util.ArrayList;

public class Anggota {
    private String id;
    private String nama;
    private ArrayList<Buku> pinjaman = new ArrayList<>();

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public ArrayList<Buku> getPinjaman() { return pinjaman; }

    public boolean pinjamBuku(Buku buku) {
        if (buku != null && buku.isTersedia()) {
            pinjaman.add(buku);
            buku.setTersedia(false);
            return true;
        }
        return false;
    }

    public boolean kembaliBuku(Buku buku) {
        if (buku != null && pinjaman.remove(buku)) {
            buku.setTersedia(true);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return id + " | " + nama + " | Pinjaman: " + pinjaman.size();
    }
}
