package com.muhamad_taufiq_hidayat.pbo.pertemuan2;

import java.util.Scanner;

public class Genap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" == Program Menampilkan Bilangan Genap == ");
        System.out.print("Masukkan Batas Bilangan : ");
        int angka = scanner.nextInt();
        for(int i=1; i<=angka; i++){//Perulangan
            if(i%2 == 0){//Percabnagan jika genap akan jalan
                System.out.println("Bilangan genap : " + i); //dan akan mencetak ini
            }
        }
    }
}
