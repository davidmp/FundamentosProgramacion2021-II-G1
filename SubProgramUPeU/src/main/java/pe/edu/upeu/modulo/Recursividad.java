package pe.edu.upeu.modulo;
import java.math.BigInteger;

public class Recursividad{
  

  public long factorial(int numero){
    if(numero>1){
      return factorial(numero-1)*numero;
    }
    return 1;
  }

  public BigInteger factorial(long numero){
    if(numero>1){
      return factorial(numero-1).multiply(new BigInteger(String.valueOf(numero)));
    }
    return new BigInteger(String.valueOf(1));
  }

  public long fibonacci(int n){
    if(n>=2){
      return fibonacci(n-1)+fibonacci(n-2);
    }else{
      return n;
    }
  }

  

}