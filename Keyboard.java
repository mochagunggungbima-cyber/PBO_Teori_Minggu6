public class Keyboard {
    private String merk;
    private String tipeKonek;
    private int jumlahTombol;

    // Constructor Superclass
    public Keyboard(String merk, String tipeKonek, int jumlahTombol) {
        this.merk = merk;
        this.tipeKonek = tipeKonek;
        this.jumlahTombol = jumlahTombol;
    }

    // Method ketik
    public void ketik() {
        System.out.println("Keyboard " + merk + " sedang digunakan untuk mengetik.");
    }

    // Getter & Setter
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getTipeKonek() {
        return tipeKonek;
    }

    public void setTipeKonek(String tipeKonek) {
        this.tipeKonek = tipeKonek;
    }

    public int getJumlahTombol() {
        return jumlahTombol;
    }

    public void setJumlahTombol(int jumlahTombol) {
        this.jumlahTombol = jumlahTombol;
    }
}