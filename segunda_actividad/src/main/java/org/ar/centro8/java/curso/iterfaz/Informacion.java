package org.ar.centro8.java.curso.iterfaz;

public interface Informacion {
    //Define los métodos que deberán implementar la clase Concesionaria.
    void cargarVehiculos();
    void mostrarVehiculos();
    void mostrarVehiculoMasCaro();
    void mostrarVehiculoMasBarato();
    void mostrarVehiculosPorModelo(String letra);
    void mostrarVehiculosOrdenadosPorPrecio();
    void mostrarVehiculosPorOrdenNatural();
}