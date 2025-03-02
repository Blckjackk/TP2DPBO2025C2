public class Petshop {
    
    private String id;
    private String nama_produk;
    private String harga_produk;
    private int stok_produk;

    Petshop(){
        this.id = "";
        this.nama_produk = "";
        this.harga_produk = "";
        this.stok_produk = 0;
    }

    Petshop(String id, String nama_produk, String harga_produk, int stok_produk){
        this.id = id;
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
        this.stok_produk = stok_produk;
    }

    public void setstok_produk(int stok_produk) {
        this.stok_produk = stok_produk;
    }

    public void setid(String id) {
        this.id = id;
    }
    
    public void setharga_produk(String harga_produk) {
        this.harga_produk = harga_produk;
    }

    public void setnama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }

    public String getid() {
        return id;
    }

    public String getharga_produk() {
        return harga_produk;
    }

    public String getnama_produk() {
        return nama_produk;
    }

    public int getstok_produk() {
        return stok_produk;
    }

    public void Ingfo(){
        System.out.println("id          : "+ id );
        System.out.println("Nama        : "+ nama_produk);
        System.out.println("Kategori    : "+ harga_produk);
        System.out.println("Harga       : "+ stok_produk);
        System.out.println("//=================//");
    }


}
