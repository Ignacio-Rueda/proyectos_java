/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaFinalUnidad;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Ignacio
 */
public class DatosPersonales {
     private LinkedList<Double> dineroEnCuenta = new LinkedList<>();
     private LinkedList<String> nombre = new LinkedList<>();
     private HashMap <LinkedList<String>,LinkedList<Double>> datos = new HashMap();
    
    public DatosPersonales(){
      
    }
    public void  introducirDatosPersonales(){
        
        
        System.out.println("Por favor introduzca los siguientes datos");
        //Guardamos  todos los datos en la LinkedList
       
        int contador = 0;
        
        while (contador < 2){
            System.out.println("Introduzca Nombre");
            Scanner entradaNombre = new Scanner (System.in);
            String valorN =entradaNombre.nextLine();
            nombre.add(valorN);
            
            System.out.println("Introduzca cantidad dinero en banco");
            Scanner entradaDinero = new Scanner (System.in);
            double valorD = entradaDinero.nextDouble();
            dineroEnCuenta.add (valorD);
            
            contador++;
        }
        
        //Guardamos los distintos datos de las LinkedList en HashMap
          datos.put(nombre, dineroEnCuenta);
    }
    
    
    public void imprimirDatosPersonales(String cliente){
        int pos=0;
        for(int n=0; n<nombre.size();n++){
            if(nombre.get(n).equals(cliente)){
                pos=n;
            }
        }
        
        for(Map.Entry<LinkedList<String>,LinkedList<Double>> element : datos.entrySet()){
            System.out.println("El cliente "+ element.getKey().get(pos));
            System.out.println("Tiene en la cuenta corriente: "+element.getValue().get(pos)+"Euros");
        }
    
    }
    
    }
    

