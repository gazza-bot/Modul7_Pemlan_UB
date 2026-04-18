

public class App {
    public static void main(String[] args) throws Exception {
        Kue[] lsKue = {
            new KuePesanan("Croissant", 100000, 3),
            new KueJadi("Tart",200000,3),
            new KuePesanan("Lapis", 10000,5),
            new KueJadi("Pretzel", 50000,10),
            new KueJadi("Kukus", 5000,10),
            new KueJadi("Cakue", 1000,10),
            new KueJadi("Kue Pisang", 5000,10),
            new KueJadi("Macaron", 20000,10),
            new KueJadi("Sus", 30000,10),
            new KueJadi("Macaron", 50000,10),
            new KuePesanan("Kuping Gajah",100000,5),
            new KueJadi("Pretzel", 50000,20),
            new KuePesanan("Kuping Gajah",100000,5),
            new KueJadi("Croissant", 50000,10),
            new KuePesanan("Wafer",100000,5),
            new KuePesanan("Sale Pisang",70000,5),
            new KuePesanan("Manco",800000,5),
            new KuePesanan("Alen Alen",900000,5),
            new KuePesanan("Lumpur",300000,5),
            new KuePesanan("Castangel",300000,5),
        };

        for(int i = 0; i < lsKue.length;i++){
            System.out.print("\n" + (i + 1) + ". ");
            lsKue[i].getInfo();
        }
    }
}