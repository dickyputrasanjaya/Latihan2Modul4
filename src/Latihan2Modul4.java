import java.util.Scanner;

public class Latihan2Modul4 {
    private static String teks = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // membersihkan newline setelah membaca pilihan

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    teks = scanner.nextLine();
                    System.out.println("Teks telah dimasukkan!");
                    break;
                case 2:
                    int jumlahKarakter = teks.length();
                    System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter);
                    break;
                case 3:
                    String[] kataKata = teks.split("\\s+");
                    int jumlahKata = kataKata.length;
                    System.out.println("Jumlah kata dalam teks: " + jumlahKata);
                    break;
                case 4:
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String kataCari = scanner.nextLine();
                    int frekuensiKata = hitungFrekuensi(teks, kataCari);
                    System.out.println("Kata '" + kataCari + "' ditemukan sebanyak " + frekuensiKata + " kali dalam teks.");
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static int hitungFrekuensi(String teks, String kata) {
        // Menghitung frekuensi kemunculan kata dalam teks
        int frekuensi = 0;
        String[] kataKata = teks.split("\\s+");
        for (String kataTeks : kataKata) {
            if (kataTeks.equalsIgnoreCase(kata)) {
                frekuensi++;
            }
        }
        return frekuensi;
    }
}
