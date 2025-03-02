public class Aksesoris extends Petshop {

    private String jenis;
    private String bahan;
    private String warna;

    Aksesoris(){
        this.jenis = "";
        this.bahan = "";
        this.warna = "";
    }

    Aksesoris(String jenis, String bahan, String warna){
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    // super(id, nama, harga, stok, jenis, bahan, warna);
    Aksesoris(String id ,String nama,String harga, int stok, String jenis, String bahan, String warna){
        super(id, nama, harga,stok);
        this.jenis = jenis;
        this.bahan = bahan;
        this.warna = warna;
    }

    public void set_jenis(String jenis){
        this.jenis = jenis;
    }

    public void set_bahan(String bahan){
        this.bahan = bahan;
    }

    public void set_warna(String warna){
        this.warna = warna;
    }
    
    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    public String getBahan() {
        return bahan;
    }
    
}
