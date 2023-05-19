/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tienda;

/**
 *
 */
public class Perecederos extends Productos{
    private int diasACadudar;

    public Perecederos(String nombre, double precio, int diasACaducar) {
        super(nombre, precio);
        this.diasACadudar = diasACaducar;
    }

    public Perecederos() {
    }

    public int getDiasACadudar() {
        return diasACadudar;
    }

    public void setDiasACadudar(int diasACadudar) {
        this.diasACadudar = diasACadudar;
    }

    @Override
    public String toString() {
        return super.toString()+"diasACadudar=" + diasACadudar + '}';
    }
    
    @Override
    public double Calcular(int cantidad){
        double resultado = super.Calcular(cantidad);
        if(this.diasACadudar==1){
            resultado = resultado/4;
        }else if(this.diasACadudar==2){
            resultado = resultado/3;
        }else if(this.diasACadudar==3){
            resultado = resultado/2;
        }
        return resultado;
    }
    
}
