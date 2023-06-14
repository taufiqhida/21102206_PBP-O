package com.muhamad_taufiq_hidayat.pbo.pertemuanCoba;

public class mobil {
    private String brand;
    private engine engine;

    public mobil(String brand, engine engine)
    {
        this.brand = brand;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public engine getEngine() {
        return engine;
    }
}
