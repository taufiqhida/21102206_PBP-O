package com.muhamad_taufiq_hidayat.pbo.pertemuan1;

import java.util.Scanner;
// import javax.swing.JOptionPane;
public class Mobil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Kategori;
        String cc, mobil;
        System.out.print("Input jenis mobil Anda : ");
        mobil= input.nextLine();
    if (mobil == "ferarri") {
        Kategori= "Sport";
        cc="4000";
    }else if (mobil == "bmw") {
        Kategori ="Classic";
        cc="2500";
    }else if (mobil == "mpv") {
        Kategori="Keluarga";
        cc="1500";
    }else {
        Kategori="tidak terdeteksi";
        cc="0";
}
System.out.println("mobil Anda " + mobil +" termasuk kategori "+Kategori);
System.out.println(
" dengan cc "+cc);
}
}