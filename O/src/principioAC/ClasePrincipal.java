package principioAC;

import java.util.Scanner;

public class ClasePrincipal {
    
    public int a = 0, b = 0, resultado = 0;
    Scanner in;
    
    public ClasePrincipal(){
        sumar();
        imparPar();
        
    }
    
    public void sumar(){
    
        System.out.print("Ingrese un valor para a ");
        a = in.nextInt();
        System.out.print("Ingrese un valor para b ");
        b = in.nextInt();
        resultado = a + b;
        
        System.out.println("El resultado de la suma es: " + resultado);
        
    }
    
    public void imparPar(){
        sumar();
        
        if (resultado % 2 == 0){
            
            System.out.println("El numero es par ");
        
        }else{
        
            System.out.println("El numero es impar");
        }
    }
}
