package com.muhamad_taufiq_hidayat.pbo.pertemuan3;

public class Main {
    public static void main(String[] args) {

    SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 20000000);
    SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
    SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 23500000);

    suzuki.showInfo();
    yamaha.showInfo();
    honda.showInfo();

        System.out.println("Motor merk "+ suzuki.getMerek()+" dengan tipe (before) : "+suzuki.getTipe());
        suzuki.setTipe("Satria FU");
        System.out.println("Motor merk "+ suzuki.getMerek()+" dengan tipe (after) : "+suzuki.getTipe());
    }
}
