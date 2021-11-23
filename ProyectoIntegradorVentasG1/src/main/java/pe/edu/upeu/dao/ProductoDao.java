package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class ProductoDao extends AppCrud{
    
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    final String TABLA_PRODUCTO="Producto.txt";

    LeerArchivo leerArch;
    ProductoTO prodTO;

    String tipoProd="\nPeriodico\nRevista\n";

    public Object[][] crearProducto() {
        leerArch=new LeerArchivo(TABLA_PRODUCTO);    
        prodTO=new ProductoTO();
        prodTO.setIdProd(generarId(leerArch, 0, "P", 1));
        prodTO.setNombre(leerTecla.leer("", "Ingrese nombre del Producto"));
        prodTO.setPrecio(leerTecla.leer(0.0, "Ingrese precio base del Producto"));
        prodTO.setUnidadMed(leerTecla.leer("", "Ingrese unidad de medidad"));
        prodTO.setTipo(leerTecla.leer("", "Ingrese el tipo ("+tipoProd+")"));
        prodTO.setUtilidad(leerTecla.leer(0.0, "Ingrese la utilidad Ejem: 0.02"));
        prodTO.setStock(leerTecla.leer(0, "Ingrese el Stock"));
        leerArch=new LeerArchivo(TABLA_PRODUCTO);           
        return agregarContenido(leerArch, prodTO); 
    }

    



}