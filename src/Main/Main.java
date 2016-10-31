/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import clases.*;

/**
 *
 * @author USRBET
 */
public class Main {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(2015,4,"blue","CTL7983");
        //vehiculo1.setColor("verde");
        Vehiculo vehiculo2 = new Vehiculo(2015,4,"green","PST8965");
        Vehiculo vehiculo3 = new Vehiculo(2015,4,"black","TLM8964");
        Vehiculo vehiculo4 = new Vehiculo(2015,4,"grey","PRS9632");
        Vehiculo vehiculo5 = new Vehiculo(2015,4,"red","PMU5362");
        
        System.out.println("Placa del vehiculo 1 es: "+vehiculo1.getPlaca());
        System.out.println("Placa del vehiculo 2 es: "+vehiculo2.getPlaca());
        System.out.println("Placa del vehiculo 3 es: "+vehiculo3.getPlaca());
        System.out.println("Placa del vehiculo 4 es: "+vehiculo4.getPlaca());
        System.out.println("Placa del vehiculo 5 es: "+vehiculo5.getPlaca());
        
    }
    
}
