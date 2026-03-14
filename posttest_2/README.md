# Posttest 2 - Pemrograman Berorientasi Objek

**Nama:** Rangga Lawe  
**NIM:** 2409106043  
**Program Studi:** Informatika  
**Instansi:** Universitas Mulawarman  

---

## Deskripsi Program
Program ini merupakan pengembangan dari sistem pendataan member gym sebelumnya. Fokus utama pada Posttest 2 ini adalah penerapan **Encapsulation** untuk memastikan data member terlindungi dan hanya bisa diakses melalui metode yang telah ditentukan.

## Fitur Utama
* **Pendaftaran Member:** Menambahkan nama dan jenis paket (Harian/Bulanan).
* **Manajemen Data (CRUD):** * Menampilkan daftar member yang tersimpan dalam `ArrayList`.
    * Memperbarui data member yang sudah ada.
    * Menghapus member dari sistem.
* **Exit System:** Menutup aplikasi secara aman.

## Konsep PBO yang Diterapkan
Sesuai dengan instruksi tugas, program ini mengimplementasikan konsep **Encapsulation** dengan detail sebagai berikut:

1.  **Access Modifiers:**
    * `private`: Digunakan pada atribut `nama` dan `paket` di class `Member` agar tidak dapat dimodifikasi secara langsung dari class `Main`.
    * `public`: Digunakan pada method *Constructor*, *Getter*, dan *Setter*.
2.  **Method Getter dan Setter:**
    * `getNama()` & `getPaket()`: Digunakan untuk mengambil nilai dari atribut privat.
    * `setNama()` & `setPaket()`: Digunakan untuk mengubah nilai atribut privat secara terkontrol.

---

## Cara Menjalankan Program
1. Clone repositori ini atau download file kodingannya.
2. Pastikan file `Main.java` dan `Member.java` berada dalam folder `Posttest2`.
3. Buka terminal di VS Code, lalu compile program:
   ```bash
   javac Posttest2/Main.java