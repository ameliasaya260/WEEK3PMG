class Produk {
    private String nama;
    private double harga;
    private int stok;


    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

     public String getNama() {
        return nama;
    }

     public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void tampilInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
    }

      public double hitungDiskon() {
        return harga;
    }
}

class Elektronik extends Produk {
    private int garansiTahun;

    public Elektronik(String nama, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.garansiTahun = garansiTahun;
    }

     @Override
    public void tampilInfo() {
        System.out.println("[ELEKTRONIK] " + getNama() +
                " | Rp" + getHarga() +
                " | Garansi: " + garansiTahun + " thn" +
                " | Stok: " + getStok());
    }


