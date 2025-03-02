from Petshop import Petshop 

class Aksesoris(Petshop):

    def __init__(self,ID, Nama, Kategori, Harga, jenis, bahan, warna):
        super().__init__(ID, Nama, Kategori, Harga)
        self.jenis = jenis
        self.bahan = bahan
        self.warna = warna

    def setJenis(self, jenis):
        self.jenis = jenis

    def setBahan(self, bahan):
        self.bahan = bahan

    def setWarna(self, warna):
        self.warna = warna

    def getJenis(self):
        return self.jenis

    def getBahan(self):
        return self.bahan

    def getWarna(self):
        return self.warna
