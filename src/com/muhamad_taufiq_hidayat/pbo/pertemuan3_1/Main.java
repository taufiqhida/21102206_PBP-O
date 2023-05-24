package com.muhamad_taufiq_hidayat.pbo.pertemuan3_1;

public class Main {
    public static void main(String[] args) {

        //Membuat Buku_Tulis
        Koperasi Buku_Tulis = new Koperasi(5000, "Buku Tulis", 10);
        Buku_Tulis.showInfo();
        System.out.println();
        //Membuat Pencil
        Koperasi pencil = new Koperasi(3000, "Pencil", 20);
        pencil.showInfo();

        System.out.println();
        //Membuat Total Barang
        System.out.println("Total Harga Semua Barang : " + (Buku_Tulis.getTotal_harga()+ pencil.getTotal_harga()));
    }

}
