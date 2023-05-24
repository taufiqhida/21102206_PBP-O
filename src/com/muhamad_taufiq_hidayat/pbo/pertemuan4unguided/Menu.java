package com.muhamad_taufiq_hidayat.pbo.pertemuan4unguided;

public class Menu extends WarungMakan {
    int stok;
    int harga;
    String nama_makanan;
    int no_makanan;

    public void detaiMakanan() {
        System.out.println("No Makanan   : " + no_makanan);
        System.out.println("Nama Makanan : " + nama_makanan);
        System.out.println("Harga        : " + harga);
        System.out.println("Stok         : " + stok);
    }

    public void totalHarga() {
        System.out.println("Total Harga   : " + harga);
        System.out.println();
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public int getNo_makanan() {
        return no_makanan;
    }

    public void setNo_makanan(int no_makanan) {
        this.no_makanan = no_makanan;
    }
}

