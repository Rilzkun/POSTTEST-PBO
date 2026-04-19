# 🏋️‍♂️ Mulawarman Fitness - Member Management System
Sistem manajemen keanggotaan gym sederhana berbasis Java untuk memenuhi tugas **Posttest 5** mata kuliah **Pemrograman Berorientasi Objek (PBO)**.

## 📝 Deskripsi Proyek
Proyek ini adalah aplikasi CLI (Command Line Interface) untuk mengelola data member di **Mulawarman Fitness**. Versi ini telah diperbarui untuk menerapkan konsep **Abstract Class** dan **Interface** guna menciptakan struktur kode yang lebih profesional dan terorganisir.

## 🚀 Fitur Utama
* **CRUD Operations:** Tambah, Lihat, Update, dan Hapus data member secara dinamis.
* **Abstraksi Data:** Menggunakan kelas abstrak untuk standarisasi entitas member.
* **Sistem Layanan (Interface):** Perhitungan diskon dan poin otomatis yang berbeda untuk setiap kategori member.
* **Manajemen Tipe Member:**
    * **Reguler:** Fokus pada biaya harian.
    * **VIP:** Fasilitas akses loker khusus dan keuntungan poin lebih besar.

## 🏗️ Struktur Pemrograman (PBO)
1.  **Abstract Class (`Member`)**: Sebagai *parent class* yang tidak dapat diinstansiasi langsung, memiliki abstract method `getTipe()`.
2.  **Interface (`LayananTambahan`)**: Kontrak untuk method `hitungDiskon()` dan `berikanPoin()`.
3.  **Inheritance**: `MemberReguler` dan `MemberVIP` mewarisi properti dari class `Member`.
4.  **Polymorphism**: Menggunakan `ArrayList<Member>` untuk mengelola berbagai tipe objek dalam satu koleksi.
5.  **Casting & Instanceof**: Digunakan untuk mengakses fitur spesifik interface saat runtime.

## 📁 Struktur File
* `Main.java` - Driver class dan logika menu.
* `Member.java` - Abstract class (Parent).
* `LayananTambahan.java` - Interface.
* `MemberReguler.java` - Subclass Member Reguler.
* `MemberVIP.java` - Subclass Member VIP.

## 💻 Cara Menjalankan
1.  Buka terminal/command prompt.
2.  Compile semua file:
    ```bash
    javac *.java
    ```
3.  Jalankan aplikasi:
    ```bash
    java Main
    ```

---
**Dibuat Oleh:** Rangga Lawe
**Prodi:** S1 Informatika - Universitas Mulawarman