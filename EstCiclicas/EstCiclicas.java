import java.util.Scanner;

class EstCiclicas{
  static Scanner sc = new Scanner(System.in);

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

  public static void main(String[] args) {
    System.out.println("Holas Est. Repetitivas");
  }
  
}