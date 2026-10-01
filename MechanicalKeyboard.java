public class MechanicalKeyboard extends Keyboard {
    // Atribut tambahan untuk MechanicalKeyboard (-)
    private String tipeSwitch;

    // Constructor
    public MechanicalKeyboard(String merk, String tipeKonek, int jumlahTombol, String tipeSwitch) {
        // Memanggil constructor superclass (Keyboard)
        super(merk, tipeKonek, jumlahTombol);
        this.tipeSwitch = tipeSwitch;
    }

    // Method khusus MechanicalKeyboard (+)
    public void infoMechanical() {
        System.out.println("--- Detail Mechanical Keyboard ---");
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