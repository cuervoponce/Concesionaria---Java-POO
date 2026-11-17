package org.ar.centro8.java.curso.concesionaria;

import lombok.Getter;

@Getter
//@ToString no lo utilizamos porque necesitamos una salida personalizada, exactamente como pide la consigna.
//Auto hereda de la clase abstracta Vehiculo.
public class Auto extends Vehiculo{

    private int puertas;

    public Auto(String marca, String modelo, double precio, int puertas){
        super(marca, modelo, precio);
        this.puertas = puertas;
    }
    
    //Personaliza la salida por consola respetando el formato solicitado para los autos.
    @Override 
    public String toString(){
        //Esto nos permite controlar exactamente cómo se imprime el vehículo.
        return "Marca: " + getMarca()
                + " // Modelo: " + getModelo()
                + " // Puertas: " + puertas
                + " // Precio: " + formatoPrecio();
    }
}