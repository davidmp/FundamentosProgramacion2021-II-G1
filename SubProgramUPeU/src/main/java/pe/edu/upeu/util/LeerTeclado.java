package pe.edu.upeu.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeerTeclado{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


public int leer(int val, String msg){
  System.out.print(msg+":");
  try{
    val=Integer.parseInt(br.readLine());
  }catch(Exception e){
    val=leer(val,msg);
  }
  System.out.println();
  return val;
}


public double leer(double val, String msg){
  return 0.0;
}
public long leer(long val, String msg){
  return 0;
}
public String leer(String val, String msg){
  return "";
}
public char leer(char val, String msg){
  return 'x';
}



}