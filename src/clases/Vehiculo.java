/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author USRBET
 */
public class Vehiculo {
    
    //ATRIBUTOS
    
    private int modelo, numero_puertas;
    private String color, placa;
    //private String placa;
    //private int numero_puertas;

    
    //CONSTRUCTOR
    
    /**
     *
     * @param modelo
     * @param numero_puertas
     * @param color
     * @param placa
     */
        
    public Vehiculo(int modelo, int numero_puertas, String color, String placa){
        this.modelo = modelo;
        this.numero_puertas = numero_puertas;
        this.color = color;
        this.placa = placa;
    }
    
    
    //METODOS
    
    public int getModelo() {
        return modelo;
    }
    
    public void setModelo(int modelo) {
        this.modelo=modelo;
    }

    public int getNumero_puertas() {
        return numero_puertas;
    }
    
    public void setNumero_puertas() {
        this.numero_puertas = numero_puertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    
}
