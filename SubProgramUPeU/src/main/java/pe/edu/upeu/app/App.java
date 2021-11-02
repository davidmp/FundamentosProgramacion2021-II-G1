package pe.edu.upeu.app;
import pe.edu.upeu.modulo.*;
import pe.edu.upeu.util.*;

public class App{
    
   public static SubProgramas sp;
   public static Recursividad rc=new Recursividad();   
   static LeerTeclado lt=new LeerTeclado();

    static void menuOpciones(){ 
      sp=new SubProgramas();
      int opcionesA=0;
      System.out.println("-------------------------------");
      String msg="\nIngrese el Algoritmo que desea Probar"+ 
      "\n1=Sualudo"+
      "\n2=otro saludo"+
      "\n3=Factorial"+
      "\n4=Fibonacci"+
      "\n5=Fibonacci No Recursivo"    
      ;
   
      opcionesA=lt.leer(0, msg);  
      while(opcionesA!=0){
          switch(opcionesA) {
            case 1: sp.saludo(); break;
            case 2: sp.otroSaludo("Raul"); break;
            case 3:             
            long n=lt.leer((long)0, "Ingrese un numero");
            System.out.println(rc.factorial(n)); break;
            case 4:                    
            int nx=lt.leer(0,"Ingrese un numero");
            System.out.println(rc.fibonacci(nx)); break;
            case 5: 
            int nxx=lt.leer(0,"Ingrese un numero");
            System.out.println(rc.fibonacciNRecurBig(nxx)); break;
            default: System.out.println("El Algoritmo no existe!");
          }   
        System.out.println("------------------------------"); //15.511.210.043.330.985.984.000.000        
        opcionesA=lt.leer(0,msg);        
      }
    }

    public static void main( String[] args ){
       System.out.println("*******Bienvenidos al Sistema**********");      
      int edad=lt.leer(0,"Ingrese su edad");

      System.out.println(edad);
      
       menuOpciones();
    }
}
