public class MemberVIP extends Member implements LayananTambahan {
    private String loker;

    public MemberVIP(String nama, String id, String loker) {
        super(nama, id);
        this.loker = loker;
    }

    @Override
    public String getTipe() {
        return "VIP";
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println(" | Nomor Loker: " + loker);
    }

    @Override
    public void hitungDiskon(int totalBelanja) {
        double diskon = totalBelanja * 0.15; 
        System.out.println("Diskon VIP (15%): Rp" + diskon);
    }

    @Override
    public void berikanPoin(int totalBelanja) {
        int poin = (totalBelanja / 10000) * 2; 
        System.out.println("Poin Baru (Bonus VIP 2x): " + poin);
    }
}