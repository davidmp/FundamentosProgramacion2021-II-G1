package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class ClienteDao extends AppCrud{
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    final String TABLA_CLIENTE="Cliente.txt";

    LeerArchivo leerArch;
    ClienteTO cTo;

    public void crearCliente(String dni) {
        util.clearConsole();
        leerArch=new LeerArchivo(TABLA_CLIENTE);
        cTo=new ClienteTO();
        cTo.setDni(dni);
        if(validarDni(cTo.getDni())){
            cTo.setNombre(leerTecla.leer("", "Ingrese su nombre"));
            cTo.setCelular(leerTecla.leer("", "Ingrese su Celular"));
            agregarContenido(leerArch, cTo);
        }
    }


    public boolean validarDni(String dni) {
        leerArch=new LeerArchivo(TABLA_CLIENTE);
        cTo=new ClienteTO();
        Object[][] data= buscarContenido(leerArch, 0, dni);
       if(data==null || data.length==0){
           return true;
       }{
           return false;      
       }            
    }
        
}
