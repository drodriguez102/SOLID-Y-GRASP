package principioRU;
/*Esta clase se cra para ingresar los datos del usuario*/

//Se importa la libreria Scanner para el ingreso de datos por consola
import java.util.Scanner;

public class EntradaDatos {
    //Instancia de la clase Sumar para enviar los datos y traer el metodo sumar de la clase Sumar
    Sumar sumarDatos;
    Restar restarDatos;
    Scanner in;
     public int a = 0, b = 0;
     

    
    public void entradaDatos(){
        
        in = new Scanner(System.in);
    
        System.out.print("Ingrese un valor para a: ");
        a = in.nextInt();
        System.out.print("Ingrese un valor para b: ");
        b = in.nextInt();
        
        sumarDatos = new Sumar(a, b);
        sumarDatos.operacionSumar();
        restarDatos = new Restar(a, b);
        restarDatos.operacionRestar();
        
        
    }

}
