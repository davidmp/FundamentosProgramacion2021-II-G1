package pe.edu.upeu.arreglo;

import pe.edu.upeu.modelo.Persona;

public class Arreglos{

public static void ejemploVetores01() {
    int edades[];
    edades=new int[3];
    edades[0]=30;
    edades[1]=15;
    System.out.println("Arreglo enteros indice 0:"+edades[0]);
    System.out.println("Arreglo enteros indice 1:"+edades[1]);

    Persona personas[];
    personas=new Persona[4];
    personas[0]=new Persona("Juan", "Quispe", "54873221");
    personas[1]=new Persona("Karla", "Apaza", "45879865");
    System.out.println("Arreglo personas indice 0:Nombre:"+personas[0].nombre + 
    " Apellidos:"+personas[0].apellidos);
    System.out.println("Arreglo personas indice 1 Nombre:"+personas[1].nombre + 
    " Apellidos:"+personas[1].apellidos);    
}

public static void ejemploVectores02() {
  String[] nombres={"Sara","Laura", "Carlos", "Carmen"};
  System.out.println("Tamanho vector:"+nombres.length);
  System.out.println("Mostrar elemento 3:"+nombres[2]);
}

public static void ejemploMatrices01() {
  int edades[][];//int [][] edades;//definir matriz
  edades=new int[3][2];//definir tamnho
  edades[0][0]=30;
  edades[0][1]=15;
  edades[1][0]=20;
  edades[1][1]=45;
  edades[2][0]=5;
  edades[2][1]=38;
  System.out.println("Matriz(1,0): "+edades[1][0]);

  for (int i = 0; i < edades.length; i++) {
    for (int j = 0; j < edades[0].length; j++) {
        System.out.println("M["+i+"]["+j+"]: "+edades[i][j]);
    }
  }
}


public static void main(String[] arg) {
    //ejemploVetores01();
    //ejemploVectores02();
    ejemploMatrices01();
}


}