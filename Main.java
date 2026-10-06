public class Main {
    public static void main(String[] args) {
        // 1. Instansiasi objek dengan mengirimkan nilai null / kosong
        MechanicalKeyboard mechKey = new MechanicalKeyboard(null, 0, null);
        MembraneKeyboard memKey = new MembraneKeyboard(null, null, 0, false);

        // 2. Mengisi nilai atribut private menggunakan method Setter
        // --- Mechanical Keyboard ---
        mechKey.setMerk("Keychron K2");
        mechKey.setJumlahTombol(84);
        mechKey.setTipeSwitch("Gateron Red");

        // --- Membrane Keyboard ---
        memKey.setMerk("Logitech K120");
        memKey.setTipeKonek("Kabel USB");
        memKey.setJumlahTombol(104);
        memKey.setTahanAir(true);

        // 3. Menampilkan hasil
        mechKey.infoMechanical();
        mechKey.ketik();

        System.out.println(); // Pembatas output

        memKey.infoMembrane();
        memKey.ketik();
    }
}