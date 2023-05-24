package com.muhamad_taufiq_hidayat.pbo.pertemuan4;

public class Main {
    public static void main(String[] args) {
        Manajer manajer = new Manajer();

        manajer.nip = 181910024;
        manajer.nama = "Basuki";

        manajer.showInfo();
        manajer.extrainfo();
        manajer.bonus(100000);
        manajer.bonus();
    }
}
