/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author rueda
 */
public class oMath {

    private int[][] resultadoMatriz = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private int[][] matrizA;
    private int[][] matrizB;
    private boolean valido = true;

    public oMath() {
    }

    public oMath(int[][] matrizA, int[][] matrizB) {
        this.matrizA = matrizA;
        this.matrizB = matrizB;
    }
    
//MÉTODO PARA DETECTAR VALORES INFERIORES A 0

    public void valorCorrecto() throws Exception {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                if (matrizA[i][j] < 0 || matrizB[i][j] < 0) {
                    valido = false;
                    throw new Exception("Los valores introducidos no pueden ser inferiores a 0");
                }
            }
        }
    }

//MÉTODO PARA SUMAR MATRICES
    
    public int[][] sumaMatriz() {
        try{
         valorCorrecto();
        resultadoMatriz = new int[matrizA.length][matrizB.length];
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB.length; j++) {
                resultadoMatriz[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        }catch (Exception e){
            System.out.println(e);
        }
        return resultadoMatriz;
    }

//  MÉTODO PARA MULTIPLICAR 2 MATRICES  
    public void multMatriz() {
        try {

            int valor = 0;
            for (int i = 0; i < matrizA.length; i++) {
                for (int j = 0; j < matrizB.length; j++) {
                    for (int k = 0; k < matrizB.length; k++) {
                        valor += matrizA[i][k] * matrizB[k][j];
                        if (k == 2) {
                            resultadoMatriz[i][j] = valor;
                            valor = 0;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //METODO PARA CONOCER VALORES MATRIZ   
    public int[][] getValorMatriz() {
        return resultadoMatriz;
    }
    
    //MÉTODO QUE DEVUELVE  SI UN NÚMERO ES PRIMO
    
    public void getNumeroPrimo(int numero){
        boolean noEsPrimo=false;
        
        for(int i=3;i<numero&&noEsPrimo==false;i++){
            for(int j=2;j<i-1;j++){
                if(i%j==0){
                    noEsPrimo=true;
                }
            }
            if(noEsPrimo==false){
                System.out.println(i);
                int palindromoPosible =i;
                System.out.println("palindromo");
                System.out.println(i%10);
            }
            noEsPrimo=false;
        }
        
        
        
    }
    
    
    

}
