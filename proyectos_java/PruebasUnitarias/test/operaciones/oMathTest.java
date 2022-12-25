/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package operaciones;

import junit.framework.TestCase;
import org.junit.Assert;

/**
 *
 * @author rueda
 */
public class oMathTest extends TestCase {

    /*En este test, comprobaremos que introduciendo un array bidimensinal con números positivos podrá efectuarse cualquier operación registrada
 *Si el método es correcto, no debe saltar ninguna excepción
     */
    public void testnumerosPositivosValidos() throws Exception {
        try {
            int[][] matrizA = {{2, 0, 1}, {3, 0, 0}, {5, 1, 1}};
            int[][] matrizB = {{1, 0, 1}, {1, 2, 1}, {1, 1, 0}};
            int[][] matrizR = {{3, 0, 2}, {4, 2, 1}, {6, 2, 1}};
            oMath test = new oMath(matrizA, matrizB);
            test.sumaMatriz();
            Assert.assertArrayEquals(test.getValorMatriz(), matrizR);
        } catch (Exception e) {
            fail("Ha ocurrido un error inesperado" + e);
        }
    }

    /*En este test, comprobaremos que introduciendo un array bidimensinal con números NEGATIVOS no podrá efectuarse ninguna operación registrada
    *Si el método es correcto, DEBE saltar una excepción
   * @throws java.lang.Exception
     */
    public void testnumerosPositivosNoValidos() throws Exception {
        int[][] matrizA = {{2, 0, 1}, {3, 0, 0}, {5, -1, 1}};
        int[][] matrizB = {{1, 0, 1}, {1, 2, 1}, {1, 1, 0}};
        int[][] matrizR = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        
         oMath test2 = new oMath(matrizA, matrizB);
        
        try{
            test2.valorCorrecto();
            fail("Insertamos valores negativos para provocar una excepción");

        } catch (Exception e) {
            System.out.println(e);
            Assert.assertArrayEquals(test2.getValorMatriz(),matrizR);
        }
    }

}
