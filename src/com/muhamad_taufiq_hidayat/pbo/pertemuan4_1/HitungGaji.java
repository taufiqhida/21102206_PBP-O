package com.muhamad_taufiq_hidayat.pbo.pertemuan4_1;

public class HitungGaji {
    // Atribut kelas
    private String NIP;
    private String nama;
    private String alamat;
    private int jumlahHariLembur;
    private double gajiPokok;
    private double totalGaji;

    // Constructor
    public HitungGaji(String NIP, String nama, String alamat, int jumlahHariLembur, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.jumlahHariLembur = jumlahHariLembur;
        this.gajiPokok = gajiPokok;
    }

    // Accessor (getter)
    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return nama;
    }

    // Accessor (getter)
    public String getAlamat() {
        return alamat;
    }

    public int getJumlahHariLembur() {
        return jumlahHariLembur;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getTotalGaji() {
        totalGaji = gajiPokok + (gajiPokok * jumlahHariLembur * 0.01);
        return totalGaji;
    }

    // Mutator (setter)
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJumlahHariLembur(int jumlahHariLembur) {
        this.jumlahHariLembur = jumlahHariLembur;
        hitungTotalGaji();
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
        hitungTotalGaji();
    }

    // Method overloading
    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = (double) gajiPokok;
        hitungTotalGaji();
    }

    // Menghitung total gaji
    private void hitungTotalGaji() {
        totalGaji = gajiPokok + (gajiPokok * jumlahHariLembur * 0.01);
    }
}