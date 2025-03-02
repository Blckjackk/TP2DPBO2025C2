#include <iostream>
#include <vector>
#include "Baju.cpp"

using namespace std;

int main() {
    vector<Baju> Data_Baju;

    // Menambahkan data awal dengan objek sementara
    Baju baju1("B001", "Kaos", "50000", 10, "Casual", "Katun", "Biru", "Pria", "M", "Nike");
    Baju baju2("B002", "Kemeja", "75000", 15, "Formal", "Poliester", "Putih", "Wanita", "L", "Zara");
    Baju baju3("B003", "Jaket", "120000", 7, "Casual", "Denim", "Hitam", "Unisex", "XL", "Levi's");
    Baju baju4("B004", "Sweater", "90000", 12, "Casual", "Wol", "Abu-abu", "Pria", "L", "Adidas");
    Baju baju5("B005", "Blouse", "85000", 20, "Formal", "Sutra", "Merah", "Wanita", "M", "Gucci");

    // Menyimpan objek ke dalam vector
    Data_Baju.push_back(baju1);
    Data_Baju.push_back(baju2);
    Data_Baju.push_back(baju3);
    Data_Baju.push_back(baju4);
    Data_Baju.push_back(baju5);

    string Pilihan;
    do {
        cout << "\nInput 1 untuk menambah data baru" << endl;
        cout << "Input 2 untuk print" << endl;
        cout << "Input 3 untuk keluar program" << endl;
        cout << "Masukkan pilihan: ";
        cin >> Pilihan;

        if (Pilihan == "1") {
            Baju Data_Temp;
            string id, nama, harga, jenis, bahan, warna, untuk, size, merk;
            int stok;

            cout << "Masukkan ID baru: ";
            cin >> id;
            Data_Temp.set_id(id);

            cout << "Masukkan Nama baru: ";
            cin >> nama;
            Data_Temp.set_nama_produk(nama);

            cout << "Masukkan Harga baru: ";
            cin >> harga;
            Data_Temp.set_harga_produk(harga);

            cout << "Masukkan Stok baru: ";
            cin >> stok;
            Data_Temp.set_stok_produk(stok);

            cout << "Masukkan Jenis baru: ";
            cin >> jenis;
            Data_Temp.setJenis(jenis);

            cout << "Masukkan Bahan baru: ";
            cin >> bahan;
            Data_Temp.setBahan(bahan);

            cout << "Masukkan Warna baru: ";
            cin >> warna;
            Data_Temp.setWarna(warna);

            cout << "Masukkan Untuk: ";
            cin >> untuk;
            Data_Temp.setUntuk(untuk);

            cout << "Masukkan Size: ";
            cin >> size;
            Data_Temp.setSize(size);

            cout << "Masukkan Merk: ";
            cin >> merk;
            Data_Temp.setMerk(merk);

            Data_Baju.push_back(Data_Temp);

        } else if (Pilihan == "2") {
            cout << "---------------------------------------------" << endl;
            cout << "ID  | Nama   | Harga  | Stok | Jenis  | Bahan | Warna | Untuk | Size | Merk" << endl;
            cout << "---------------------------------------------" << endl;

            int id_terpanjang = 2, nama_terpanjang = 4, harga_terpanjang = 5, stok_terpanjang = 4;
            int jenis_terpanjang = 5, bahan_terpanjang = 5, warna_terpanjang = 5, untuk_terpanjang = 5;
            int size_terpanjang = 4, merk_terpanjang = 4;
            int panjang_line = 0;
        
            // Loop untuk mencari string terpanjang dari setiap atribut
            for (int i = 0; i < Data_Baju.size(); i++) {
                if (Data_Baju[i].get_id().length() > id_terpanjang)
                    id_terpanjang = Data_Baju[i].get_id().length();

                if (Data_Baju[i].get_nama_produk().length() > nama_terpanjang)
                    nama_terpanjang = Data_Baju[i].get_nama_produk().length();

                if (Data_Baju[i].get_nama_produk().length() > nama_terpanjang)
                    nama_terpanjang = Data_Baju[i].get_nama_produk().length();

                if (Data_Baju[i].get_harga_produk().length() > harga_terpanjang)
                    harga_terpanjang = Data_Baju[i].get_harga_produk().length();

                if (to_string(Data_Baju[i].get_stok_produk()).length() > stok_terpanjang)
                    stok_terpanjang = to_string(Data_Baju[i].get_stok_produk()).length();

                if (Data_Baju[i].getJenis().length() > bahan_terpanjang)
                    bahan_terpanjang = Data_Baju[i].getJenis().length();

                if (Data_Baju[i].getBahan().length() > bahan_terpanjang)
                    bahan_terpanjang = Data_Baju[i].getBahan().length();

                if (Data_Baju[i].getWarna().length() > warna_terpanjang)
                    warna_terpanjang = Data_Baju[i].getWarna().length();

                if (Data_Baju[i].getUntuk().length() > untuk_terpanjang)
                    untuk_terpanjang = Data_Baju[i].getUntuk().length();
                    
                if (Data_Baju[i].getSize().length() > size_terpanjang)
                    size_terpanjang = Data_Baju[i].getSize().length();
                    
                if (Data_Baju[i].getMerk().length() > merk_terpanjang)
                    merk_terpanjang = Data_Baju[i].getMerk().length();
            }

            panjang_line = id_terpanjang + nama_terpanjang +harga_terpanjang+ stok_terpanjang+ jenis_terpanjang + bahan_terpanjang + warna_terpanjang + untuk_terpanjang + size_terpanjang + merk_terpanjang;

           for (int i = 0; i < Data_Baju.size(); i++) {
                cout << Data_Baju[i].get_id() << " | "
                    << Data_Baju[i].get_nama_produk() << " | "
                    << Data_Baju[i].get_harga_produk() << " | "
                    << Data_Baju[i].get_stok_produk() << " | "
                    << Data_Baju[i].getJenis() << " | "
                    << Data_Baju[i].getBahan() << " | "
                    << Data_Baju[i].getWarna() << " | "
                    << Data_Baju[i].getUntuk() << " | "
                    << Data_Baju[i].getSize() << " | "
                    << Data_Baju[i].getMerk() << endl;
            }

            cout << "---------------------------------------------" << endl;

        } else if (Pilihan == "3") {
            cout << "Terima kasih sudah menggunakan program ini!" << endl;
        } else {
            cout << "Syntax anda Error!!!" << endl;
        }

    } while (Pilihan != "3");

    return 0;
}
