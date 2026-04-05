import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> listMember = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n--- MULWARMAN FITNESS (CRUD) ---");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Member");
            System.out.println("3. Update Member");
            System.out.println("4. Hapus Member");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1: // CREATE
                    System.out.print("Nama: "); String nama = input.nextLine();
                    System.out.print("ID: "); String id = input.nextLine();
                    System.out.print("Tipe (1. Reguler / 2. VIP): ");
                    int tipe = input.nextInt(); input.nextLine();

                    if (tipe == 1) {
                        System.out.print("Biaya Harian: "); int biaya = input.nextInt();
                        listMember.add(new MemberReguler(nama, id, biaya));
                    } else {
                        System.out.print("Nomor Loker: "); String loker = input.nextLine();
                        listMember.add(new MemberVIP(nama, id, loker));
                    }
                    break;

                case 2: // READ
                    System.out.println("\n--- Daftar Member ---");
                    for (int i = 0; i < listMember.size(); i++) {
                        System.out.print((i + 1) + ". ");
                        listMember.get(i).tampilkan();
                    }
                    break;

                case 3: // UPDATE
                    System.out.print("Nomor member yang diubah: ");
                    int idxU = input.nextInt() - 1; input.nextLine();
                    if (idxU >= 0 && idxU < listMember.size()) {
                        System.out.print("Nama Baru: "); String nB = input.nextLine();
                        System.out.print("ID Baru: "); String iB = input.nextLine();
                        System.out.print("Tipe Baru (1. Reguler / 2. VIP): ");
                        int tB = input.nextInt(); input.nextLine();
                        
                        if (tB == 1) {
                            System.out.print("Biaya Baru: "); int bB = input.nextInt();
                            listMember.set(idxU, new MemberReguler(nB, iB, bB));
                        } else {
                            System.out.print("Loker Baru: "); String lB = input.nextLine();
                            listMember.set(idxU, new MemberVIP(nB, iB, lB));
                        }
                        System.out.println("Data diupdate!");
                    }
                    break;

                case 4: // DELETE
                    System.out.print("Hapus nomor berapa? ");
                    int idxH = input.nextInt() - 1;
                    if (idxH >= 0 && idxH < listMember.size()) {
                        listMember.remove(idxH);
                        System.out.println("Terhapus.");
                    }
                    break;
            }
        } while (menu != 5);
    }
}