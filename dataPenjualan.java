/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

import java.util.Scanner;

/**
 *
 * @author farsy
 */
public class dataPenjualan {
     public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ulang;

        do {
            System.out.println("DATA PENJUALAN BARANG");
            System.out.println("PT PAMULANG TAMA");
            System.out.print("Nama Kasir: ");
            String kasir = input.nextLine();

            System.out.print("Jumlah data: ");
            int n = input.nextInt();

            barang[] barang = new barang[n];

            // input data
            for (int i = 0; i < n; i++) {
                barang[i] = new barang();

                System.out.println("\nData ke-" + (i + 1));
                System.out.print("Kode Barang: ");
                String kode = input.next();
                barang[i].setKode(kode);

                System.out.print("Jumlah Beli: ");
                int jumlah = input.nextInt();
                barang[i].setJumlah(jumlah);
            }

            // tampil data
            double jumlahBayar = 0;

            System.out.println("\nNo  Kode   Nama     Harga   Jumlah   Bayar");

            for (int i = 0; i < n; i++) {
                double total = barang[i].getTotal();
                jumlahBayar += total;

                System.out.println((i + 1) + "   "
                        + barang[i].getKode() + "   "
                        + barang[i].getNama() + "   "
                        + barang[i].getHarga() + "   "
                        + barang[i].getJumlah() + "   "
                        + total);
            }

            // hitung diskon
            double diskon = 0;
            if (jumlahBayar >= 500000) {
                diskon = 0.05 * jumlahBayar;
            }

            // ppn
            double ppn = 0.10 * jumlahBayar;

            // pembayaran
            System.out.print("\nCara Bayar (Cash/Visa/Master): ");
            String bayar = input.next();

            double biayaKartu = 0;
            if (bayar.equalsIgnoreCase("Visa") || bayar.equalsIgnoreCase("Master")) {
                biayaKartu = 0.03 * jumlahBayar;
            }

            // total akhir
            double totalAkhir = jumlahBayar - diskon + ppn + biayaKartu;

            // output akhir
            System.out.println("\nJumlah Bayar : " + jumlahBayar);
            System.out.println("Diskon       : " + diskon);
            System.out.println("PPN          : " + ppn);
            System.out.println("Biaya Kartu  : " + biayaKartu);
            System.out.println("Total Bayar  : " + totalAkhir);

            System.out.print("\nAda data lagi? (y/t): ");
            ulang = input.next().charAt(0);
            input.nextLine(); // buang enter

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Program selesai.");
    }
}