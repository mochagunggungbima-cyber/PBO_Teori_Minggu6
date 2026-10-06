public class MembraneKeyboard extends Keyboard {
    private boolean tahanAir;

    // Constructor normal (menerima semua parameter)
    public MembraneKeyboard(String merk, String tipeKonek, int jumlahTombol, boolean tahanAir) {
        super(merk, tipeKonek, jumlahTombol);
        this.tahanAir = tahanAir;
    }

    // Method khusus menampilkan informasi
    public void infoMembrane() {
        System.out.println("=== Detail Membrane Keyboard ===");
        System.out.println("Merk           : " + getMerk());
        System.out.println("Tipe Koneksi   : " + getTipeKonek());
        System.out.println("Jumlah Tombol  : " + getJumlahTombol());
        System.out.println("Tahan Air      : " + (tahanAir ? "Ya" : "Tidak"));
    }

    // Getter & Setter
    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }
}