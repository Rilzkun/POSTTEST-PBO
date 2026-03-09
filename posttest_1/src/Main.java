import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> listMember = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MULAWARMAN FITNESS SYSTEM ===");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Daftar");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Member");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Masukkan Nama: "); String n = input.nextLine();
                System.out.print("Pilih Paket (Harian/Bulanan): "); String p = input.nextLine();
                listMember.add(new Member(n, p));
                System.out.println(">> Berhasil Terdaftar!");

            } else if (pilihan == 2) {
                System.out.println("\n--- DAFTAR MEMBER ---");
                if (listMember.isEmpty()) {
                    System.out.println("Belum ada member terdaftar.");
                } else {
                    for (int i = 0; i < listMember.size(); i++) {
                        System.out.println((i + 1) + ". " + listMember.get(i).nama + " (" + listMember.get(i).paket + ")");
                    }
                }

            } else if (pilihan == 3) {
                System.out.print("Masukkan nomor urut member: ");
                int index = input.nextInt() - 1; input.nextLine();
                if (index >= 0 && index < listMember.size()) {
                    System.out.print("Update Nama: "); listMember.get(index).nama = input.nextLine();
                    System.out.print("Update Paket: "); listMember.get(index).paket = input.nextLine();
                    System.out.println(">> Data Berhasil Diubah!");
                } else {
                    System.out.println(">> Nomor tidak ditemukan.");
                }

            } else if (pilihan == 4) {
                System.out.print("Masukkan nomor urut yang akan dihapus: ");
                int index = input.nextInt() - 1;
                if (index >= 0 && index < listMember.size()) {
                    listMember.remove(index);
                    System.out.println(">> Member Telah Dihapus!");
                } else {
                    System.out.println(">> Nomor tidak ditemukan.");
                }
            }
        } while (pilihan != 5);

        input.close();
        System.out.println("Terima kasih, Rangga. Sampai jumpa!");
    }
}
