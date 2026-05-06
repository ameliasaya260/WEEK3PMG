
public class Makanan extends Produk {

    private int expired;

    public Makanan(String nama, String kategori, double harga, int stok) {
        super(nama, kategori, harga, stok);
        this.expired = expired;
    }

    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("expired : " + expired + " hari");
    }

    public void setExpired(int expired) {
        if (expired < 0) {
            System.out.println("masa expired tidak boleh negatif");
        } else {
            this.expired = expired;
        }
    }

    public void setExpired(int expired, String type) {
        if (type.equals("Nasi")) {
            if (expired > 4) {
                System.out.println("Masa Expired Tidak Boleh Negatif");
            } else {
                this.expired = expired;
            }
        } else {
            if (expired < 2) {
                System.out.println("Masa Expired Tidak Boleh Negatif");
            } else {
                this.expired = expired;
            }
        }
    }

}