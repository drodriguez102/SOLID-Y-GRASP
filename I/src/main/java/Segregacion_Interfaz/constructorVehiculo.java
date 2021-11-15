
package Segregacion_Interfaz;

public class constructorVehiculo {

public static Carro constructorCarro(){

        Carro carro =new Carro();
        carro.setprecio(30.000);
        carro.setColor("Color Azul");
        carro.iniciar();
        carro.parar();
        return carro;
    }
public static Avion constructorAvion(){

        Avion avion =new Avion();
        avion.setprecio(70.000);
        avion.setColor("Color Blanco");
        avion.iniciar();
        return avion;
}
}
