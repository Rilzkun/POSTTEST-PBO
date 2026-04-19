public class MemberReguler extends Member implements LayananTambahan {
    private int biaya;

    public MemberReguler(String nama, String id, int biaya) {
        super(nama, id);
        this.biaya = biaya;
    }

    @Override
    public String getTipe() {
        return "Reguler";
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println(" | Biaya Harian: " + biaya);
    }

    @Override
    public void hitungDiskon(int totalBelanja) {
        double diskon = totalBelanja * 0.05; 
        System.out.println("Diskon Reguler (5%): Rp" + diskon);
    }

    @Override
    public void berikanPoin(int totalBelanja) {
        int poin = totalBelanja / 10000;
        System.out.println("Poin Baru: " + poin);
    }
}