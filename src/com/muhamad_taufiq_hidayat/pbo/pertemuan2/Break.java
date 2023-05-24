package com.muhamad_taufiq_hidayat.pbo.pertemuan2;

public class Break {
    public static void main(String[] args) {
        int p=0;
        while(p <=100){
            System.out.println("Perulangan ke-"+p);
            if(p==50){
                System.out.println("Capek bro");
                break;
            }
            p+=10;
        }
    }
}
