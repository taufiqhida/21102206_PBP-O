package com.muhamad_taufiq_hidayat.pbo.ytpewarisan;
//inheritece adlahah is a
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "Taufiq";
        hero1.displayName();

        HeroStrength hero2= new HeroStrength();
        hero2.name = "Hidayat";
        hero2.displayName();

        HeroIntelligent hero3= new HeroIntelligent();
        hero3.name = "Muhamad";
        hero3.displayName();
    }
}
