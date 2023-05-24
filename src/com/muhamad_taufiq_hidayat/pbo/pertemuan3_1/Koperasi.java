package com.muhamad_taufiq_hidayat.pbo.pertemuan3_1;

public class Koperasi {
    private int harga_barang;
    private String nama_barang;

    private int jumlah_barang;

    private int total_harga;
    public Koperasi(int harga_barang, String nama_barang, int jumlah_barang) {
        this.harga_barang = harga_barang;
        this.nama_barang = nama_barang;
        this.jumlah_barang = jumlah_barang;
        total_harga = harga_barang*jumlah_barang;
    }
    void showInfo(){
        System.out.println("Nama Barang : " + nama_barang);
        System.out.println("Harga Satuan : " + harga_barang);
        System.out.println("Jumlah Barang : " + jumlah_barang);
        System.out.println("Total Harga : "+ total_harga);
    }


    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public int getTotal_harga() {
        return total_harga = harga_barang*jumlah_barang;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
}
