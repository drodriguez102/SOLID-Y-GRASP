
package Segregacion_Interfaz;

import Segregacion_Interfaz.Vehiculo.Movimiento;

public class Carro implements Vehiculo, Movimiento {
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
        //Metodo
    }

    @Override
    public void parar() {
        //Metodo
    }
    
}
