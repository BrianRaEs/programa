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
public class Molde {
    public String marca;
    public String color;
    public String modelo;
    public String transmision;
    public int puertas;
    
    //constructor
    public Molde(){
        marca = "Unknown";
        color = "Not available";
        modelo = "Not available";
        transmision = "Not available";
        puertas = 0;
    }
    
    public void setColor(String valor){
        color = valor;
    }
    public void setMarca(String valor){
        marca = valor;
    }
    public void setModelo(String valor){
        modelo = valor;
    }
    public void setTransmision(String valor){
        transmision = valor;
    }
    public void setPuertas(int valor){
        puertas = valor;
    }
        
}
