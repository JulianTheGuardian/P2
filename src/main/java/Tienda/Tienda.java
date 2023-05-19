/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Tienda;

/**
 *
 * @author sebas
 */
public class Tienda {

    private static Productos[] myProductos = new Productos[5];
    
    public static void main(String[] args) {
        myProductos[0] = new Perecederos("Banano",4500,3);
        myProductos[1] = new Perecederos("Leche",5000,2);
        myProductos[2] = new Perecederos("Cebolla",2500,1);
        myProductos[3] = new Productos("Arroz",3500);
        myProductos[4] = new NoPerecederos("Avena","Quaker",4500);
        
        System.out.println("5 Unidades de cada producto: ");
        System.out.println(myProductos[0].getNombre()+": "+myProductos[0].Calcular(5));
        System.out.println(myProductos[1].getNombre()+": "+myProductos[1].Calcular(5));
        System.out.println(myProductos[2].getNombre()+": "+myProductos[2].Calcular(5));
        System.out.println(myProductos[3].getNombre()+": "+myProductos[3].Calcular(5));
        System.out.println(myProductos[4].getNombre()+": "+myProductos[4].Calcular(5));
    }
}
