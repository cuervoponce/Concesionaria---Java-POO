package org.ar.centro8.java.curso.concesionaria;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public abstract class Vehiculo implements Comparable<Vehiculo>{
    //Implementa Comparable para establecer el orden natural de los vehículos.
    //Se utiliza private para proteger los atributos y evitar su acceso directo desde otras clases.
    //Las clases hijas pueden consultar sus valores mediante los métodos Getter.
    private String marca;
    private String modelo;
    private double precio;
    
    //Método auxiliar para dar formato al precio.
    //Lo utilizan Auto y Moto para mostrar su información.
    protected String formatoPrecio(){
        return String.format(java.util.Locale.of("es", "AR"),
        "$%,.2f", precio);
    }

    //Define el orden natural de los vehículos: primero por marca, después por modelo y finalmente por precio.
    @Override
    public int compareTo(Vehiculo otroVehiculo){
        int resultado = this.marca.compareTo(otroVehiculo.marca);
            if(resultado == 0){
                resultado = this.modelo.compareTo(otroVehiculo.modelo);
            }
            if(resultado == 0){
                resultado = Double.compare(this.precio, otroVehiculo.precio);
            }
        return resultado;
    }
}