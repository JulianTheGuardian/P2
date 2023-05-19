/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 */
public class Productos {
    private String nombre;
    private double precio;

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public Productos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    public double Calcular(int cantidad){
        double resultado=precio*cantidad;
        return resultado;
    }
}
