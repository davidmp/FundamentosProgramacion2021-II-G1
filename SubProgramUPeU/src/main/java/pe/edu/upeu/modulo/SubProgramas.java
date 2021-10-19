package pe.edu.upeu.modulo;

public class SubProgramas{

  public String nombre="David";
  public String dni=""; 

  public void saludo(){
    System.out.println("Hola "+nombre);
  }

  public void otroSaludo(String nombrex){
    this.nombre=nombrex;
    System.out.println("Hola "+nombre);
  }


}
