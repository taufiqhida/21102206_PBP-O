package com.muhamad_taufiq_hidayat.pbo.pertemuan2_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pilihan;
        char ulang;
        Bank a = new Bank();
        while(true){
            do{
                
                Scanner input = new Scanner(System.in);
                System.out.println("Selamat Datang di BankBeraksi");
                System.out.println("==============MENU===========");
                System.out.println();
                System.out.println("1. Tampil Saldo");
                System.out.println("2. Simpan Uang");
                System.out.println("3. Ambil Uang");
                System.out.println("4. Keluar");
                System.out.print("Silahkan Pilih Menu : ");
            pilihan = input.nextInt();
            if(pilihan == 1){
                a.getSaldo();
                System.out.println("==========  TAMPIL SALDO  =========");
                System.out.println();
            }else if(pilihan == 2){
                System.out.println("==========  TAMPIL SIMPAN UANG  =========");
                System.out.println();
                System.out.print("Simpan Uang : ");
                a.simpanUang();
            }else if(pilihan == 3){
                System.out.println("==========  TAMPIL AMBIL UANG  =========");
                System.out.println();
                System.out.print("Ambil Uang : ");
                a.ambilUang();
            }else if(pilihan == 4){
                System.out.println("Keluar menu");
                System.exit(0);
                break;
            }
            System.out.println("Mau Ulang ? ");
            ulang = input.next().charAt(0);
        }while(ulang == 'y' || ulang == 'Y');
        }
    
    }

}