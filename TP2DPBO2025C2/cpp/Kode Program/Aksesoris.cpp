#include "petshop.cpp"

using namespace std;

class Aksesoris :public petshop
{
    private:
        string jenis;
        string bahan;
        string warna;
        
    public:
        Aksesoris(){

        }

        Aksesoris(string jenis, string bahan, string warna){
            this->jenis = jenis;
            this->bahan = bahan;
            this->warna = warna;
        }

        Aksesoris(string id, string nama, string harga, int stok, string jenis, string bahan, string warna)
            : petshop(id, nama, harga, stok){
            this->jenis = jenis;
            this->bahan = bahan;
            this->warna = warna;
        }

        // Getter
        string getJenis(){
            return jenis;
        }

        string getBahan(){
            return bahan;
        }

        string getWarna(){
            return warna;
        }

        // Setter
        void setJenis(string jenis) {
            this->jenis = jenis;
        }

        void setBahan(string bahan) {
            this->bahan = bahan;
        }

        void setWarna(string warna) {
            this->warna = warna;
        }

        ~Aksesoris(){

        }
};

