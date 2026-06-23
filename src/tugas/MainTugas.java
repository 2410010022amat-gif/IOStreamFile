package tugas;

// Nama : [Ahmad Tamrani Noprian]
// NPM  : [2410010022]

public class MainTugas {

    public static void main(String[] args) {

        String[] kategori = {
            "Makanan",
            "Minuman",
            "Elektronik"
        };

        System.out.println("=== KATEGORI BARANG ===");

        for (String k : kategori) {
            System.out.println("- " + k);
        }

        System.out.println();

        Gudang gudang = new Gudang("barang.txt");

        gudang.tambahBarang(new Barang("Beras", 15000, 20));
        gudang.tambahBarang(new Barang("Gula", 18000, 15));
        gudang.tambahBarang(new Barang("Teh", 5000, 30));
        gudang.tambahBarang(new Barang("Laptop", 7000000, 5));
        gudang.tambahBarang(new Barang("Mouse", 100000, 25));

        System.out.println("=== DATA BARANG AWAL ===");
        gudang.tampilkanSemua();

        System.out.println();
        gudang.simpanKeBerkas();

        System.out.println();

        Gudang gudangBaru = new Gudang("barang.txt");

        gudangBaru.muatDariBerkas();

        System.out.println();
        System.out.println("=== DATA HASIL MUAT DARI FILE ===");

        gudangBaru.tampilkanSemua();

        System.out.println();
        System.out.println("Total Nilai Persediaan = Rp "
                + gudangBaru.totalNilai());
    }
}