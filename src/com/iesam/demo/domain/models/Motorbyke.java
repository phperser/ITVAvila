package com.iesam.demo.domain.models;

public class Motorbyke implements Vehiculo {
    private String matricula;
    private String brand;
    private String model;
    private String color;
    private String matricDate;
    private Double diamRuedas;

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

    public Double getDiamRuedas() {
        return diamRuedas;
    }

    public void setDiamRuedas(Double diamRuedas) {
        this.diamRuedas = diamRuedas;
    }
}
