
public class App {
    public static void main(String[] args) throws Exception {
        Kue[][] lsKue = {
                {
                        new KuePesanan("Croissant", 100000, 3),
                        new KuePesanan("Lapis", 10000, 5),
                        new KuePesanan("Kuping Gajah", 100000, 5),
                        new KuePesanan("Kuping Gajah", 100000, 5),
                        new KuePesanan("Sale Pisang", 70000, 5),
                        new KuePesanan("Manco", 800000, 5),
                        new KuePesanan("Alen Alen", 900000, 5),
                        new KuePesanan("Lumpur", 300000, 5),
                        new KuePesanan("Castangel", 300000, 5),
                        new KuePesanan("Wafer", 100000, 5)
                },
                {
                        new KueJadi("Tart", 200000, 3),
                        new KueJadi("Pretzel", 50000, 10),
                        new KueJadi("Kukus", 5000, 10),
                        new KueJadi("Cakue", 1000, 10),
                        new KueJadi("Kue Pisang", 5000, 10),
                        new KueJadi("Macaron", 20000, 10),
                        new KueJadi("Sus", 30000, 10),
                        new KueJadi("Macaron", 50000, 10),
                        new KueJadi("Pretzel", 50000, 20),
                        new KueJadi("Croissant", 50000, 10)
                }
        };

        double berat = 0;
        double totalPesanan = 0;
        int idx[][] = { { 0, -1 }, { 1, -1 } };
        double max1 = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0)
                System.out.println("Kue Pesanan");
            lsKue[0][i].getInfo();
            totalPesanan += lsKue[0][i].harga;
            berat += lsKue[0][i].getQty();
            if (lsKue[0][i].harga > max1) {
                max1 = lsKue[0][i].harga;
                idx[0][1] = i;
            }
        }

        double jumlah = 0;
        double totalJadi = 0;
        double max = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0)
                System.out.println("Kue Jadi");
            lsKue[1][i].getInfo();
            totalJadi += lsKue[1][i].harga;
            jumlah += lsKue[1][i].getQty();
            if (lsKue[0][i].harga > max) {
                max = lsKue[1][i].harga;
                idx[1][1] = i;
            }
        }
        
        double totalSemua = totalPesanan + totalJadi;

        System.out.printf("Jumlah Harga Semua Kue : %,.2f\n", totalSemua);
        System.out.printf("Jumlah harga total Kue Pesanan : %,.2f\n", totalPesanan);
        System.out.printf("Berat total Kue Pesanan : %.2f Kg\n", berat);
        System.out.printf("Jumlah harga total Kue Jadi : %,.2f\n", totalJadi);
        System.out.printf("Jumlah total Kue Jadi : %d Pcs\n",(int) jumlah);
        int idxMax[] = {0,0};
        if(lsKue[0][idx[0][1]].harga > lsKue[1][idx[1][1]].harga){
            idxMax = idx[0];
        }else {
            idxMax = idx[1];
        }

        System.out.println("Kue Termahal");
        lsKue[idxMax[0]][idxMax[1]].getInfo();
    }
}