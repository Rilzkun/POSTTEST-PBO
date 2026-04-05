public class MemberReguler extends Member {
    private int biaya;

    public MemberReguler(String nama, String id, int biaya) {
        super(nama, id);
        this.biaya = biaya;
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println(" | Tipe: Reguler | Biaya: " + biaya);
    }
}