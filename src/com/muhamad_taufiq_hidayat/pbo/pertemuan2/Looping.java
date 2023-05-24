package com.muhamad_taufiq_hidayat.pbo.pertemuan2;

public class Looping {
    public static void main(String[] args) {
        for(int i=1; i< 10; i++){
            System.out.println("Peulangan for ke-"+ i);
        }
        System.out.println("Selesai Perulangan For");
        int j= 0;
        while(j<10){
            System.out.println("Perulangan while ke- "+ j);
            j++;
        }
        int k = 0;
        do{
            System.out.println("Perulangan doWhile ke - "+ k);
            k++;
        }while (k<10);
        System.out.println("Selesai perulangannya");
    }

}
