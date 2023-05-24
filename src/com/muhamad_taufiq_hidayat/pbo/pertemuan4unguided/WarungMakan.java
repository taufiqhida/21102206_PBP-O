package com.muhamad_taufiq_hidayat.pbo.pertemuan4unguided;

public class WarungMakan {
    String no_telp;
    String nama_warung;
    String alamat;

    public void detailWarung() {
        System.out.println("<<>> Warung Makan Tunggal Rasa <<>>");
        System.out.println("Nama Warung : " + nama_warung);
        System.out.println("ALamat      : " + alamat);
        System.out.println("No Telpon   : " + no_telp);
        System.out.println();
    }

    public void cekStok(Menu m) {

        switch (m.no_makanan){
            case 1:
                System.out.println("Stok Nasi Goreng : " + m.stok);
                break;
            case 2:
                System.out.println("Stok Nasi Goreng Spesial : " + m.stok);
                break;
            case 3:
                System.out.println("Stok Nasi Goreng SPesial + Telur : " + m.stok);
                break;
            default:
                System.out.println("Salah menu");

        }
        System.out.println();
    }

    public void beliMakanan(Menu m, int jumlah) {
        if (jumlah >= m.stok) {
            System.out.println("Stok tidak cukup");
            System.exit(0);
            m.harga = 0;
        } else {
            System.out.println("<<< Detail Pembelian >>>");
            System.out.println();
            System.out.println("Nama Makanan  : " + m.nama_makanan);
            System.out.println("Harga         : " + m.harga);
            System.out.println("Jumlah        : " + jumlah);
            m.harga = m.harga * jumlah;
            m.stok -= jumlah;
        }
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getNama_warung() {
        return nama_warung;
    }

    public void setNama_warung(String nama_warung) {
        this.nama_warung = nama_warung;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
