/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int unNumero;
        String nombre;
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese un número: ");
        unNumero = lector.nextInt();
        System.out.println("El número es: " + unNumero);
        
        System.out.println("Ingrese su nombre: ");
        nombre = lector.next();
        
        System.out.println("El nombre es: " + nombre);*/
        
        //Ejercicio 1
        /*int numeroMaximo = 0;
        int numeroMinimo = 0;
        int numero;
        int sumatoria = 0;
        float promedio;
        boolean primerNumero = true;
        int cantidadNumeros = 5;
        
        for(int i = 0; i < cantidadNumeros; i++){
            numero = pedirEntero((i + 1) + ") Ingrese un número entero: ");
            if(primerNumero){
                numeroMaximo = numero;
                numeroMinimo = numero;
                primerNumero = false;
            }
            else{
                if(numero > numeroMaximo){
                    numeroMaximo = numero;
                }
                else if(numero < numeroMinimo){
                    numeroMinimo = numero;
                }
            }
            sumatoria = sumatoria + numero;
        }
        promedio = sumatoria / (float)cantidadNumeros;
        
        mostrarMensaje("El número máximo es: " + numeroMaximo);
        mostrarMensaje("El número mínimo es: " + numeroMinimo);
        mostrarMensaje("El promedio es: " + promedio);*/
        
        //Ejercicio 2
        int numeroIngresado = pedirEntero("Ingrese un número hasta el que mostrar números primos: ", 1);
        for(int i = 1; i < numeroIngresado; i++){
            if(esPrimo(i)){
                mostrarMensajeSinRetorno(i + ";");
            }
        }
    }
    
    private static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }

    private static void mostrarMensajeSinRetorno(String mensaje){
        System.out.print(mensaje);
    }
    
    private static int pedirEntero(String mensaje){
        int retorno;
        Scanner lector = new Scanner(System.in);
        mostrarMensaje(mensaje);
        retorno = lector.nextInt();
        
        return retorno;
    }

    private static int pedirEntero(String mensaje, int minimo){
        int retorno;
        Scanner lector = new Scanner(System.in);
        do{
            mostrarMensaje(mensaje);
            retorno = lector.nextInt();
            if(retorno < minimo){
                mostrarMensaje("El número ingresado debe ser mayor a " + minimo + ". Por favor reingrese");
            }
        }
        while(retorno < minimo);
        
        return retorno;
    }
    
    private static boolean esPrimo(int numero){
        int cantidadDivisores = 0;
        boolean retorno;
        
        for(int i = numero; i > 0; i--){
            if(numero % i == 0){
                cantidadDivisores++;
            }
        }
        
        if(cantidadDivisores <= 2){
            retorno = true;
        }
        else{
            retorno = false;
        }
        
        return retorno;
    }
   
}
