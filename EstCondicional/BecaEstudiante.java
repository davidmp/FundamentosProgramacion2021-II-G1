import java.util.Scanner;
public class BecaEstudiante {
 static Scanner sc = new Scanner(System.in);


static void becaPresEst(){
    //Declaracion de variables e inicializacion
    int edad=0;
    double promedio=0, montoBeca=0;
    //Datos de Entrada
    System.out.println("Ingrese su edad:");
    edad=sc.nextInt();
    System.out.println("Ingrese su promedio de nota:");
    promedio=sc.nextDouble();    
    //Proceso
    if(edad>18){
      if(promedio>=9){
        montoBeca=2000;
      }else if(promedio>=7.5 && promedio<9){
        montoBeca=1000;
      }else if(promedio>=6 && promedio<7.5){
        montoBeca=500;
      }else{
        montoBeca=0;
      }
    }else{
      if(promedio>=9){
        montoBeca=3000;
      }else if(promedio>=8 && promedio<9){
        montoBeca=2000;
      }else if(promedio<8 && promedio>=6){
        montoBeca=100;
      }else{
        montoBeca=0;
      }
    }
    //Datos Salida
    if(montoBeca==0){
      System.out.println("Esforzarse para el proximo ciclo...!");
    }else{
      System.out.println("Felicitaciones Ud. es acreedor de una Beca por el Monto de: $"+montoBeca);
    }

}

static void mostrarDiaLetras(){
  //Definir variables
  int dia=0;
  String nombredia="";
  //Datos de Entrada
  System.out.println("Ingrese un dia de la semana entre (1-7):");
  dia=sc.nextInt();
  //Proceso
  switch(dia) {
    case 1: nombredia="Domingo";break;
    case 2: nombredia="Lunes";break;
    case 3: nombredia="Martes";break;
    case 4: nombredia="Miercoles";break;
    case 5: nombredia="Jueves";break;
    case 6: nombredia="Viernes";break;
    case 7: nombredia="Sabado";break;
    default:
      nombredia="No existe";
  }
  //Datos de Salida
  System.out.println("El dia es: "+nombredia);
}

static void suma20mumerosPares(){
  //Declarar variables e inicializacion de valores
  int numInit=1, sumaNumPar=0;
  //Proceso
    while(numInit <= 20) {
      if(numInit%2==0){
        sumaNumPar=sumaNumPar+numInit;
      }
      numInit++;//numInit=numInit+1;
    }
  //Datos de Salida
    System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}

static void menuOpciones(){ 
  int opcionesA=0;
  System.out.println("-------------------------------");
  String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx,2=xxxx,3=numeros pares:";
  System.out.println(msg);
  opcionesA=sc.nextInt();  
  while(opcionesA!=0){
      switch(opcionesA) {
        case 1: becaPresEst();break;
        case 2: mostrarDiaLetras();break;
        case 3: suma20mumerosPares();break;
        case 4: personaMenor();break;
        default:
          System.out.println("El Algoritmo no existe!");
      }   
    System.out.println("------------------------------");  
    System.out.println(msg);
    opcionesA=sc.nextInt();        
  }
}

static void personaMenor(){
  //declarar variables 
  String nomA, nomB, nomC, nomM="";
  int edadA, edadB, edadC, edadM=0;
  //Datos de Entrada
  System.out.println("Ingrese nombre 1ra Persona:");
  nomA=sc.next();
  System.out.println("Ingrese edad 1ra Persona:");
  edadA=sc.nextInt();  
  System.out.println("Ingrese nombre 2da Persona:");
  nomB=sc.next();
  System.out.println("Ingrese edad 2da Persona:");
  edadB=sc.nextInt();  
  System.out.println("Ingrese nombre 3ra Persona:");
  nomC=sc.next();
  System.out.println("Ingrese edad 3ra Persona:");
  edadC=sc.nextInt();      
  //Proceso
  if(edadA<edadB && edadA<edadC){
    edadM=edadA;
    nomM=nomA;
  }
if(edadB<edadA && edadB<edadC){
    edadM=edadB;
    nomM=nomB;
  }
if(edadC<edadA && edadC<edadB){
    edadM=edadC;
    nomM=nomC;
  }    
  //Datos de salida
  System.out.println("La persona menor es: "+ nomM +" y su edad es:"+edadM);
}


public static void main(String[] args) {
  menuOpciones();
}

  



}