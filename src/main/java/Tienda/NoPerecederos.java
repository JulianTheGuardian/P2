/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 */
public class NoPerecederos extends Productos{
    private String tipo;

    public NoPerecederos(String tipo, String nombre, double precio) {
        super(nombre, precio);
        this.tipo = tipo;
    }
    
    public NoPerecederos() {
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+ "tipo=" + tipo + '}';
    }
    
    @Override
    public double Calcular(int cantidad){
        return super.Calcular(cantidad);
    }
}
