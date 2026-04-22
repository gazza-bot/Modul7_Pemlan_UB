public class KueJadi extends Kue{
    double jumlah;

    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga(){
        this.harga = jumlah * this.harga * 2;
        return this.harga;
    }

    @Override
    public void getInfo(){
        this.harga = this.hitungHarga();
        super.getInfo();
        System.out.println("Jumlah : " + (int) this.jumlah + " Pcs");
    }

    @Override
    public double getQty(){
        return this.jumlah;
    }
}
