public class Main {
    public static void main(String[] args) {
        // Membuat objek MechanicalKeyboard
        MechanicalKeyboard mechKey = new MechanicalKeyboard("Keychron K2", "Wireless/Bluetooth", 84, "Gateron Red Switch");
        
        // Membuat objek MembraneKeyboard
        MembraneKeyboard memKey = new MembraneKeyboard("Logitech K120", "Kabel USB", 104, true);

        // Menampilkan informasi Mechanical Keyboard
        mechKey.infoMechanical();
        mechKey.ketik(); // Memanggil method dari superclass

        System.out.println(); // Baris baru

        // Menampilkan informasi Membrane Keyboard
        memKey.infoMembrane();
        memKey.ketik(); // Memanggil method dari superclass
    }
}