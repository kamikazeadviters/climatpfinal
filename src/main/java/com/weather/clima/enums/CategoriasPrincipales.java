package com.weather.clima.enums;

public enum CategoriasPrincipales {
    HEAT("Caluroso"),
    FINE("Templado"),
    CLOUDY("Nublado"),
    RAINY("Lluvioso");
    public int id;
    public final String desc;
    CategoriasPrincipales(String desc){this.desc = desc;};

    public String getDesc() {
        return desc;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
