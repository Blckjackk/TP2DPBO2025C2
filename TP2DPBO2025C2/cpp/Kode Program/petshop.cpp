#include <iostream> 
#include <string>

using namespace std;

class petshop
{
    private:
        string ID;
        string nama_produk;
        string harga_produk;
        int stok_produk;

    public:
        petshop(){
            this->ID = "";
            this->nama_produk = "";
            this->harga_produk = "";
            this->stok_produk = 0;
        }

        petshop(string ID, string nama_produk, string harga_produk, int stok_produk){
            this->ID = ID;
            this->nama_produk = nama_produk;
            this->harga_produk = harga_produk;
            this->stok_produk = stok_produk;
        }

        

        // Getter
        string get_id(){
            return this->ID;
        }

        string get_nama_produk(){
            return this->nama_produk;
        }

        string get_harga_produk(){
            return this->harga_produk;
        }

        int get_stok_produk(){
            return this->stok_produk;
        }

        // Setter
        void set_id(string ID){
            this->ID = ID;
        }

        void set_nama_produk(string nama_produk){
            this->nama_produk = nama_produk;
        }

        void set_harga_produk(string harga){
            this->harga_produk = harga;
        }

        void set_stok_produk(int stok){
            this->stok_produk = stok;
        }

        ~petshop(){

        }
};

