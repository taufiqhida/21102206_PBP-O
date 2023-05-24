package com.muhamad_taufiq_hidayat.pbo.pertemuan4;

public class Manajer extends Pegawai{
    public void bonus(int bonus){
        System.out.println("Pegawai dengan nama "+nama+"("+nip+") mendapat bonus sebesar Rp "+bonus);
    }
    public void bonus(){
        System.out.println("Nilai Bonus Nggak Boleh Kosong");
    }
}
