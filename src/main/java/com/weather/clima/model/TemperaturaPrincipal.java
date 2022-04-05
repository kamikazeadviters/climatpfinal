package com.weather.clima.model;

import com.weather.clima.enums.CategoriasPrincipales;
import com.weather.clima.enums.Estaciones;
import com.weather.clima.enums.Provincias;

import javax.persistence.*;
import java.sql.Date;
@Entity
@Table (name = "Temperatura", schema = "clima")
public class TemperaturaPrincipal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reporteid;
    private Date fecha;
    private double temperatura;
    private double sensacion;
    private double tempmin;
    private double tempmax;
    private int presion;
    private int humedad;
    private int nubosidad;
    private Estaciones estaciones = Estaciones.O;
    private Provincias provincias = Provincias.PBA;
    private CategoriasPrincipales categoriaprincipal = CategoriasPrincipales.FINE;
    private String descripciongeneral;

    public int getReporteid() {
        return reporteid;
    }

    public Date getFecha() {
        return fecha;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public double getSensacion() {
        return sensacion;
    }

    public double getTempmin() {
        return tempmin;
    }

    public double getTempmax() {
        return tempmax;
    }

    public int getPresion() {
        return presion;
    }

    public int getHumedad() {
        return humedad;
    }

    public int getNubosidad() {
        return nubosidad;
    }

    public Estaciones getEstaciones() {
        return estaciones;
    }

    public Provincias getProvincias() {
        return provincias;
    }

    public CategoriasPrincipales getCategoriaprincipal() {
        return categoriaprincipal;
    }

    public String getDescripciongeneral() {
        return descripciongeneral;
    }

    public void setReporteid(int reporteid) {
        this.reporteid = reporteid;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void setSensacion(double sensacion) {
        this.sensacion = sensacion;
    }

    public void setTempmax(double tempmax) {
        this.tempmax = tempmax;
    }

    public void setTempmin(double tempmin) {
        this.tempmin = tempmin;
    }

    public void setPresion(int presion) {
        this.presion = presion;
    }

    public void setHumedad(int humedad) {
        this.humedad = humedad;
    }

    public void setNubosidad(int nubosidad) {
        this.nubosidad = nubosidad;
    }

    public void setEstaciones(Estaciones estaciones) {
        this.estaciones = estaciones;
    }

    public void setProvincias(Provincias provincias) {
        this.provincias = provincias;
    }

    public void setCategoriaprincipal(CategoriasPrincipales categoriaprincipal) {
        this.categoriaprincipal = categoriaprincipal;
    }

    public void setDescripciongeneral(String descripciongeneral) {
        this.descripciongeneral = descripciongeneral;
    }

    public TemperaturaPrincipal() {
    }

    public TemperaturaPrincipal(int reporteid, Date fecha, double temperatura, double sensacion,
                                double tempmin, double tempmax, int presion, int humedad, int nubosidad,
                                Estaciones estaciones, Provincias provincias, CategoriasPrincipales categoriaprincipal,
                                String descripciongeneral) {
        setReporteid(reporteid);
        setFecha(fecha);
        setTemperatura(temperatura);
        setTempmin(tempmin);
        setTempmax(tempmax);
        setPresion(presion);
        setHumedad(humedad);
        setNubosidad(nubosidad);
        setEstaciones(estaciones);
        setProvincias(provincias);
        setCategoriaprincipal(categoriaprincipal);
        setDescripciongeneral(descripciongeneral);
    }
}

