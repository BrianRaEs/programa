/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrito;

/**
 *
 * @author Brian
 */
public class Carrito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Molde carrito1 = new Molde();
        //carrito1.color = "aqua blue";
        carrito1.setColor("Electric blue");
        carrito1.setMarca("Ferrari");
        carrito1.setModelo("Deportivo");
        carrito1.setTransmision("Automatica");
        carrito1.setPuertas(4);
        System.out.println("La marca disponible es " + carrito1.marca);
        System.out.println("El color es " + carrito1.color);        
        System.out.println("El modelo es " + carrito1.modelo);
        System.out.println("La transmision es " + carrito1.transmision);
        System.out.println("Las puertas son " + carrito1.puertas);
    }
    
}
