public abstract class Produk {
    // Atribute
    protected String nama;
    protected double harga;
    protected int stok;

    //Constructor
    Produk(String nama, double harga2, int stok){
        // untuk membedakan mana yang atribut class dengan parameter
        this.nama = nama;
        this.harga = harga2;
        this.stok = stok;
    }

    // Getter
    public String getNama(){
        return nama;
    }

    public double getHarga(){
        return harga;
    }

    public int getStok(){
        return stok;
    }

    // Method
    void kurangStok(int jumlah){

        // Mengurangi stok; tampilkan pesan error jika stok tidak cukup
        if(jumlah > stok ){
            System.out.println("Error: Stok " + nama + " tidak cukup!");
        }else{
            stok -= jumlah;
        }

    }

    // Mengembalikan kategori produk
    abstract String getKategori();

    // Mencetak informasi produk ke console.
    public void tampilkanInfo(){

        System.out.println("[" + getKategori() + "]"+ nama + " Harga: Rp" + (int)harga + " Stok: " + stok);

    }

}
