package pe.edu.upeu.transformadas;

import pe.edu.upeu.utils.LeerTeclado;
import pe.edu.upeu.utils.UtilsX;

public class TransformadasEjem {


    public void transformada05(int dimen, int num) {
        Object[][] matrizT=new Object[dimen][dimen];  

        for (int f = 0; f < matrizT.length; f++) {
            for (int c =0; c<=f ; c++) {
                matrizT[f][(matrizT[0].length-1)-c]=num;
                num++;
            }
        }
        imprimirMatriz(matrizT);        
    }

    public void transformada13(int dimen, int num) {//0
        Object[][] matrizT=new Object[dimen][dimen];  

        for (int c = 0; c < matrizT[0].length; c++) {
            for (int f =0; f < matrizT.length-c ; f++) {
                matrizT[f][c]=num;
                num++;
            }
        }

        imprimirMatriz(matrizT);        
    }


    /*public void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println();
        }
    }*/

    public void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
               if(matriz[i][j]!=null){
                System.out.print(matriz[i][j]+"\t");
               }else{
                System.out.print("\t");
               }                               
            }
            System.out.println();
        }
    }    


    public static void main(String[] args) {
        System.out.println("Ejercicio 5");
        TransformadasEjem te=new TransformadasEjem();
        LeerTeclado lt=new LeerTeclado();

        te.transformada05(lt.leer(0, "Ingrese la Dimension"), 0);
        
        System.out.println("Ejercico 13");
        te.transformada13(lt.leer(0, "Ingrese la Dimension"), 0);
    }
    
}
