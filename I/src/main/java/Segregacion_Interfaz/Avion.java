
package Segregacion_Interfaz;

import Segregacion_Interfaz.Vehiculo.Aereo;
import Segregacion_Interfaz.Vehiculo.Movimiento;

public class Avion implements Vehiculo, Movimiento, Aereo{

    double precio;
    String color;

    @Override
    public void setprecio(double precio) {

        this.precio = precio;
    }

    @Override
    public void setColor(String color) {

        this.color = color;
    }

    @Override
    public void iniciar() {

        System.out.print("Hola");
    }

    @Override
    public void parar() {
        //Metodo
    }

    @Override
    public void volar() {
        //Metodo
    }
    
}
