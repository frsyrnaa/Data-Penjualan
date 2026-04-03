/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualan;

/**
 *
 * @author farsy
 */
public class barang {
    private String kode;
    private String nama;
    private double harga;
    private int jumlah;

    // Setter
    public void setKode(String kode) {
        this.kode = kode;

        // otomatis isi nama & harga
        if (kode.equalsIgnoreCase("B001")) {
            nama = "Buku";
            harga = 10000;
        } else if (kode.equalsIgnoreCase("B002")) {
            nama = "Pulpen";
            harga = 5000;
        } else if (kode.equalsIgnoreCase("B003")) {
            nama = "Tas";
            harga = 150000;
        } else {
            nama = "Tidak Diketahui";
            harga = 0;
        }
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    // Getter
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }
    
    public double getTotal() {
    return harga * jumlah;
}
}
