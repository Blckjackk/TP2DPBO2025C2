#include "Aksesoris.cpp"

using namespace std;

class Baju : public Aksesoris {
    private:
        string untuk;
        string size;
        string merk;

    public:
        // Konstruktor default
        Baju() {}

        Baju(string untuk, string size, string merk) {
            this->untuk = untuk;
            this->size = size;
            this->merk = merk;
        }

        Baju(string id, string nama, string harga, int stok, string jenis, string bahan, string warna, string untuk, string size, string merk)
        : Aksesoris(id, nama, harga, stok, jenis, bahan, warna) { 
        this->untuk = untuk;
        this->size = size;
        this->merk = merk;
        }

        // Getter
        string getUntuk(){
            return untuk;
        }

        string getSize(){
            return size;
        }

        string getMerk(){
            return merk;
        }

        // Setter
        void setUntuk(string untuk) {
            this->untuk = untuk;
        }

        void setSize(string size) {
            this->size = size;
        }

        void setMerk(string merk) {
            this->merk = merk;
        }

        // Destructor
        ~Baju() {}
};
