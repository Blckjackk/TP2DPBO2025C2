<?php
require "Petshop.php";

class Aksesoris extends Petshop {
    private $jenis;
    private $bahan;
    private $warna;

    public function __construct($ID, $Nama, $Kategori, $Harga, $Gambar, $jenis, $bahan, $warna) {
        parent::__construct($ID, $Nama, $Kategori, $Harga, $Gambar);
        $this->jenis = $jenis;
        $this->bahan = $bahan;
        $this->warna = $warna;
    }

    public function getjenis() {
        return $this->jenis;
    }

    public function getbahan() {
        return $this->bahan;
    }

    public function getwarna() {
        return $this->warna;
    }

    public function setbahan($bahan) {
        $this->bahan = $bahan;
    }

    public function setwarna($warna) {
        $this->warna = $warna;
    }

    public function setjenis($jenis) {
        $this->jenis = $jenis;
    }

    public function __destruct() {
    }

}
?>
