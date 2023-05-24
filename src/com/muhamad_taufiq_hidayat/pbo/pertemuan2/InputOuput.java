package com.muhamad_taufiq_hidayat.pbo.pertemuan2;

import java.util.Scanner;//Libalary untuk input output

public class InputOuput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Variable Scanner
//        Scanner angka = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");//Mencetak masukkan nama
        String nama = scanner.nextLine();//Untuk input
        System.out.print("Masukkan Umur : ");
        int umur = scanner.nextInt();

        System.out.println("Selamat Datang " + nama + " ! ");//Mencetak hasil input dari
        System.out.println("Umur kamu "+ umur);
    }
}
