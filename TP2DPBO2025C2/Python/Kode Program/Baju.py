from Aksesoris import Aksesoris

class Baju(Aksesoris):
     
    def __init__(self,ID, Nama, harga, stok, jenis, bahan, warna, untuk, size, merk):
        super().__init__(ID, Nama, harga, stok, jenis, bahan, warna)
        self.untuk = untuk
        self.size = size
        self.merk = merk

    def setUntuk(self, untuk):
        self.untuk = untuk

    def setSize(self, size):
        self.size = size

    def setMerk(self, merk):
        self.merk = merk

    def getUntuk(self):
        return self.untuk

    def getSize(self):
        return self.size

    def getMerk(self):
        return self.merk
    
    def __str__(self):
        return super().__str__()

