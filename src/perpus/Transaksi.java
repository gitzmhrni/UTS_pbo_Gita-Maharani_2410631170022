/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package perpus;

public interface Transaksi {
    boolean pinjam(String idAnggota, String idBuku);
    boolean kembali(String idAnggota, String idBuku);
}
