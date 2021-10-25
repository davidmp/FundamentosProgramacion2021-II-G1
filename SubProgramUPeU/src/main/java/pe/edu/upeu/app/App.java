package pe.edu.upeu.app;
import pe.edu.upeu.modulo.*;
import java.util.Scanner;

public class App{
    
   public static SubProgramas sp;
   public static Recursividad rc=new Recursividad();
   public static Scanner sc=new Scanner(System.in);

    static void menuOpciones(){ 
      sp=new SubProgramas();
      int opcionesA=0;
      System.out.println("-------------------------------");
      String msg="\nIngrese el Algoritmo que desea Probar"+ 
      "\n1=Sualudo"+
      "\n2=otro saludo"+
      "\n3=Factorial"+
      "\n4=Fibonacci"
      ;
      System.out.println(msg);
      opcionesA=sc.nextInt();  
      while(opcionesA!=0){
          switch(opcionesA) {
            case 1: sp.saludo(); break;
            case 2: sp.otroSaludo("Raul"); break;
            case 3: 
            System.out.println("Ingrese un numero:");
            long n=sc.nextLong();
            System.out.println(rc.factorial(n)); break;
            case 4:   
            System.out.println("Ingrese un numero:");         
            int nx=sc.nextInt();
            System.out.println(rc.fibonacci(nx)); break;
            default: System.out.println("El Algoritmo no existe!");
          }   
        System.out.println("------------------------------"); //15.511.210.043.330.985.984.000.000
        System.out.println(msg);
        opcionesA=sc.nextInt();        
      }
    }

    public static void main( String[] args ){
       System.out.println("*******Bienvenidos al Sistema**********");
       menuOpciones();
    }
}
