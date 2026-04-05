public class Member {
    protected String nama;
    protected String id;

    public Member(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public void tampilkan() {
        System.out.print("ID: " + id + " | Nama: " + nama);
    }
}