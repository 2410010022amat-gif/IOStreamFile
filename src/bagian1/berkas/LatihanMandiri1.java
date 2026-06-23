package bagian1.berkas;

import java.io.File;

public class LatihanMandiri1 {

    public static void main(String[] args) {

        File berkas = new File("laporan.txt");

        if (berkas.exists()) {
            System.out.println("Berkas ada.");
            System.out.println("Ukuran: " + berkas.length() + " byte");
        } else {
            System.out.println("Berkas laporan.txt tidak ditemukan.");
        }
    }
}