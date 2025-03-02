import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        ArrayList<Baju> Data_Baju = new ArrayList<>();

        Data_Baju.add(new Baju("B001", "Kaos", "50000", 10, "Casual", "Katun", "Biru", "Pria", "M", "Nike"));
        Data_Baju.add(new Baju("B002", "Kemeja", "75000", 15, "Formal", "Poliester", "Putih", "Wanita", "L", "Zara"));
        Data_Baju.add(new Baju("B003", "Jaket", "120000", 7, "Casual", "Denim", "Hitam", "Unisex", "XL", "Levi's"));
        Data_Baju.add(new Baju("B004", "Sweater", "90000", 12, "Casual", "Wol", "Abu-abu", "Pria", "L", "Adidas"));
        Data_Baju.add(new Baju("B005", "Blouse", "85000", 20, "Formal", "Sutra", "Merah", "Wanita", "M", "Gucci"));

        String Pilihan;
        Scanner Scan = new Scanner(System.in);


        do{
            System.out.println();
            System.out.println("Input 1 untuk menambah data baru");
            System.out.println("Input 2 untuk print");
            System.out.println("Input 3 untuk keluar program");

            System.out.print("Masukkan inputan Pilihan produk yang ingin dicarii: ");
            Pilihan = Scan.next();

            if (Pilihan.equals("1")) {

                Baju Data_Temp = new Baju();

                System.out.print("Masukkan Pilihan ID baru : ");
                Data_Temp.setid(Scan.next());
    
                System.out.print("Masukkan Nama baru : ");
                Data_Temp.setnama_produk(Scan.next());
    
                System.out.print("Masukkan harga baru : ");
                Data_Temp.setharga_produk(Scan.next());
    
                System.out.print("Masukkan stok baru : ");
                Data_Temp.setstok_produk(Scan.nextInt());  

                System.out.print("Masukkan Pilihan Jenis baru : ");
                Data_Temp.set_jenis(Scan.next());
    
                System.out.print("Masukkan Bahan baru : ");
                Data_Temp.set_bahan(Scan.next());
    
                System.out.print("Masukkan Warna baru : ");
                Data_Temp.set_warna(Scan.next());

                System.out.print("Masukkan untuk baru : ");
                Data_Temp.set_untuk(Scan.next());

                System.out.print("Masukkan size baru : ");
                Data_Temp.set_size(Scan.next());

                System.out.print("Masukkan merk baru : ");
                Data_Temp.set_merk(Scan.next());     
                
                Data_Baju.add(Data_Temp);
                
            }else if (Pilihan.equals("2")) { // Menambahkan data baru


                int id_terpanjang = 2, nama_terpanjang = 4, harga_terpanjang = 5, stok_terpanjang = 4;
                int jenis_terpanjang = 5, bahan_terpanjang = 5, warna_terpanjang = 5, untuk_terpanjang = 5;
                int size_terpanjang = 4, merk_terpanjang = 4;
                int panjang_line=0;

                // Cari panjang maksimum dari setiap atribut
                for (int i = 0; i < Data_Baju.size(); i++) {
                    Baju baju = Data_Baju.get(i); // Ambil objek baju dari list
                    
                    id_terpanjang = Math.max(id_terpanjang, baju.getid().length());
                    nama_terpanjang = Math.max(nama_terpanjang, baju.getnama_produk().length());
                    harga_terpanjang = Math.max(harga_terpanjang, baju.getharga_produk().length());
                    stok_terpanjang = Math.max(stok_terpanjang, String.valueOf(baju.getstok_produk()).length());
                    jenis_terpanjang = Math.max(jenis_terpanjang, baju.getJenis().length());
                    bahan_terpanjang = Math.max(bahan_terpanjang, baju.getBahan().length());
                    warna_terpanjang = Math.max(warna_terpanjang, baju.getWarna().length());
                    untuk_terpanjang = Math.max(untuk_terpanjang, baju.getUntuk().length());
                    size_terpanjang = Math.max(size_terpanjang, baju.getSize().length());
                    merk_terpanjang = Math.max(merk_terpanjang, baju.getMerk().length());

                    int temp = id_terpanjang +nama_terpanjang +harga_terpanjang+stok_terpanjang+jenis_terpanjang+bahan_terpanjang+warna_terpanjang+untuk_terpanjang+size_terpanjang+merk_terpanjang;

                    if(temp > panjang_line+11){
                        panjang_line = temp;
                    }

                }
        
                String garis = "-".repeat(panjang_line + 11 * 3 - 2);
                System.out.println(garis);

                // Cetak header tabel
                System.out.printf("| %-" + id_terpanjang + "s | %-" + nama_terpanjang + "s | %-" + harga_terpanjang + "s | %-" + stok_terpanjang + "s | %-" + 
                jenis_terpanjang + "s | %-" + bahan_terpanjang + "s | %-" + warna_terpanjang + "s | %-" + 
                untuk_terpanjang + "s | %-" + size_terpanjang + "s | %-" + merk_terpanjang + "s |\n",
                "ID", "Nama", "Harga", "Stok", "Jenis", "Bahan", "Warna", "Untuk", "Size", "Merk");

                for (int j = 0; j < Data_Baju.size(); j++) {
                    Baju baju = Data_Baju.get(j); // Ambil objek Baju dari list
                
                    System.out.printf("| %-" + id_terpanjang + "s | %-" + nama_terpanjang + "s | %-" + harga_terpanjang + "s | %-" + stok_terpanjang + "s | %-" + 
                                      jenis_terpanjang + "s | %-" + bahan_terpanjang + "s | %-" + warna_terpanjang + "s | %-" + 
                                      untuk_terpanjang + "s | %-" + size_terpanjang + "s | %-" + merk_terpanjang + "s |\n",
                                      baju.getid(), baju.getnama_produk(), baju.getharga_produk(), baju.getstok_produk(), 
                                      baju.getJenis(), baju.getBahan(), baju.getWarna(), baju.getUntuk(), 
                                      baju.getSize(), baju.getMerk());
                }
                
                System.out.println(garis);   

                
              
                               
            }else if (Pilihan.equals("3")) { // Exit

                System.out.println("Terimakasih sudah menggunakan Java Ajam");
            }else{

                System.out.println("Syntax anda Error!!!");
            }

        }while(!Pilihan.equals("3"));

        Scan.close();
        

    }
}
