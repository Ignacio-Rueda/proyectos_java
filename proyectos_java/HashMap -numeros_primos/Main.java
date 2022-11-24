/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaFinalUnidad;


import java.util.Scanner;

/**
 *Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
 * @author Ignacio
 */
public class Main {
    public static void main(String []args){

        
        //CREAMOS ENTRADA DE TEXTO:
        
       Scanner entradaEnteros = new Scanner (System.in);
        System.out.println("Hola! indique hasta qué número entero quiere  guardar en el fichero");//REALIZAR EXCEPCIÓN
        int entradaNumero = entradaEnteros.nextInt();
        System.out.println("De acuerdo, ahora obtendrá:\n Un fichero con todos los números enteros.\n Un fichero con todos los números primos.\n Un fichero con aquéllos que no lo son.");
        
          EleccionNumero numero = new EleccionNumero();
  
          numero.fillEnterosDocument(entradaNumero);
          numero.readDocument();
          numero.busquedaNumeroPrimo();
          numero.fillPrimosDocument();
          
          DatosPersonales bancoAndaluz = new DatosPersonales ();
          bancoAndaluz.introducirDatosPersonales();
          System.out.println("Por favor introduzca nombre cliente para conocer datos personales");
          Scanner introduceNombre = new Scanner (System.in);
          String cliente = introduceNombre.nextLine();
          bancoAndaluz.imprimirDatosPersonales(cliente);
          
          //Para siguiente proyecto añadir mas excepciones que contemplen la introducción de datos incorrectos
          //Por ejemplo int en lugar de char o String, no permitir los . par los decimales....
        

   }

         
      
     }
        
    
