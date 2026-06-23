package bagian3.kontak;

public class MainKontak {

    public static void main(String[] args) {

        BukuKontak buku = new BukuKontak("kontak.txt");

        buku.tambahKontak(
                new Kontak(
                        "Andi",
                        "0811111",
                        "andi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Budi",
                        "0822222",
                        "budi@gmail.com"));

        buku.tambahKontak(
                new Kontak(
                        "Citra",
                        "0833333",
                        "citra@gmail.com"));

        buku.tampilkanSemua();

        // LATIHAN MANDIRI NO 1
        buku.cariKontak("Budi");

        // LATIHAN MANDIRI NO 3
        buku.hapusKontak("Budi");

        System.out.println("\nSetelah penghapusan:");
        buku.tampilkanSemua();

        buku.simpanKeBerkas();

        System.out.println();

        BukuKontak bukuLain = new BukuKontak("kontak.txt");

        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();

        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}