public class Minuman extends Produk{
    int ukuranM1;

    public Minuman(String nama, double harga, int stok, int ukuranM1){
        super(nama, harga, stok);
        this.ukuranM1 = ukuranM1;
    }

    @Override
    public String getKategori(){
        return "Minuman";
    }
    
    @Override 
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Ukuran: " + ukuranM1 + " m1");
    }

}
