package com.iesam.itvavila.demo.domain.models;

public class Truck implements Vehiculo{
    private String matricula;
    private String brand;
    private String model;
    private String color;
    private String matricDate;
    private Double tara;
    private Double longi;

    @Override
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String getMatricDate() {
        return matricDate;
    }

    public void setMatricDate(String matricDate) {
        this.matricDate = matricDate;
    }

    public Double getTara() {
        return tara;
    }

    public void setTara(Double tara) {
        this.tara = tara;
    }

    public Double getLongi() {
        return longi;
    }

    public void setLongi(Double longi) {
        this.longi = longi;
    }
}
