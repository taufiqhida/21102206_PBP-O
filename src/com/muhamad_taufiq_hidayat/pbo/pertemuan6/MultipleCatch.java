package com.muhamad_taufiq_hidayat.pbo.pertemuan6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatch {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.print("Masukkan Angga : ");
            int angka1 = input.nextInt();
            System.out.print("Masukkan Angga : ");
            int angka2 = input.nextInt();

            int hasil = angka1 / angka2;
            System.out.println(angka1 + " / " + angka2 + " = " + hasil + " Di bulatkan ");
        }
        catch(ArithmeticException e){
            System.out.println("Error : " + e);
        }
        catch (InputMismatchException e){
            System.out.println("Error : "+ e);
        }
        finally {
            System.out.println(
                    "finnaly selalu di jalankan"
            );
        }
        System.out.println("Akhir dari program");
    }
}
