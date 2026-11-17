package org.ar.centro8.java.curso.concesionaria;

import java.util.ArrayList;//Importamos ArrayList para crear una lista de vehículos.
import java.util.Collections;//Importamos Collections para ordenar la lista.
import java.util.Comparator;//Importamos Comparator para establecer criterios de comparación.
import java.util.List;//Importamos List para trabajar con una colección de vehículos.
import java.util.Locale;//Importamos Locale para establecer el formato argentino de precios.

import org.ar.centro8.java.curso.iterfaz.Informacion;

public class Concesionaria implements Informacion{
    //Lista que almacena los vehículos.
    private List<Vehiculo> vehiculos;

    @Override
    public void cargarVehiculos() {
        //ArrayList permite almacenar objetos Auto y Moto mediante Vehiculo.
        vehiculos = new ArrayList<>();

        vehiculos.add(new Auto("Peugeot", "206", 200000, 4));
        vehiculos.add(new Moto("Honda", "Titan", 60000, 125));
        vehiculos.add(new Auto("Peugeot", "208", 250000, 5));
        vehiculos.add(new Moto("Yamaha", "YBR", 80500.50, 160));   
    }

    @Override
    public void mostrarVehiculos() { 
        //Stream recorre la lista y forEach imprime cada vehículo.
        //System.out::println utiliza toString() para mostrar su información.
        vehiculos.stream().forEach(System.out::println);
    }

    @Override
    public void mostrarVehiculoMasCaro() {
        //max() obtiene el vehículo con el precio más alto.
        //Comparator.comparing() establece el precio como criterio de comparación.
        Vehiculo vehiculoMasCaro = vehiculos.stream()
                .max(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get();
        
        System.out.println("Vehículo más caro: "
                + vehiculoMasCaro.getMarca() + " "
                + vehiculoMasCaro.getModelo());
    }

    @Override
    public void mostrarVehiculoMasBarato() {
        //min() obtiene el vehículo con el precio más bajo.
        Vehiculo vehiculoMasBarato = vehiculos.stream()
                .min(Comparator.comparingDouble(Vehiculo::getPrecio))
                .get();
        
        System.out.println("Vehículo más barato: "
                + vehiculoMasBarato.getMarca() + " "
                + vehiculoMasBarato.getModelo());
    }

    @Override
    public void mostrarVehiculosPorModelo(String letra){
        //filter() selecciona los vehículos cuyo modelo contiene la letra indicada.
        //toLowerCase() evita diferencias entre mayúsculas y minúsculas.
        //contains() comprueba si el modelo contiene el texto buscado.
        vehiculos.stream()
                .filter(v -> v.getModelo().toLowerCase().contains(letra.toLowerCase()))
                .forEach(v -> System.out.println(
                        "Vehículo que contiene en el modelo la letra '"
                        + letra.toUpperCase() + "': "
                        + v.getMarca() + " "
                        + v.getModelo() + " "
                        + String.format(Locale.of("es", "AR"),
                                "$%,.2f", v.getPrecio())
                ));
        
    }

    @Override
    public void mostrarVehiculosOrdenadosPorPrecio(){
        
        System.out.println("Vehículos ordenados por precio de mayor a menor:");
        //sorted() ordena los vehículos según el precio.
        //reversed() invierte el orden para mostrar primero el precio mayor.
        vehiculos.stream()
                .sorted(Comparator.comparing(Vehiculo::getPrecio).reversed())
                .forEach(v -> System.out.println(
                    v.getMarca() + " " + v.getModelo()
                ));
    }

    @Override
    public void mostrarVehiculosPorOrdenNatural() {
        //Collections.sort() ordena la lista mediante compareTo().
        //El orden se establece por marca, modelo y precio.
        Collections.sort(vehiculos);

        System.out.println("Vehículos ordenados por orden natural (marca, modelo, precio):");
        //forEach() imprime todos los vehículos utilizando toString().
        vehiculos.stream().forEach(System.out::println);       
    }
}