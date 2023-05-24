package com.muhamad_taufiq_hidayat.pbo.pertemuan2_1;

import java.util.Scanner;

class Bank {
    // Scanner input = new Scanner(System.in);
    private int pilihan;
    private int masuk;
    // private int tampil;
    private int tampil = 10000;
    private int keluar;
    Scanner input = new Scanner(System.in);

    void getSaldo(){
        // this.pilihan = pilihan;
        // this.masuk = masuk;
        // this.tampil =tampil;
        // this.awal = awal;
        // awal 
        // tampil = tampil + awal;
        // tampil;
        System.out.println("Salfo saat ini: Rp. " + tampil + ",00");
    }
    void simpanUang(){
        masuk = input.nextInt();
        tampil = tampil + masuk;
        System.out.println("Saldo saat ini: Rp "+ tampil + ",00");
    }
    void ambilUang(){
        keluar = input.nextInt();
        tampil = tampil - keluar;
        System.out.println("Saldo saat ini: Rp "+ tampil+",00");
    }
}
