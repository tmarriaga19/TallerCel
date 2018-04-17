package com.tmarriaga.tallercel;

/**
 * Created by Android on 16/04/2018.
 */

public class celular {
    private int marca;
    private int color;
    private double  precio;

    public celular (int marca,int color,double precio){
        this.marca = marca ;
        this.color = color;
        this.precio = precio;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void guardar(){
        datos.guardar(this);
    }

}


