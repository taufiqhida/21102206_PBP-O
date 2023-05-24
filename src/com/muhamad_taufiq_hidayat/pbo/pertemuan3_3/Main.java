package com.muhamad_taufiq_hidayat.pbo.pertemuan3_3;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int beli, masuk, uang;

        Scanner input = new Scanner(System.in);

        Buku pboj = new Buku(1, "Pemprograman Berbasis Objek Dengan Java", "Indrajani", 2007, 70000);
        Buku dpo = new Buku(2, "Dasar Pemprograman Objek", "Abdul Kedir", 2004, 30000);

        System.out.println("=== List Buku ===");
        pboj.infoBuku();
        dpo.infoBuku();
        System.out.println("=== List Buku ===");
        
        System.out.print("Masukkan No buku yang ingin dibeli : ");
        beli = input.nextInt();//Inputan pembelian buku 
        
        switch (beli){
            case 1:
            System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
            masuk = input.nextInt();//Inputan untuk jumlah buku yang ingin dibeli
            System.out.print("Total Harga : ");
            pboj.beli_buku(masuk);//Manggil method total harga
            System.out.print("Masukkan jumlah uang : ");
            uang = input.nextInt();//Inputan untuk jumlah yang akan di bayar
            System.out.println("=== Rincian Pembelian Buku ===");
            pboj.infoBuku();
            System.out.println("=== Rincian Pembelian Buku ===");
                System.out.println();
                System.out.println("=== Rincian Pembayaran ====");
                System.out.println("Jumlah bayar : "+uang);
                System.out.print("Kembalian : ");
                pboj.bayar_buku(uang); //Manggil method pembayaran
                System.out.println("=== Rincian Pembayaran ====");
                break;
            case 2:
                System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
                masuk = input.nextInt();
                System.out.print("Total Harga : ");
                dpo.beli_buku(masuk);
                System.out.print("Masukkan jumlah uang : ");
                uang = input.nextInt();
                System.out.println("=== Rincian Pembelian Buku ===");
                dpo.infoBuku();
                System.out.println();
                System.out.println("=== Rincian Pembelian Buku ===");
                System.out.println("Jumlah bayar : "+uang);
                System.out.print("Kembalian : ");
                dpo.bayar_buku(uang);
                System.out.println("=== Rincian Pembayaran ===");
                break;

            default:
                System.out.println("Salah bro");
        }

    }
}

