package bagian2.bacatulis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LatihanMandiri5 {

    public static void main(String[] args) {

        try (PrintWriter penulis =
                new PrintWriter(new FileWriter("hari.txt", true))) {

            penulis.println("Sabtu");
            penulis.println("Minggu");

            System.out.println("Dua hari berhasil ditambahkan.");

        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }

        try (BufferedReader pembaca =
                new BufferedReader(new FileReader("hari.txt"))) {

            String baris;

            System.out.println("\nIsi hari.txt:");

            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }

        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
    }
}