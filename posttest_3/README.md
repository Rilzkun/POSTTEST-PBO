# Mulawarman Fitness - Sistem Manajemen Member Gym
**Tugas Posttest 3 - Pemrograman Berorientasi Objek (PBO)**
**Nama:** Rangga Lawe  
**NIM:** 2409106043  
**Prodi:** Informatika - Universitas Mulawarman

Proyek ini adalah sistem CRUD (Create, Read, Update, Delete) sederhana untuk mengelola data member di fitness center, dengan menerapkan konsep **Inheritance (Pewarisan)** sesuai instruksi tugas.

## 📌 Deskripsi Tugas
1. **Lanjutkan Project:** Mengembangkan sistem dari posttest sebelumnya.
2. **Inheritance:** Menerapkan minimal 2 subclass.
3. **Tipe Inheritance:** Menggunakan *Hierarchical Inheritance*.
4. **Logis:** Pembagian kelas didasarkan pada tipe member yang nyata (Reguler & VIP).

## 📂 Struktur Class
Proyek ini terdiri dari 4 file utama:
* **`Member.java` (Superclass)**: Menampung atribut umum seperti `nama` dan `id`.
* **`MemberReguler.java` (Subclass)**: Menambahkan atribut khusus `biayaHarian`.
* **`MemberVIP.java` (Subclass)**: Menambahkan atribut khusus `fasilitasLoker`.
* **`Main.java`**: Driver class untuk menjalankan menu CRUD.

## 🛠️ Konsep OOP yang Diterapkan
* **Inheritance**: Menggunakan keyword `extends` untuk mewariskan sifat dari kelas `Member` ke subclass.
* **Encapsulation**: Menggunakan akses modifier `protected` pada superclass agar bisa diakses oleh subclass, dan `private` untuk atribut khusus.
* **Method Overriding**: Menggunakan `@Override` pada method `tampilkan()` untuk memberikan output yang berbeda sesuai tipe member.
* **Polymorphism**: Menggunakan `ArrayList<Member>` untuk menyimpan objek dari berbagai subclass dalam satu list yang sama.

## 🚀 Cara Menjalankan
1. Pastikan Java JDK sudah terinstall.
2. Buka folder proyek di VS Code.
3. Jalankan file `Main.java`.
4. Pilih menu 1-5 untuk mengelola data.

