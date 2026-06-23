package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiri3 {

    public static void main(String[] args) {

        File berkas = new File("sementara.txt");

        try {

            berkas.createNewFile();

            System.out.println("Sebelum dihapus: " + berkas.exists());

            if (berkas.delete()) {
                System.out.println("Berkas berhasil dihapus.");
            } else {
                System.out.println("Berkas gagal dihapus.");
            }

            System.out.println("Sesudah dihapus: " + berkas.exists());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}