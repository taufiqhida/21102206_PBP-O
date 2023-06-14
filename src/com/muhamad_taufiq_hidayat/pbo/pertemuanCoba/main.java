package com.muhamad_taufiq_hidayat.pbo.pertemuanCoba;

public class main {
    public static void main(String[] args){
        engine engine = new engine("CVT");
        mobil mobil = new mobil("CIvic",engine);
        System.out.println("Mobil: " + mobil.getBrand());
        System.out.println("Engine: " + mobil.getEngine().getType());
    }
}

