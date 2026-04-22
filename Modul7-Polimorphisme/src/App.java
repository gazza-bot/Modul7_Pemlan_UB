public class App {
    public static void main(String[] args) throws Exception {
        
        Kue[] daftarKue = new Kue[20];

        daftarKue[0] = new KuePesanan("Croissant", 100000, 3);
        daftarKue[1] = new KuePesanan("Lapis", 10000, 5);
        daftarKue[2] = new KuePesanan("Kuping Gajah", 100000, 5);
        daftarKue[3] = new KuePesanan("Kuping Gajah", 100000, 5);
        daftarKue[4] = new KuePesanan("Sale Pisang", 70000, 5);
        daftarKue[5] = new KuePesanan("Manco", 800000, 5);
        daftarKue[6] = new KuePesanan("Alen Alen", 900000, 5);
        daftarKue[7] = new KuePesanan("Lumpur", 300000, 5);
        daftarKue[8] = new KuePesanan("Castangel", 300000, 5);
        daftarKue[9] = new KuePesanan("Wafer", 100000, 5);

        daftarKue[10] = new KueJadi("Tart", 200000, 3);
        daftarKue[11] = new KueJadi("Pretzel", 50000, 10);
        daftarKue[12] = new KueJadi("Kukus", 5000, 10);
        daftarKue[13] = new KueJadi("Cakue", 1000, 10);
        daftarKue[14] = new KueJadi("Kue Pisang", 5000, 10);
        daftarKue[15] = new KueJadi("Macaron", 20000, 10);
        daftarKue[16] = new KueJadi("Sus", 30000, 10);
        daftarKue[17] = new KueJadi("Macaron", 50000, 10);
        daftarKue[18] = new KueJadi("Pretzel", 50000, 20);
        daftarKue[19] = new KueJadi("Croissant", 50000, 10);

        double totalHargaSemua = 0;
        double totalHargaPesanan = 0;
        double totalBeratPesanan = 0;
        double totalHargaJadi = 0;
        double totalJumlahJadi = 0;

        double hargaTerbesar = 0;
        Kue kueTermahal = null;

        System.out.println("=== DAFTAR SEMUA KUE ===");

        for (int i = 0; i < daftarKue.length; i++) {
            
            Kue kueSaatIni = daftarKue[i];
            
            double hargaAkhir = kueSaatIni.hitungHarga(); 
            
            totalHargaSemua += hargaAkhir;
            if (kueSaatIni instanceof KuePesanan) {
                System.out.println("Jenis : Kue Pesanan");
                
                totalHargaPesanan += hargaAkhir;
                totalBeratPesanan += kueSaatIni.getQty();
                
            } else if (kueSaatIni instanceof KueJadi) {
                System.out.println("Jenis : Kue Jadi");
                
                totalHargaJadi += hargaAkhir;
                totalJumlahJadi += kueSaatIni.getQty();
            }

            kueSaatIni.getInfo(); 
            System.out.println("Harga Akhir: " + hargaAkhir);
            System.out.println("------------------------");

            if (hargaAkhir > hargaTerbesar) {
                hargaTerbesar = hargaAkhir;
                kueTermahal = kueSaatIni;
            }
        }

        System.out.println("\n=== REKAPITULASI AKHIR ===");
        System.out.printf("Total Harga Semua Kue      : %,.2f\n", totalHargaSemua);
        System.out.printf("Total Harga Kue Pesanan    : %,.2f\n", totalHargaPesanan);
        System.out.printf("Total Berat Kue Pesanan    : %.2f Kg\n", totalBeratPesanan);
        System.out.printf("Total Harga Kue Jadi       : %,.2f\n", totalHargaJadi);
        System.out.printf("Total Jumlah Kue Jadi      : %d Pcs\n", (int) totalJumlahJadi);

        System.out.println("\n=== KUE DENGAN HARGA TERBESAR ===");
        if (kueTermahal != null) {
            kueTermahal.getInfo();
            System.out.println("Harga Akhir: " + hargaTerbesar);
        }
    }
}