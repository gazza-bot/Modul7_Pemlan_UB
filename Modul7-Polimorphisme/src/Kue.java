public abstract class Kue {
    public String nama;
    public double harga;
    
    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    public void getInfo() {
        System.out.printf("Nama : %s\n", this.nama);
        System.out.printf("Nama : %.2f\n", this.harga);
    }
}
