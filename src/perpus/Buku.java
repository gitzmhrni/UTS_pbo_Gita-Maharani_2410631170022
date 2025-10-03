/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package perpus;

public class Buku extends Item {
    private String penulis;

    public Buku(String id, String judul, String penulis) {
        super(id, judul);
        this.penulis = penulis;
    }

    public String getPenulis() { return penulis; }

    @Override
    public String getInfo() {
        return getId() + " | " + getJudul() + " - " + penulis + (isTersedia() ? " (Tersedia)" : " (Dipinjam)");
    }

    @Override
    public String toString() { return getInfo(); }
}
