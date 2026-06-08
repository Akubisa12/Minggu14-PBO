public class Makanan extends Produk implements Diskonable {
    private String jenisMenu;

    public Makanan(String nama, double harga, int stok, String jenisMenu){
        super(nama, harga, stok);
        this.jenisMenu = jenisMenu;
    }

    @Override
    public String getKategori(){
        return "Makanan";
    }

    @Override
    public double hitungDiskon(){
        if(harga > 15000){
            return harga * 0.10;
        }
        return 0;
    }

    @Override 
    public double getHargaSetelahDiskon(){
        return harga - hitungDiskon();
    }

    @Override 
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println(" Jenis: " + jenisMenu);
        if(hitungDiskon() > 0){
            System.out.println(" Diskon: Rp " + (int)hitungDiskon() + " * Harga setelah diskon: Rp " + (int)getHargaSetelahDiskon());
        }
    }
}
