public class MechanicalKeyboard extends Keyboard {
    private String tipeSwitch;

    // Parameter 'tipeKonek' dihapus dari constructor anak
    public MechanicalKeyboard(String merk, int jumlahTombol, String tipeSwitch) {
        // 'tipeKonek' langsung di-set default "Wireless" di super()
        super(merk, "Wireless", jumlahTombol);
        this.tipeSwitch = tipeSwitch;
    }

    // Method khusus menampilkan informasi
    public void infoMechanical() {
        System.out.println("=== Detail Mechanical Keyboard ===");
        System.out.println("Merk           : " + getMerk());
        System.out.println("Tipe Koneksi   : " + getTipeKonek());
        System.out.println("Jumlah Tombol  : " + getJumlahTombol());
        System.out.println("Tipe Switch    : " + tipeSwitch);
    }

    // Getter & Setter
    public String getTipeSwitch() {
        return tipeSwitch;
    }

    public void setTipeSwitch(String tipeSwitch) {
        this.tipeSwitch = tipeSwitch;
    }
}