package com.muhamad_taufiq_hidayat.pbo.pertemuan6;

public class TryCatch {
    public static void main(String[] args) {
        //Membuat Array
        int[] angka = {
                1, 2, 3, 4, 5
        };

        //Memanggil array
//        System.out.println(
//                angka[6]
//        );
        System.out.println("Index ke 4 dari array angka adalah ");
        try {
            //Memanggil array
            System.out.println(
                    angka[4]
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Index yang anda masukkan salah"
            );
        }
        System.out.println(
                "Akhir dari program"
        );
        System.out.println("Index ke 6 nggak ada ");
        try {
            //Memanggil array
            System.out.println(
                    angka[6]
            );
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(
                    "Index yang anda masukkan salah"
            );
        }
        System.out.println(
                "Akhir dari program"
        );
    }
}
