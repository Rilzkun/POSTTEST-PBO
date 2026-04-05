public class MemberVIP extends Member {
    private String loker;

    public MemberVIP(String nama, String id, String loker) {
        super(nama, id);
        this.loker = loker;
    }

    @Override
    public void tampilkan() {
        super.tampilkan();
        System.out.println(" | Tipe: VIP | Loker: " + loker);
    }
}