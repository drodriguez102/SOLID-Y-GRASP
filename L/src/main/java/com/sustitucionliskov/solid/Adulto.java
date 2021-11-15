/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sustitucionliskov.solid;

import java.util.Scanner;

/**
 *
 * @author denisee
 */
public class Adulto {

    public String id = "", tarjeta = "", pagar = "";
    Scanner in;

    public Adulto(String id, String tarjeta, String pagar) {
        this.id = id;
        this.tarjeta = tarjeta;
        this.pagar = pagar;

    }
    
    public void ingresaDatos(){
        in = new Scanner(System.in);
        System.out.println("Estas en la interfaz Adulto");
        System.out.println("ingresa el id");
        id = in.nextLine();
        
        System.out.println("Ingresa targeta");
        id = in.nextLine();
        
        return;
        
 
    }
}
