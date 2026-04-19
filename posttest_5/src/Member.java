public abstract class Member {
    protected String nama;
    protected String id;

    public Member(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public abstract String getTipe();

    public void tampilkan() {
        System.out.print("ID: " + id + " | Nama: " + nama + " | Tipe: " + getTipe());
    }

    public void tampilkan(String salam) {
        System.out.println("\n" + salam + ", " + nama + "!");
    }
}