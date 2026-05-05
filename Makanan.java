public class Makanan extends Produk{
    private int expired;
    public Makanan(String nama, String kategori, double harga, int stok) {
        super(nama, kategori, harga, stok);
        this.expired = expired;
    }
        
        public void tampilkanData(){
            super.tampilInfo();
            System.out.println("expired : "+expired+" hari");
        }

        public void setExpired(int expired){
            if(expired > 0){
                System.out.println("masa expired tidak boleh negatif");
            }else{
                this.expired = expired;
            }   
        }


    

}
