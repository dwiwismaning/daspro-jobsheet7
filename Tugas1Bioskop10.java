import java.util.Scanner;

public class Tugas1Bioskop10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah, bayar, totalTiket = 0, totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlah = sc.nextInt();

            if (jumlah == 0) {
                break;
            }
            if (jumlah < 0) {
                System.out.println("Input tidak valid. Masukkan lagi jumlah tiket!");
                continue;
            }

            bayar = jumlah * 50000;
            if (jumlah > 10) {
                bayar = bayar * 85 / 100; 
            } else if (jumlah > 4) {
                bayar = bayar * 90 / 100;
            }

            System.out.println("Total bayar pelanggan: Rp " + bayar);
            totalTiket += jumlah;
            totalPenjualan += bayar;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);
    }
}