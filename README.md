Studi Kasus: Sistem Manajemen Perpustakaan Sederhana
Program ini saya buat untuk tugas UTS PBO. Isinya sistem perpustakaan sederhana.
Fungsinya buat nyimpen data buku dan anggota, terus bisa juga dipakai untuk transaksi peminjaman sama pengembalian buku.
Program ini masih jalan di console (text), jadi interaksinya pakai menu angka.

Fitur utama yang bisa dilakukan:
Tambah data buku
Tambah data anggota
Lihat daftar buku
Lihat daftar anggota
Pinjam buku
Kembalikan buku

Struktur Class
Item (abstract class) → kelas dasar yang nyimpen id, judul, dan status buku.
Buku (extends Item) → turunan dari Item, ada tambahan penulis.
Anggota → nyimpen data anggota dan daftar buku yang dia pinjam.
Transaksi (interface) → definisi kontrak method pinjam() dan kembali().
Perpustakaan (implements Transaksi) → kelas utama yang ngatur daftar buku & anggota, plus implementasi transaksi.
MainApp → class utama untuk jalanin program, isinya menu dan input Scanner.

Cara Menjalankan
Buka project di NetBeans.
Semua file class ada di package perpus.
Klik kanan project → Clean and Build.
Klik kanan project → Run.
Program bakal muncul menu di console, contoh:
1. tambah buku
2. tambah anggota
3. tampilkan buku
4. tampilkan anggota
5. pinjam buku
6. kembalikan buku
7. keluar

   nah tinggal pilih angka sesuai kebutuhan, misalnya 1 untuk tambah buku, 5 untuk pinjam buku, dll.
