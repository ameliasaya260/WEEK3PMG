public class Main{
    public static void main(String[] args) {
        Produk p = new Produk("baju", "pakaian",100000, 5);

        System.out.println(p.getNama());
        System.out.println(p.getHarga());

        p.setHarga(20000);
        System.out.println(p.getHarga());

    }
}
