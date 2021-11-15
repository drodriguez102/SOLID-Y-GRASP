/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sustitucionliskov.solid;

import static java.lang.System.in;
import java.util.Scanner;

/**
 *
 * @author denisee
 */
public class Niño {
    
        public String id = "";
        public int edad = 0;
    Scanner in;

    public Niño(String id, int edad) {
        this.id = id;
        this.edad = edad;

    }
    
    public void ingresaDatos(){
        System.out.println("Estas en la interfaz niño");
        in = new Scanner(System.in);
        System.out.println("ingresa el id");
        id = in.nextLine();
        
        System.out.println("Ingresa edad");
        id = in.nextLine();
        
        return;
        
 
    }
}

