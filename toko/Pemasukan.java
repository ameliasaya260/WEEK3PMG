package toko;

import base.Produk;

public class Pemasukan extends Produk {

    private double totalPemasukan;

    public Pemasukan(String nama, String kategori, double harga, int stok) {
        super(nama, kategori, harga, stok);
        this.totalPemasukan = 0;
    }

    void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += jumlah * harga;
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }
}
