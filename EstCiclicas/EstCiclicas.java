import java.util.Scanner;

class EstCiclicas{
  static Scanner sc = new Scanner(System.in);

static void suma20mumerosParesWhile(){
  //Declarar variables e inicializacion de valores
  int numInit=1, sumaNumPar=0;
  //Proceso
    while(numInit <= 20) {
      if(numInit%2==0){
        sumaNumPar=sumaNumPar+numInit;
      }
      numInit++;//numInit=numInit+1;
      //numInit=numInit+5;
    }
  //Datos de Salida
    System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}

static void suma20numerosParesDowhile(){
  //Declaracion de variables e inicializacion de variables
  int sumaNumPar=0, numInit=1;
  //Proceso
  do{
    if(numInit%2==0){
      sumaNumPar=sumaNumPar+numInit;
    }
    numInit++;
  }while(numInit<=20);
  //Datos de salida
  System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}

static void suma20mumerosParesFor(){
  //Declarar variables e inicializacion de valores
  int sumaNumPar=0;
  //Proceso
    for(int numInit=1; numInit <= 20; numInit++) {

      if(numInit%2==0){
        sumaNumPar=sumaNumPar+numInit;
      }
      System.out.println("numInit:"+numInit+ " sumaNumPar:"+sumaNumPar);      
    }
  //Datos de Salida
    System.out.println("La suma de numeros pares entre 1 y 20 es:"+sumaNumPar);
}


  static void asignaturasCursadas(){
    //definir variables e inicializacion de valores
    int asigCod, calf, cred, cantAsigCur=0, cont=0;
    double promPond=0, sumCred=0, temp=0;
    //Datos de entrada proceso
    System.out.println("Ingrese el codigo la asignatura:");
    asigCod=sc.nextInt();
    while(asigCod!=9999){
      System.out.println("Ingrese la calificacion del curso "+asigCod+":");
      calf=sc.nextInt();
      System.out.println("Ingrese el numero de creditos del curso "+asigCod+":");
      cred=sc.nextInt();
      temp=temp+(calf*cred);
      sumCred=sumCred+cred;
      cont++;
      System.out.println("Ingrese el codigo la siguiente asignatura:");
      asigCod=sc.nextInt();
        if(asigCod==9999){
          if(sumCred>=25 && sumCred<=50){
            promPond=Math.round((temp/sumCred)*100.0)/100.0;
          }else{
            System.out.println("La cantidad de creditos no estan entre los rangos permitidos..intente nuevamente");
            System.out.println("Ingrese el codigo la asignatura:");
            asigCod=sc.nextInt();
            temp=0;
            sumCred=0;
            cont=0;
          }
        }
    }
    //dados de salida
    System.out.println("Cantidad de Asignaturas cursadas es:"+cont);
    System.out.println("Suma de creditos cursados:"+sumCred);
    System.out.println("Promedio Ponderado:"+promPond);
  }



  static void menuOpciones(){ 
    int opcionesA=0;
    System.out.println("-------------------------------");
    String msg="\nIngrese el Algoritmo que desea Probar 1=xxxx,2=xxxx,3=numeros pares\n4=Cantdad Cursos y detalle";
    System.out.println(msg);
    opcionesA=sc.nextInt();  
    while(opcionesA!=0){
        switch(opcionesA) {
          case 1: suma20mumerosParesWhile();break;
          case 2: suma20mumerosParesFor();break;
          case 3: suma20numerosParesDowhile(); break;
          case 4: asignaturasCursadas(); break;
          default:
            System.out.println("El Algoritmo no existe!");
        }   
      System.out.println("------------------------------");  
      System.out.println(msg);
      opcionesA=sc.nextInt();        
    }
  }

  public static void main(String[] args) {
    System.out.println("Holas Est. Repetitivas");
    menuOpciones();
  }
  
}