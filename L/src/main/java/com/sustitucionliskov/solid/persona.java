package com.sustitucionliskov.solid;

import java.util.Scanner;

public class persona {

    public String nombres = "", apellidos = "", id = "", tarjeta = "", pagar = "";
    public int edad = 0;
    Adulto mensajero;
    Niño menor;
    Scanner ingresar = new Scanner(System.in);

    

    public persona() {
        Llamar();

    }

    public void Llamar() {
        
        System.out.println("Ingresa la edad");
        edad = ingresar.nextInt();

        if (edad < 18) {

            menor = new Niño(id, edad);
            menor.ingresaDatos();

        } else {

            mensajero = new Adulto(id, tarjeta, pagar);
            mensajero.ingresaDatos();
        }

    }

    public static void main(String[] args) {

        persona run = new persona();

    }
}
