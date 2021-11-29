package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.utils.LeerArchivo;
import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class UsuarioDao extends AppCrud{
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    final String TABLA_USUARIO="Usuario.txt";

    LeerArchivo leerArch;
    UsuarioTO usuTO;


    public void crearUsuario() {
        util.clearConsole();
        leerArch=new LeerArchivo(TABLA_USUARIO);
        usuTO=new UsuarioTO();
        usuTO.setUsuario(leerTecla.leer("", "Ingrese su usuario"));  
        
        Console cons=System.console();
        char[] dataPass=cons.readPassword();
        usuTO.setPassword(dataPass.toString());      
        usuTO.setPerfil(leerTecla.leer("", "Ingrese el perfil (VENDEDOR/ADMINISTRADOR)"));
        agregarContenido(leerArch, usuTO);

    }


    public boolean name() {        
        util.clearConsole();
        System.out.println("*********Autentication System**********");
        leerArch=new LeerArchivo(TABLA_USUARIO);        

        return false;
    }




}
