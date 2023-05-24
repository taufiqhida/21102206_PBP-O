package com.muhamad_taufiq_hidayat.pbo.pertemuan2;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Sebuah bilangan : ");
        int bilangan = scanner.nextInt();

        if(bilangan > 0){
            System.out.println("Bilangan Positif");
        }else if(bilangan <  0){
            System.out.println("Bilangan Negatif");
        }else{
            System.out.println("Bilangan 0");
        }

    }
}
