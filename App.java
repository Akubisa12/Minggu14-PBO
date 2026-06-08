public class App {
    public static void main(String[] args){

        Makanan nasiGoreng = new Makanan("Nasi Goreng Spesial", 12000, 10, "Nasi");
        Makanan ayamGoreng = new Makanan("Ayam Goreng Crispy", 18000, 5, "Lauk");
        Minuman esTeh = new Minuman("Es Teh Manis", 5000, 20, 350);
        Minuman jusAlpukat = new Minuman("Jus Alpukat", 12000,8, 250);
        System.out.println("===MENU KANTIN===");

        nasiGoreng.tampilkanInfo();
        ayamGoreng.tampilkanInfo();
        esTeh.tampilkanInfo();
        jusAlpukat.tampilkanInfo();
        Transaksi t1 = new Transaksi("Budi Santoso");
        t1.tambahProduk(ayamGoreng, 2);
        t1.tambahProduk(esTeh, 2);
        t1.cetakStruk();
        Transaksi t2 = new Transaksi("Sari Dewi");
	    t2.tambahProduk(nasiGoreng,1);
	    t2.tambahProduk(jusAlpukat,2);
	    t2.cetakStruk();
        
    }
}
