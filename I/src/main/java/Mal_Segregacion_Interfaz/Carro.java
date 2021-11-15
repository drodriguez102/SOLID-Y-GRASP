
package Mal_Segregacion_Interfaz;

public class Carro implements Vehiculo {
    double precio;
    String color;

    @Override
    public void setprecio(double precio) {

        this.precio = precio;
    }

    @Override
    public void setcolor(String color) {

        this.color = color;
    }

    @Override
    public void iniciar() {
        //Metodo
    }

    @Override
    public void frenar() {
        //Metodo
    }

    @Override
    public void volar() {
        //Metodo
    }
    
}
