package com.muhamad_taufiq_hidayat.pbo.pertemuan2;

import java.util.Scanner;

public class Pendaftaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("== Program Form Pendaftran Mahasiswa Baru ==");
        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine();
        if(nama!=""){
            System.out.print("Masukkan Umur : ");
            int umur = scanner.nextInt();
            if(umur >= 17){
               System.out.println("Pilihan Jurusan ");
               System.out.println("1. Teknik Informatika");
               System.out.println("2. Sistem Informasi");
               System.out.println("3. Rekayasa Perangkat Lunak");
               System.out.print("Maukkan Pilihan mu : ");
               int pilihan = scanner.nextInt();
               if(pilihan==1){
                System.out.println("== Data Pendaftaran ==");
                System.out.println("Nama : "+ nama);
                System.out.println("Umur : "+ umur);
                System.out.println("Jurusan : Teknik Informatika");
                System.out.println("== Data Pendaftaran ==");
            }else if(pilihan == 2){
                System.out.println("== Data Pendaftaran ==");
                System.out.println("Nama : "+ nama);
                System.out.println("Umur : "+ umur);
                System.out.println("Jurusan : Sistem Informasi");
                System.out.println("== Data Pendaftaran ==");
            }else if(pilihan == 3){
                System.out.println("== Data Pendaftaran ==");
                System.out.println("Nama      : "+ nama);
                System.out.println("Umur      : "+ umur);
                System.out.println("Jurusan : Rekayasa Perangkat Lunak");
                System.out.println("== Data Pendaftaran ==");
                }
            }else{
                System.out.println("Anda Belum Cukup Umur");
            }
        }else{
            System.out.println("Nama Gak boleh kosong");
        }
    }
    
}
