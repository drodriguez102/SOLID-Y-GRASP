
package Segregacion_Interfaz;

public interface Vehiculo {
    void setprecio(double precio);
    void setColor (String color);
    
    public interface Movimiento{
    void iniciar();
    void parar();
}
    public interface Aereo{
        void volar();
    }
}

