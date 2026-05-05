
public class Produk {
    private String nama; //hanya bisa diakses dalam class produk
    String kategori; //default - hanya bisa diakses dalam package toko
    private double harga; // bisa diakses subclass meskipun beda package
    private int stok; // bisa diakses dari mana saja 

    public Produk(String nama, String kategori, double harga, int stok) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama(){
        return nama;
    }
    public double getHarga(){
        return harga;
    }
    public int getStok(){
        return stok;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }
    public void setStok(int stok){
        this.stok = stok;
    }


    public void tampilInfo() {
        //semua atribut bisa diakses di sini - kita masih di dalam class produk
        System.out.println("produk   :"+nama);
        System.out.println("kategori :"+kategori);
        System.out.println("harga    : Rp"+harga);
        System.out.println("stok     :"+stok);
        System.out.println("---------------");
    }


}
