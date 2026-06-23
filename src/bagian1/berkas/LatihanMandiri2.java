package bagian1.berkas;

import java.io.File;

public class LatihanMandiri2 {

    public static void main(String[] args) {

        File folder = new File("arsip");

        if (folder.mkdir()) {
            System.out.println("Folder arsip berhasil dibuat.");
        } else {
            System.out.println("Folder arsip gagal dibuat atau sudah ada.");
        }
    }
}