# Laporan Posttest 1 - Pemrograman Berbasis Objek

## Identitas Mahasiswa
* **Nama**: Rangga Lawe
* **NIM**: 2409106043
* **Kelas**: Informatika
* **Program Studi**: S1 Informatika
* **Instansi**: Universitas Mulawarman

---

## 1. Deskripsi Program
Program ini adalah "sistem pendataan member gym", sebuah aplikasi manajemen member gym berbasis konsol (CLI). Program ini dibuat untuk memenuhi tugas Posttest 1 mata kuliah Pemrograman Berbasis Objek, yang mencakup implementasi dasar CRUD (*Create, Read, Update, Delete*) menggunakan bahasa pemrograman Java.

## 2. Struktur Program
Program terdiri dari dua file utama yang saling berkaitan:
* **Member.java**: Class model yang merepresentasikan data member (menyimpan atribut nama dan jenis paket).
* **Main.java**: Class utama yang menangani alur logika program, input dari user, dan penyimpanan data menggunakan `ArrayList`.

## 3. Penjelasan Fitur (CRUD)
1. **Tambah Member (Create)**: Menambahkan objek member baru ke dalam `ArrayList<Member>`.
2. **Lihat Daftar (Read)**: Menampilkan seluruh data member yang telah tersimpan di dalam list.
3. **Ubah Data (Update)**: Memperbarui data member yang sudah ada berdasarkan nomor urut yang dipilih user.
4. **Hapus Member (Delete)**: Menghapus data member dari list sehingga memori kembali bersih.

## 4. Cara Menjalankan Program
1. Buka folder `Posttest_1` melalui terminal atau VS Code.
2. Compile program dengan perintah: `javac Main.java Member.java`.
3. Jalankan program dengan perintah: `java Main`.
4. Ikuti instruksi menu yang muncul di layar.

## 5. Dokumentasi Program
### A. Create (Tambah Member)
Fitur untuk memasukkan data member baru ke dalam sistem.
![Tambah Member](posttest_1/img/create.png)

### B. Read (Lihat Daftar)
Menampilkan seluruh daftar member yang sudah terdaftar secara urut.
![Lihat Daftar](posttest_1/img/read.png)

### C. Update (Ubah Data)
Memperbarui informasi nama atau paket member yang sudah ada.
![Update Data](posttest_1/img/update.png)

### D. Delete (Hapus Member)
Menghapus data member tertentu dari daftar penyimpanan.
![Hapus Member](posttest_1/img/delete.png)
