package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Latihan3 {

    public static void main(String[] args) {

        try (PrintWriter penulis =
                new PrintWriter(new FileWriter("mahasiswa.txt"))) {

            penulis.println("Andi");
            penulis.println("Budi");
            penulis.println("Citra");

            System.out.println("Data berhasil ditulis");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}