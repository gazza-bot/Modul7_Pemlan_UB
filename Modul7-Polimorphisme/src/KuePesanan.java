public class KuePesanan extends Kue{
    double berat;
    
    public KuePesanan(String nama,double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }  
    
    @Override
    public double hitungHarga(){
        this.harga = berat * this.harga;
        return this.harga;    
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.printf("Berat : %.2f\n", this.berat);
    }
}
