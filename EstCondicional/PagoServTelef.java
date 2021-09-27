
import java.util.Scanner;

public class PagoServTelef {
  static Scanner sc = new Scanner(System.in);

  static void practica(){
    System.out.println("Ingrese su nombre:");
    String nombre=sc.next();
    System.out.println("Ingrese su edad:");
    int edad=sc.nextInt();
    System.out.println("Nombre ingresado es:"+nombre+" y la edad es:"+edad);
  }

  public static void main(String[] args) {
  practica();
  }
}