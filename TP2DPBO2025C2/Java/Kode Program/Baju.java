public class Baju extends Aksesoris{
    
    private String untuk;
    private String size;
    private String merk;

    Baju(){

    }

    Baju(String untuk, String size, String merk){
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    Baju(String id, String nama, String harga, int stok, String jenis, String bahan, String warna, String untuk, String size, String merk) {
        super(id, nama, harga, stok, jenis, bahan, warna); // Memanggil konstruktor superclass (Aksesoris)
        this.untuk = untuk;
        this.size = size;
        this.merk = merk;
    }

    public void set_untuk(String untuk){
        this.untuk = untuk;
    }

    public void set_size(String size){
        this.size = size;
    }

    public void set_merk(String merk){
        this.merk = merk;
    }


    public String getUntuk() {
        return untuk;
    }

    public String getMerk() {
        return merk;
    }

    public String getSize() {
        return size;
    }

}
