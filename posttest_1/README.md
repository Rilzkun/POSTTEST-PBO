# Laporan Posttest 1 - Pemrograman Berbasis Objek

## Identitas Mahasiswa
* **Nama:** Rangga Lawe
* **NIM:** 2409106043
* **Kelas:** Informatika 2024
* **Studi:** S1 Informatika (Universitas Mulawarman)

---

## Judul Program
**Sistem Pendataan Member GYM**

## Deskripsi Program
Program ini berfungsi untuk mengelola data member pada sebuah gym. Program menerapkan konsep dasar Pemrograman Berbasis Objek dengan memisahkan model data dan logika utama.

## Fitur Utama (CRUD)
1. **Create (Tambah Member)**: User dapat menambahkan data nama dan paket member ke dalam list.
2. **Read (Lihat Daftar)**: Menampilkan seluruh member yang tersimpan di memori.
3. **Update (Ubah Data)**: Memperbarui informasi member berdasarkan nomor urut di daftar.
4. **Delete (Hapus Member)**: Menghapus data member tertentu dari sistem.

## Penjelasan Teknis
* **ArrayList**: Digunakan sebagai wadah penyimpanan dinamis untuk objek dari class `Member`.
* **Class Member**: Bertindak sebagai model data (Object) yang menyimpan atribut `nama` dan `paket`.
* **Input Validation**: Terdapat pengecekan indeks agar program tidak error saat user memasukkan nomor urut yang tidak terdaftar.
* **Scanner Management**: Menggunakan `input.close()` untuk mencegah resource leak.

## Cara Menjalankan
1. Pastikan file `Main.java` dan `Member.java` berada dalam satu folder.
2. Buka folder tersebut di VS Code.
3. Jalankan file `Main.java` melalui tombol Run atau terminal.
4. Pilih menu 1-5 untuk mulai mengoperasikan sistem.