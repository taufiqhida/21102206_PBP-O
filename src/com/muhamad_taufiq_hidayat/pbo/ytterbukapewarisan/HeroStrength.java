package com.muhamad_taufiq_hidayat.pbo.ytterbukapewarisan;

public class HeroStrength extends Hero{
    double defencePower;

    void display(){
        System.out.println("Hero Strength");
        System.out.println("Hero name : "+ this.name);
        System.out.println("Defence Power : "+ this.defencePower);
    }
}
