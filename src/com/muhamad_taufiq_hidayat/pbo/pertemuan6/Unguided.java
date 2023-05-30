package com.muhamad_taufiq_hidayat.pbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Unguided {
    public static int jumlahBilangan(int angka1, int angka2) {

        return angka1 / angka2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hasil;
        try {
            System.out.print("Masukkan Bilangan Pertama : ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan Bilangan Keedua : ");
            int angka2 = input.nextInt();
            hasil = jumlahBilangan(angka1, angka2);

            System.out.println("Hasil" + hasil);

        }catch (ArithmeticException e){
            System.out.println("Error : "+e);
            System.out.println("Terjadi keselahan: Input tidak valid. Harap masukkan bilangan bulat");
        }catch (InputMismatchException e){
            System.out.println("Error : "+e);
            System.out.println("Terjadi kesalahan: Pembagian dengan 0");
        }
    }
}
