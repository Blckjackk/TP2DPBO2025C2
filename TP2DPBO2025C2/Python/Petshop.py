class Petshop:

    def __init__(self, ID, Nama, Harga, Stok):
        self.ID = ID
        self.Nama = Nama
        self.Harga = Harga
        self.Stok = Stok
        

    def setID(self, ID):
        self.ID = ID

    def setNama(self, Nama):
        self.Nama = Nama

    def setHarga(self, Harga):
        self.Harga = Harga

    def setStok(self, Stok):
        self.Stok = Stok

    def getID(self):
        return self.ID

    def getNama(self):
        return self.Nama

    def getHarga(self):
        return self.Harga

    def getStok(self):
        return self.Stok