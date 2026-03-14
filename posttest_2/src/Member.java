public class Member {
    private String nama;
    private String paket;

    public Member(String nama, String paket) {
        this.nama = nama;
        this.paket = paket;
    }

    public String getNama() {
        return nama;
    }

    public String getPaket() {
        return paket;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPaket(String paket) {
        this.paket = paket;
    }
}