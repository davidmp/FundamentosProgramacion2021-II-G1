package pe.edu.upeu.transformadas;

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
        System.out.println("Holas");
        TransformadasEjem te=new TransformadasEjem();
        te.transformada05(5, 0);
    }
    
}
