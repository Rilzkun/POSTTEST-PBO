# Laporan Posttest 4 - Pemrograman Berorientasi Objek (PBO)

## Informasi Mahasiswa
- **Nama:** Rangga Lawe
- **NIM:** 2409106043
- **Studi:** S1 Informatika - Universitas Mulawarman
- **Project:** Mulawarman Fitness System 

---

## Deskripsi Project
Project ini adalah sistem manajemen keanggotaan fitness yang memungkinkan pengelolaan data member (Reguler & VIP). Pada Posttest 4 ini, sistem telah mengimplementasikan prinsip **Polymorphism** untuk meningkatkan fleksibilitas fungsi program tanpa mengubah struktur dasar kode.

---

## Penerapan Polymorphism

### 1. Method Overriding (Runtime Polymorphism)
Method overriding dilakukan dengan mendefinisikan ulang method `tampilkan()` dari superclass `Member` ke dalam subclass `MemberVIP` dan `MemberReguler`. Hal ini memungkinkan setiap tipe member menampilkan detail informasi yang berbeda (nomor loker untuk VIP dan biaya harian untuk Reguler).

### 2. Method Overloading (Compile-time Polymorphism)
Method overloading diterapkan dengan membuat method yang memiliki nama sama namun dengan tanda tangan (parameter) yang berbeda:
- **Overloading pada class `Member`**: `tampilkan(String salam)` — Digunakan untuk memberikan pesan sambutan yang dinamis kepada member.
- **Overloading pada class `MemberReguler`**: `tampilkan(int tambahan)` — Digunakan untuk mengkalkulasi total biaya awal (biaya harian + biaya pendaftaran admin).

---

## Struktur Kode
1. **Member.java**: Parent class (Superclass) yang menyimpan data dasar (`nama`, `id`).
2. **MemberVIP.java**: Child class (Subclass) khusus untuk member premium dengan fasilitas loker.
3. **MemberReguler.java**: Child class (Subclass) untuk member umum dengan tarif harian.
4. **Main.java**: Program utama yang mengatur alur logika CRUD menggunakan `ArrayList`.

---

## Panduan Penggunaan
1. Jalankan `Main.java`.
2. Pilih menu **1** untuk menambah data (pilih tipe 1 atau 2).
3. Pilih menu **2** untuk melihat hasil penerapan Polymorphism (akan muncul salam otomatis dan perhitungan biaya admin khusus member reguler).
4. Gunakan menu **3** dan **4** untuk memperbarui atau menghapus data.