package principioInversionDependencia;


public class BaseDatos extends PersistenciaDB{
    
    public String nombreProducto = "", codigoProduc = "";
   
    
    public BaseDatos(String nombreProducto, String codigoProduc){
     
        this.nombreProducto = nombreProducto;
        this.codigoProduc = codigoProduc;
        
    }
    
    

}
