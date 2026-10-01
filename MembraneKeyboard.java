public class MembraneKeyboard extends Keyboard {
    // Atribut tambahan untuk MembraneKeyboard (-)
    private boolean tahanAir;

    // Constructor
    public MembraneKeyboard(String merk, String tipeKonek, int jumlahTombol, boolean tahanAir) {
        // Memanggil constructor superclass (Keyboard)
        super(merk, tipeKonek, jumlahTombol);
        this.tahanAir = tahanAir;
    }

    // Method khusus MembraneKeyboard (+)
    public void infoMembrane() {
        System.out.println("--- Detail Membrane Keyboard ---");
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