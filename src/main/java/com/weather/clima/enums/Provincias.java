package com.weather.clima.enums;

public enum Provincias {
    PBA("Buenos Aires"), CABA("Ciudad de Buenos Aires"), CBA("Cordoba");
    public int id;
    public final String desc;
    Provincias(String desc){this.desc = desc;}
    public String getDesc() {
        return desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
