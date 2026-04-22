public class KuePesanan extends Kue{
    double berat;
    
    public KuePesanan(String nama,double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }  
    
    @Override
    public double hitungHarga(){
        return berat * this.harga;
    }

    @Override
    public void getInfo(){
        super.getInfo();
        System.out.printf("Berat : %.2f Kg\n", this.berat);
    }

    @Override
    public double getQty(){
        return this.berat;
    }
}
