import java.util.ArrayList;

public class Transaksi {
    private String namaPelanggan; 
    private ArrayList<Produk> daftarProduk;
    private ArrayList<Integer> jumlahPesan;

    public Transaksi(String namaPelanggan){
        this.namaPelanggan = namaPelanggan;
        this.daftarProduk = new ArrayList<>();
        this.jumlahPesan = new ArrayList<>();
    }

    public void tambahProduk(Produk p, int jumlah){
        p.kurangStok(jumlah);
        daftarProduk.add(p);
        jumlahPesan.add(jumlah);
    }

    public double hitungTotalHarga(){
        double total = 0;
        for(int i = 0; i < daftarProduk.size(); i++){
            Produk p = daftarProduk.get(i);
            int qty = jumlahPesan.get(i);

            if(p instanceof Makanan){
                total += ((Makanan) p).getHargaSetelahDiskon() * qty;
            }else{
                total += p.getHarga() * qty;
            }
        }
        return total;
    }

    public void cetakStruk() {
        System.out.println("========================================");
        System.out.println("        KANTIN KAMPUS SEJAHTERA         ");
        System.out.println("========================================");
        System.out.println("Pelanggan : " + namaPelanggan);
        System.out.println("----------------------------------------");
        System.out.printf("%-3s %-22s %-4s %s%n", "No", "Produk", "Qty", "Harga");
        System.out.println("----------------------------------------");

        for (int i = 0; i < daftarProduk.size(); i++) {
            Produk p = daftarProduk.get(i);
            int qty = jumlahPesan.get(i);
            double hargaSatuan;
            boolean adaDiskon = false;

            if (p instanceof Makanan) {
                hargaSatuan = ((Makanan) p).getHargaSetelahDiskon();
                adaDiskon = ((Makanan) p).hitungDiskon() > 0;
            } else {
                hargaSatuan = p.getHarga();
            }

            double subtotal = hargaSatuan * qty;
            String tanda = adaDiskon ? " *" : "";

            System.out.printf("%-3d %-22s %-4d Rp %,.0f%s%n",
                (i + 1), p.getNama(), qty, subtotal, tanda);
        }

        System.out.println("----------------------------------------");
        System.out.println("* harga setelah diskon");
        System.out.printf("TOTAL : Rp %,.0f%n", hitungTotalHarga());
        System.out.println("========================================");
        System.out.println("Terima kasih! :)");
        System.out.println("========================================\n");
    }
}
