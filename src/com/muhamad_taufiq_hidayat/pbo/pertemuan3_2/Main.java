package com.muhamad_taufiq_hidayat.pbo.pertemuan3_2;

import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int beli, dibeli, masuk;

        Scanner input = new Scanner(System.in);

        Buku pboj = new Buku(1, "Pemprograman Berbasis Onjek Dengan Java", "Indrajani", 2007, 70000);
        Buku dpo = new Buku(2, "Dasar Pemprograman Objek", "Abdul Kedir", 2004, 30000);

        System.out.println("=== List Buku ===");
        System.out.println("No Buku : "+pboj.getNo_buku());
        System.out.println("Judul Buku : "+ pboj.getJudul_buku());
        System.out.println("Pengarang : " + pboj.getPengarang());
        System.out.println("Tahun Terbit : " + pboj.getTahun_terbit());
        System.out.println("Harga : " + pboj.getHarga());
        System.out.println();
        System.out.println("No Buku : "+dpo.getNo_buku());
        System.out.println("Judul Buku : "+dpo.getJudul_buku());
        System.out.println("Pengarang : "+dpo.getPengarang());
        System.out.println("Tahun Terbit : "+dpo.getTahun_terbit());
        System.out.println("Harga : "+ dpo.getHarga());
        System.out.println();
        System.out.println("=== List Buku ===");

        System.out.print("Masukkan No buku yang ingin dibeli : ");
        beli = input.nextInt();
        
        switch (beli){
            case 1:
                System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
                dibeli = input.nextInt();
                System.out.println("Total Harga : " + pboj.getHarga()*dibeli);
                System.out.print("Masukkan jumlah uang : ");
                masuk = input.nextInt();
                System.out.println("=== Rincian Pembelian Buku ===");
                System.out.println("Judul Buku : " + pboj.getJudul_buku());
                System.out.println("Pengarang : " + pboj.getPengarang());
                System.out.println("Tahum Terbit : " + pboj.getTahun_terbit());
                System.out.println("Harga : "+ pboj.getHarga()*dibeli);
                System.out.println("=== Rincian Pembelian Buku ===");
                System.out.println();
                System.out.println("Rincian Pembayaran");
                System.out.println("Jumlah Bayar : "+ masuk);
                System.out.println("Kembalian : "+ (masuk-(pboj.getHarga()*dibeli)));
                break;
                
                case 2:
                System.out.print("Masukkan jumlah buku yang ingin dibeli : ");
                dibeli = input.nextInt();
                System.out.println("Total Harga : " + dpo.getHarga()*dibeli);
                System.out.print("Masukkan jumlah uang : ");
                masuk = input.nextInt();
                System.out.println("=== Rincian Pembelian Buku ===");
                System.out.println("Judul Buku : " + dpo.getJudul_buku());
                System.out.println("Pengarang : " + dpo.getPengarang());
                System.out.println("Tahum Terbit : " + dpo.getTahun_terbit());
                System.out.println("Harga : "+ dpo.getHarga()*dibeli);
                System.out.println("=== Rincian Pembelian Buku ===");
                System.out.println();
                System.out.println("Rincian Pembayaran");
                System.out.println("Jumlah Bayar : "+ masuk);
                System.out.println("Kembalian : "+ (masuk-(dpo.getHarga()*dibeli)));
                break;

            default:
                System.out.println("Salah bro");
        }

    }
}
