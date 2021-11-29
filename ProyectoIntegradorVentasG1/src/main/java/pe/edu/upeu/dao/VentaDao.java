package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class VentaDao extends AppCrud{
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();

    final String TABLA_VENTAS="Ventas.txt";
    final String TABLA_VENTA_DETALLE="VentaDetalle.txt";
    final String TABLA_PRODUCTO="Producto.txt";
    final String TABLA_CLIENTE="Cliente.txt";

    LeerArchivo leerArch;

    ProductoTO prodTO;
    VentaTO venTO;
    VentaDetalleTO ventaDetalleTO;
    ClienteTO clienteTO;

    SimpleDateFormat formatofechahora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");


    public void registrarVenta() {
       
    }

    public VentaTO crearVenta() {
        leerArch=new LeerArchivo(TABLA_VENTAS);
        venTO=new VentaTO();
        venTO.setIdVenta(generarId(leerArch, 0, "V", 1));
        venTO.setDni(crearCliente(leerTecla.leer("", "Ingrese el Dni del Cliente")));

        return null;    
    }

    public String crearCliente(String dni) {
        leerArch=new LeerArchivo(TABLA_CLIENTE);
        Object[][] dataCli=buscarContenido(leerArch, 0, dni);
        if(dni!=null && dataCli.length==1){
            return dni;
        }else{
            ClienteDao cDao=new ClienteDao();
            cDao.crearCliente(dni);
            return dni;
        }        
    }

    public VentaDetalleTO carritoVenta() {
        leerArch=new LeerArchivo(TABLA_VENTA_DETALLE);
        return null;
    }

    public void mostrarProductos() {
        leerArch=new LeerArchivo(TABLA_PRODUCTO);
    }


        
}
