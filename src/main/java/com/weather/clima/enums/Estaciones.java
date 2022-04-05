package com.weather.clima.enums;

public enum Estaciones {
    I("invierno"), O("otoño"), P("Primavera"), V ("Verano");
    public int id;
    public final String desc;
    Estaciones(String desc){this.desc = desc;};
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
