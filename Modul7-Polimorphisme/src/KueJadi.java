public class KueJadi extends Kue{
    double jumlah;

    public KueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungHarga(){
        this.harga = jumlah * this.harga;
        return this.harga;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.println("Jumlah : " + this.jumlah);
    }
}
