/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaFinalUnidad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

/**
 *
 * @author Ignacio
 */
public class EleccionNumero {
    private final ArrayList<Integer>arrayEnteros;
    private final ArrayList<Integer>arrayPrimosElegidos;
    private final ArrayList<Integer>arrayNoPrimosElegidos;
    //Método constructor

    public EleccionNumero() {
        this.arrayEnteros = new ArrayList<>();
        this.arrayNoPrimosElegidos = new ArrayList<>();
        this.arrayPrimosElegidos = new ArrayList<>();
    }
    
    public void EleccionNumero(){
    }
    
    //Métodos para EleccionNumero:
    /*--------------------------------------------------------------------------------------------------*/
    
    //Método para escribir los números elegidos por el usuario
    public void fillEnterosDocument(int numeroS){
        try{
            
            PrintStream info = new PrintStream ("enteros.txt");
            for(int n=0;n<numeroS;n++){
                info.println(n);
            }    
        }
        catch(FileNotFoundException e){
        System.out.print("No se ha podido rellenar el documento enteros.txt");
    }
   
   }
    
    //Método para leer los números registrados en el fichero
    
    public ArrayList<Integer> readDocument (){
         try{
        InputStream entrada = new FileInputStream ("C:\\Users\\Ignacio\\Desktop\\EJERCICIOS JAVA\\openBootcamp\\enteros.txt");
        int dato = entrada.read();
        int composicionNumero=0;
        int num0=48;//Valot tabla Ascii =48=0
        int num9=57;//Valor tabla Ascii=57=9
        int saltoLinea=10;//Valor tabla Ascii Nueva linea 
        int contador=0;//Para saber cuántas unidas componen nuestro número
        int retornoCarro=13;//Valor tabla Ascii = retorno carro
        int saltoLNumMay9=-38;//Salto linea entre números mayores a 9
        while (dato!=-1){
           if (dato !=retornoCarro){
            while(dato >= num0&& dato<=num9||dato==saltoLinea){
                    dato=dato-num0;
                    contador++;
                    
                    if(dato==saltoLNumMay9){
                        contador=0;
                        this.arrayEnteros.add(composicionNumero);
                    }
                    if(dato != saltoLNumMay9 && contador>=1){
                        if(contador==1){
                            composicionNumero=dato;
                        }
                        if(contador > 1){  
                            int decenas =10;
                            
                            composicionNumero *= decenas;
                            composicionNumero += dato;
                        }
                    }
                }     
            }
           dato=entrada.read();//Actualizamos lectura datos del fichero
           }
    }
    catch (IOException e){
        System.out.println("Algo ha salido mal en la lectura del documento");
    }
         
    return arrayEnteros;
    }
    
    
    public void busquedaNumeroPrimo(){
        
          boolean Primo=true;
            int result;
          for(int i=0;i<this.arrayEnteros.size();i++){
              for(int j=2;j<i&&Primo==true;j++){
                if(i>2)
                {
                  result=this.arrayEnteros.get(i)%j;
                  if(result==0){
                      Primo=false;
                  }
                }
            }
              
              if(Primo==false && this.arrayEnteros.get(i)>2)
              {
                  arrayNoPrimosElegidos.add(this.arrayEnteros.get(i));
                  
              }
              else if (Primo==true && this.arrayEnteros.get(i)>2 )
              { 
                  arrayPrimosElegidos.add(this.arrayEnteros.get(i));
                
              }
                Primo=true;
          }

    }

    
   public void fillPrimosDocument(){
       //Copiamos en fichero "primos.txt"
      try{
            
            PrintStream info = new PrintStream ("primos.txt");
            for(int n=0;n<arrayPrimosElegidos.size();n++){
                info.println(arrayPrimosElegidos.get(n));
            }    
        }
        catch(FileNotFoundException e){
        System.out.print("No se ha podido rellenar el documento primos.txt");
    }
       //Copiamos en fichero "No_primos.txt"
    try{
            
            PrintStream info = new PrintStream ("No_primos.txt");
            for(int n=0;n<arrayNoPrimosElegidos.size();n++){
                info.println(arrayNoPrimosElegidos.get(n));
            }    
        }
        catch(FileNotFoundException e){
        System.out.print("No se ha podido rellenar el documento No_primos.txt"); 
   }
    
    }
   

   
   
   
   
}
