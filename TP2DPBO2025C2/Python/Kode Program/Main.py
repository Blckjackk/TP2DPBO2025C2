from Baju import Baju

data = []  # Buat objek sekali di luar loop

# Menambahkan 5 objek Baju ke dalam daftar
data.append(Baju("JCK-01", "Jaket Kulit", 250000, 5, "Casual", "Kulit Sintetis", "Hitam", "Pria", "L", "Eiger"))
data.append(Baju("T-SH-02", "T-Shirt Oversize", 120000, 20, "Casual", "Katun", "Putih", "Unisex", "XL", "H&M"))
data.append(Baju("SWT-03", "Sweater Hoodie", 175000, 10, "Casual", "Fleece", "Abu-abu", "Pria", "M", "Uniqlo"))
data.append(Baju("KME-04", "Kemeja Flanel", 190000, 12, "Casual", "Flanel", "Merah Hitam", "Unisex", "L", "Zara"))
data.append(Baju("BLZ-05", "Blazer Formal", 300000, 8, "Formal", "Wol", "Navy", "Wanita", "M", "Gucci"))

# Inisialisasi panjang maksimum setiap atribut
id_max = 0
nama_max = 0
harga_max = 0
stok_max = 0
jenis_max = 0
bahan_max = 0
warna_max = 0
untuk_max = 0
size_max = 0
merk_max = 0

# Loop untuk menghitung panjang maksimum dari setiap atribut
for baju in data:
    id_max = max(id_max, len(baju.getID()))
    nama_max = max(nama_max, len(baju.getNama()))
    harga_max = max(harga_max, len(str(baju.getHarga())))
    stok_max = max(stok_max, len(str(baju.getStok())))
    jenis_max = max(jenis_max, len(baju.getJenis()))
    bahan_max = max(bahan_max, len(baju.getBahan()))
    warna_max = max(warna_max, len(baju.getWarna()))
    untuk_max = max(untuk_max, len(baju.getUntuk()))
    size_max = max(size_max, len(baju.getSize()))
    merk_max = max(merk_max, len(baju.getMerk()))

# Menghitung total panjang tabel (tanpa batas kolom)
len_total = (
    id_max + nama_max + harga_max + stok_max + jenis_max + bahan_max +
    warna_max + untuk_max + size_max + merk_max + 10 * 2  # Ditambah padding antar kolom
)

# Membuat header tabel
header = f"| {'ID':<{id_max}} | {'Nama':<{nama_max}} | {'Harga':<{harga_max}} | {'Stok':<{stok_max}} | {'Jenis':<{jenis_max}} | {'Bahan':<{bahan_max}} | {'Warna':<{warna_max}} | {'Untuk':<{untuk_max}} | {'Size':<{size_max}} | {'Merk':<{merk_max}} |"

# Membuat garis pemisah
garisgaris = "-" * len(header)

# Menampilkan header tabel
print(garisgaris)
print(header)
print(garisgaris)

# Menampilkan isi data dalam format tabel
for baju in data:
    print(f"| {baju.getID():<{id_max}} | {baju.getNama():<{nama_max}} | {baju.getHarga():<{harga_max}} | {baju.getStok():<{stok_max}} | {baju.getJenis():<{jenis_max}} | {baju.getBahan():<{bahan_max}} | {baju.getWarna():<{warna_max}} | {baju.getUntuk():<{untuk_max}} | {baju.getSize():<{size_max}} | {baju.getMerk():<{merk_max}} |")
# Menutup tabel dengan garis pemisah
print(garisgaris)

idtemp = input("Masukkan ID Baru: ")
namatemp = input("Masukkan Nama Produk: ")
hargatemp = int(input("Masukkan Harga Produk: ")) 
stoktemp = int(input("Masukkan Stok Produk: ")) 
jenistemp = input("Masukkan Jenis Produk: ")
bahantemp = input("Masukkan Bahan Produk: ")
warnatemp = input("Masukkan Warna Produk: ")
untuktemp = input("Produk ini untuk (Pria/Wanita/Unisex): ")
sizetemp = input("Masukkan Ukuran Produk: ")
merktemp = input("Masukkan Merk Produk: ")

data.append(Baju(idtemp, namatemp, hargatemp, stoktemp, jenistemp, bahantemp, warnatemp, untuktemp, sizetemp, merktemp))



# Loop untuk menghitung panjang maksimum dari setiap atribut
for baju in data:
    id_max = max(id_max, len(baju.getID()))
    nama_max = max(nama_max, len(baju.getNama()))
    harga_max = max(harga_max, len(str(baju.getHarga())))
    stok_max = max(stok_max, len(str(baju.getStok())))
    jenis_max = max(jenis_max, len(baju.getJenis()))
    bahan_max = max(bahan_max, len(baju.getBahan()))
    warna_max = max(warna_max, len(baju.getWarna()))
    untuk_max = max(untuk_max, len(baju.getUntuk()))
    size_max = max(size_max, len(baju.getSize()))
    merk_max = max(merk_max, len(baju.getMerk()))

# Menghitung total panjang tabel (tanpa batas kolom)
len_total = (
    id_max + nama_max + harga_max + stok_max + jenis_max + bahan_max +
    warna_max + untuk_max + size_max + merk_max + 10 * 2  # Ditambah padding antar kolom
)

# Membuat header tabel
header = f"| {'ID':<{id_max}} | {'Nama':<{nama_max}} | {'Harga':<{harga_max}} | {'Stok':<{stok_max}} | {'Jenis':<{jenis_max}} | {'Bahan':<{bahan_max}} | {'Warna':<{warna_max}} | {'Untuk':<{untuk_max}} | {'Size':<{size_max}} | {'Merk':<{merk_max}} |"

# Membuat garis pemisah
garisgaris = "-" * len(header)

# Menampilkan header tabel
print(garisgaris)
print(header)
print(garisgaris)

# Menampilkan isi data dalam format tabel
for baju in data:
    print(f"| {baju.getID():<{id_max}} | {baju.getNama():<{nama_max}} | {baju.getHarga():<{harga_max}} | {baju.getStok():<{stok_max}} | {baju.getJenis():<{jenis_max}} | {baju.getBahan():<{bahan_max}} | {baju.getWarna():<{warna_max}} | {baju.getUntuk():<{untuk_max}} | {baju.getSize():<{size_max}} | {baju.getMerk():<{merk_max}} |")
# Menutup tabel dengan garis pemisah
print(garisgaris)