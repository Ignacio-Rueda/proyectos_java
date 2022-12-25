/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operaciones;

/**
 *
 * @author rueda
 */
public class main {

    public static void main(String args[]) {

        System.out.println("MOSTRAR SUMA DE DOS MATRICES BIDIMENSIONALES CON NUMEROS POSITIVOS: ");
        try {
            int[][] matrizA = {{2, 0, 1}, {3, 0, 0}, {5, 1, 1}};
            int[][] matrizB = {{1, 0, 1}, {1, 2, 1}, {1, 1, 0}};
            oMath operacion1 = new oMath(matrizA, matrizB);
            operacion1.valorCorrecto();//CONSULTAMOS SI LOS VALORES DE LA MATRIZ SON VÁLIDOS 
            operacion1.sumaMatriz();
            int[][] resultadoMatriz = operacion1.getValorMatriz();

            System.out.println("El resultado de su operación es:");
            for (int i = 0; i < resultadoMatriz.length; i++) {
                for (int j = 0; j < resultadoMatriz.length; j++) {
                    System.out.print(resultadoMatriz[i][j]);
                    if (j == 2) {
                        System.out.println("");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Ha ocurrido un fallo inesperado" + e);
        }

        //MULTIPLICACIÓN MATRICES BIDIMIENSIONALES
        try {
            System.out.println("MULTIPLICACIÓN MATRICES");
            int[][] matrizA = {{2, 0, 1}, {3, 0, 0}, {5, 1, 1}};
            int[][] matrizB = {{1, 0, 1}, {1, 2, 1}, {1, 1, 0}};
            oMath operacion2 = new oMath(matrizA, matrizB);
            operacion2.valorCorrecto();//CONSULTAMOS SI LOS VALORES DE LA MATRIZ SON VÁLIDOS 
            operacion2.multMatriz();
            int[][] resultadoMatriz = operacion2.getValorMatriz();

            System.out.println("El resultado de su operación es:");
            for (int i = 0; i < matrizA.length; i++) {
                for (int l = 0; l < matrizA.length; l++) {
                    System.out.print(resultadoMatriz[i][l]);
                    if (l == 2) {
                        System.out.println(" ");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        //A PARTIR DE AQUÍ HABRÍA QUE IMPLEMENTAR ALGÚN MÉTODO PARA NÚMEROS PRIMOS
        System.out.println("NÚMEROS PRIMOS");
        oMath operacionP = new oMath();
        operacionP.getNumeroPrimo(20);

        
        
        
        
    }
}
