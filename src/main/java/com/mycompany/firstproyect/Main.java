/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstproyect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nespdesktop
 */
public class Main {
    public static void main(String[] args) throws IOException{
  /*      
        String nombre = "Lucas";
        Integer followersInstagram = 2180;
        Integer followersYoutube = 5650;       
        
        String frase = "Hola mi nombre es " + nombre + ". Tengo " + (followersInstagram + followersYoutube) + " followers.";
        System.out.println(frase);

  
        Integer edad = 20;
        Boolean esMayorEdad = edad >= 18;
        
        if(esMayorEdad){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
   
        // Ejercicio MAYOR DE EDAD en consola
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        
        System.out.println("Ingrese su edad: ");
        String strEdad = reader.readLine();
        Integer edad = Integer.parseInt(strEdad);
        String mensaje = "";
        
        
        Boolean esMayorEdad = edad >= 18;
        
        if(esMayorEdad){
            mensaje = "Es mayor de edad";
        }else{
            mensaje = "Es menor de edad";
        }
        
        System.out.println(mensaje);

    
        // ----------- Ejercicio mayor y menor de 3 numeros -----
        System.out.println("Ingrese primer número: ");
        Integer n1 = cargarNumero();
        System.out.println("Ingrese segundo número: ");
        Integer n2 = cargarNumero();
        System.out.println("Ingrese tercer número: ");
        Integer n3 = cargarNumero();
        
        calcularMayorMenor(n1,n2,n3);
        // ----------- 
        
       
  
  
        // ----------- Ejercicio promedio 3 numeros -----
        System.out.println("Ingrese primer número: ");
        Integer n1 = cargarNumero();
        System.out.println("Ingrese segundo número: ");
        Integer n2 = cargarNumero();
        System.out.println("Ingrese tercer número: ");
        Integer n3 = cargarNumero();
        
        calcularPromedio(n1,n2,n3);
        // -----------
    */
        // ----------- Ejercicio numero par o impar -----
        System.out.println("Ingrese el número: ");
        Integer n1 = cargarNumero();
       
        evaluaPar(n1);
    } 
    
    // Crear FUNCIONES
    /**
     * Funcion que captura del teclado y devuelve convertido en entero
     * @return
     * @throws IOException 
     */
    private static Integer cargarNumero() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        Integer n1 = Integer.parseInt(reader.readLine());
        return n1;
    }
    
    /**
     * Calcula el número mayor y menor de tres números
     * @param n1
     * @param n2
     * @param n3 
     */
    private static void calcularMayorMenor(Integer n1,Integer n2,Integer n3){
        
        Integer numMayor = n1,numMenor = n1;
        if (n2 > numMayor ){
            numMayor = n2;
        }
        
        if (n3 > numMayor ){
            numMayor = n3;
        }
        
        System.out.println("El número mayor es: " + numMayor);
        
        if (n2 < numMenor ){
            numMenor = n2;
        }
        
        if (n3 < numMenor ){
            numMenor = n3;
        }
        
        System.out.println("El número menor es: " + numMenor);
        
    }
    
    private static void calcularPromedio(Integer n1,Integer n2,Integer n3){
        
        Double promedio = 0.0;
        promedio = Double.valueOf(n1 + n2 + n3)/3;
        System.out.println("El promedio es: " + promedio);
    }
    
    private static void evaluaPar(Integer n1){
        
        if ((n1 % 2) == 0){
            System.out.println("El número " + n1 + " es PAR.");
        }else{
            System.out.println("El número " + n1 + " es IMPAR.");
        }
        
    }
    
    
    
    
}
