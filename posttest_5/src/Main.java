import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> listMember = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n--- MULAWARMAN FITNESS (POSTTEST 5) ---");
            System.out.println("1. Tambah Member");
            System.out.println("2. Lihat Member & Layanan");
            System.out.println("3. Update Member");
            System.out.println("4. Hapus Member");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            menu = input.nextInt();
            input.nextLine(); 

            switch (menu) {
                case 1:
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

                case 2:
                    System.out.println("\n--- Daftar Member ---");
                    for (int i = 0; i < listMember.size(); i++) {
                        Member m = listMember.get(i);
                        System.out.print((i + 1) + ". ");
                        m.tampilkan();
                        
                        if (m instanceof LayananTambahan) {
                            LayananTambahan layanan = (LayananTambahan) m;
                            layanan.hitungDiskon(50000); 
                            layanan.berikanPoin(50000);
                        }
                        System.out.println("-----------------------");
                    }
                    break;

                case 3: 
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

                case 4: 
                    System.out.print("Hapus nomor berapa? ");
                    int idxH = input.nextInt() - 1;
                    if (idxH >= 0 && idxH < listMember.size()) {
                        listMember.remove(idxH);
                        System.out.println("Terhapus.");
                    }
                    break;
            }
        } while (menu != 5);
        input.close();
    }
}