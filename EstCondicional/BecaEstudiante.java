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





public static void main(String[] args) {
  //becaPresEst();
  mostrarDiaLetras();
}

  



}