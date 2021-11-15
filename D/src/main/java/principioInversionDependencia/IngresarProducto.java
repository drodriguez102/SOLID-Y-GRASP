package principioInversionDependencia;


public class IngresarProducto {
    PersistenciaDB run;

    public IngresarProducto() {

        run = new PersistenciaDB();
        run.ingresarPorductos();

    }

    

    public static void main(String[] args) {

        IngresarProducto correrPrograma = new IngresarProducto();

    }

}
