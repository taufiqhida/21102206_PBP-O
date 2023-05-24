package com.muhamad_taufiq_hidayat.pbo.pertemuan4_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Masukkan NIP: ");
            String NIP = reader.readLine();

            System.out.print("Masukkan Nama: ");
            String nama = reader.readLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = reader.readLine();

            System.out.print("Masukkan Jumlah Hari Lembur: ");
            int jumlahHariLembur = Integer.parseInt(reader.readLine());

            System.out.print("Masukkan Gaji Pokok: ");
            double gajiPokok = Double.parseDouble(reader.readLine());

            // Membuat objek gajiKaryawan
            HitungGaji gajiKaryawan = new HitungGaji(NIP, nama, alamat, jumlahHariLembur, gajiPokok);

            System.out.println("\nInformasi Gaji Karyawan:");
            System.out.println("NIP: " + gajiKaryawan.getNIP());
            System.out.println("Nama: " + gajiKaryawan.getNama());
            System.out.println("Alamat: " + gajiKaryawan.getAlamat());

            System.out.println("Jumlah	Hari Lembur:" + gajiKaryawan.getJumlahHariLembur());
            System.out.println("Gaji Pokok:	" + gajiKaryawan.getGajiPokok());
            System.out.println("Total Gaji:	" + gajiKaryawan.getTotalGaji());

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca input: " + e.getMessage());
        }
    }
}
