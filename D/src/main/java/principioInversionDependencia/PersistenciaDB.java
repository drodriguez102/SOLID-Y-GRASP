package principioInversionDependencia;

import java.util.Scanner;

public class PersistenciaDB {
    
    
    public String nombreProducto = "", codigoProduc = "";
    Scanner in;
    
   
    
    public void ingresarPorductos(){
      
        in = new Scanner(System.in);
        System.out.println("Ingrese un producto ");
        nombreProducto = in.nextLine();
        System.out.println("Ingrese el codigo del producto ");
        codigoProduc = in.nextLine();
        
    }

}
