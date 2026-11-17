package org.ar.centro8.java.curso.tests;

import org.ar.centro8.java.curso.concesionaria.Concesionaria;
import org.ar.centro8.java.curso.iterfaz.Informacion;

public class TestConcesionaria {

    public static void main(String[] args) {
        
        Informacion informacion = new Concesionaria();

        System.out.println(" ");
        System.out.println(" ");

        informacion.cargarVehiculos();
        informacion.mostrarVehiculos();

        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");

        informacion.mostrarVehiculoMasCaro();
        informacion.mostrarVehiculoMasBarato();
        informacion.mostrarVehiculosPorModelo("y");

        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");

        informacion.mostrarVehiculosOrdenadosPorPrecio();

        System.out.println(" ");
        System.out.println("=============================");
        System.out.println(" ");

        informacion.mostrarVehiculosPorOrdenNatural();

        System.out.println(" ");
        System.out.println(" ");
    }
}