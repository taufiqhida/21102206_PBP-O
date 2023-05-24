package com.muhamad_taufiq_hidayat.pbo.pertemuan2_2;

import java.util.Scanner;

class Bank {
    // Scanner input = new Scanner(System.in);
    private int masuk;
    private int tampil;
    private int awal;
    private int keluar;
    Scanner input = new Scanner(System.in);

    void getSaldo(){
        // this.pilihan = pilihan;
        // this.masuk = masuk;
        // this.tampil =tampil;
        // this.awal = awal;
        awal = 10000;
        System.out.println("Salfo saat ini: Rp. " + awal+ ",00");
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
