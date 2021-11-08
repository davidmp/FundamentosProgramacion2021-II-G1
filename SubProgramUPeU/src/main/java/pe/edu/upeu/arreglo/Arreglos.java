package pe.edu.upeu.arreglo;

import pe.edu.upeu.modelo.Persona;

public class Arreglos{


public static void main(String[] arg) {
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


}