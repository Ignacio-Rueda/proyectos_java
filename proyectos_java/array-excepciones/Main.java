/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_7al_9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
/**
 *
 * @author Ignacio
 *
 */
public class Main {
    public static void main(String [] args) throws FileNotFoundException{
        /**PRIMER EJERCICIO:
         * Dada la función:
            public static String reverse(String texto) { }
            Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
        */
        String texto="hola mundo";
        String resultado = reverse(texto);
        System.out.println(resultado);
        
        /*SEGUNDO EJERCICIO:
        Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
        */
        array();
        
        /*TERCER EJERCICIO:
        Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada elemento en ambas dimensiones.
        */
        arrayB();
        
          /*CUARTO  EJERCICIO:
         Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos. Elimina el 2o y 3er elemento y muestra el resultado final.
        */
        vector();
        
          /*QUINTO  EJERCICIO:
         Indica cuál es el problema de utilizar un Vector con la capacidad por defecto si tuviésemos 1000 elementos para ser añadidos al mismo.
        Que se produce una operación costosísima que es la copia, cuando lleno la capacidad de mi vector, por debajo se tiene que crear un array nuevo 
        y se tienen que copiar todos los elementos del anterior array mas el espacio necesario para los próximos elementos. Supone un consumo de memoria elevado.
        */
          
         /*SEXTO  EJERCICIO:
          
        Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList. Recorre ambos mostrando únicamente el valor de cada elemento.
        */
         arrayList_LinkedList();
         
         /*SEPTIMO  EJERCICIO:
          Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10. A continuación, con otro bucle, recórrelo y elimina los numeros pares. 
         Por último, vuelve a recorrerlo y muestra el ArrayList final. 
         Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
        */
         arrayListRemovePares();
         
           /*OCTAVO  EJERCICIO:
         Crea una función DividePorCero. Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada por su llamante 
         (desde "main", por ejemplo).
         Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse". Finalmente, mostraremos en cualquier caso: "Demo de código".
        */
          try{
            DividePorCero(4,0);
           }
          catch (Exception e){
              System.out.println("Esto no puede hacerse");
          }
           finally{
            System.out.println("Demo de código");}
          
         /*NOVENO  EJERCICIO:
          Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut". 
          La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
        */
         try{
             InputStream in = new FileInputStream( "C:\\Users\\Ignacio\\Desktop\\EJERCICIOS JAVA\\openBootcamp\\copia.txt");
             byte[]fileIn =in.readAllBytes();
            PrintStream fileOut = new PrintStream ("destino.txt");
            
            copiaFichero(fileIn,fileOut);
         }
         catch (Exception e){
             System.out.println("Lo siento, algo ha salido mal");
         }
         PrintStream info = new PrintStream("copia.txt");
         info.print("hola");
        
         
    
    }
    
    
    
     public static String reverse(String texto) { 
           String textoReverse="";
        for(int i=texto.length()-1;i>=0;i--){
            textoReverse+=texto.charAt(i);
                }
        return textoReverse;
     }
     
     public static void array (){
        String [] arrayString = new String [3];
       arrayString [0]=("Nombre");
       arrayString [1]=("Apellidos");
       arrayString [2]=("DNI");
       
       for (String dato : arrayString){
           System.out.println(dato);
       }
     }
     public static void arrayB(){
            int [][]arrayB=  {{1,2},{3,4}};
           for (int i=0;i<2;i++){
           for(int j=0;j<2;j++){
                System.out.println("Posición i = "+ i + " Posición j = " + j+" Valor =  " + arrayB[i][j]);
            }
        }
      
     }
     
     public static void vector(){
         Vector<Integer> miVector = new Vector(5,5);
        for(int i=0;i<5;i++){
            miVector.add(i);
        }
  
        System.out.println(miVector);
        
        miVector.remove(1);
        miVector.remove(1);//Una vez que eliminamos el segundo elemento, la posición del tercer elemento inical varía.
        System.out.println (miVector);
     }
     
     public static void arrayList_LinkedList(){
                
         ArrayList<String> arrayString = new ArrayList<String>(4);
         LinkedList<String>linkedString = new LinkedList<String>();
         arrayString.add("curso");
         arrayString.add("año");
         arrayString.add("profesor");
         arrayString.add("asignatura");
         for(int i=0;i<arrayString.size();i++){
             linkedString.add(arrayString.get(i));
         }
         System.out.println("MOSTRAMOS LINKEDLIST");
         for (int i=0; i<linkedString.size();i++){
             System.out.println(linkedString.get(i));
         }
         System.out.println("MOSTRAMOS ARRAYLIST");
          for (int i=0; i<arrayString.size();i++){
             System.out.println(arrayString.get(i));
         }
     
     }
     
     public static void arrayListRemovePares(){
          ArrayList<Integer> arrayListEnteros = new ArrayList <Integer>();
         
         for(int i=1;i<11;i++){
             arrayListEnteros.add(i);
         }
         System.out.println("MUESTRO TODOS LOS ELEMENTOS");
         for(int i=0;i<arrayListEnteros.size();i++){
             System.out.println(arrayListEnteros.get(i));
         }
         System.out.println("MUESTRO TODOS LOS ELEMENTOS IMPARES");
         for(int i=0;i<arrayListEnteros.size();i++){
             if(arrayListEnteros.get(i)%2==0){
                 arrayListEnteros.remove(i);
                 System.out.println(arrayListEnteros.get(i-1));
             } 
         }
     
     }
    public static int DividePorCero (int A, int B) throws ArithmeticException{
        int resultado=0;
        try{
            resultado=A/B;
        }
        catch (ArithmeticException e){
            throw new ArithmeticException();
        }

        return resultado;

   }

    public static void copiaFichero(byte [] fileIn,PrintStream fileOut){
       
      try{fileOut.write(fileIn);
          System.out.println("Copia realizada");
      }
      catch(Exception e){
          System.out.println("sigue saliendo algo mal");
      }
       
    }
     
     
}
