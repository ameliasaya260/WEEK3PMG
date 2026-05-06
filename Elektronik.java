public class Elektronik extends Produk{
    private int garansi;
    public Elektronik(String nama, String kategori, double harga, int stok) {
        super(nama, kategori, harga, stok);
        this.garansi = garansi;
    }
        @Override
        public void tampilInfo(){
            System.out.println("Elektronik");
            super.tampilInfo();
            System.out.println("expired : "+ garansi +" hari");
        }

        public void setGaransi(int garansi){
            if(garansi <= 0){
                System.out.println("masa expired tidak boleh negatif");
            }else{
                this.garansi = garansi;
            }   
        }
        

    

}