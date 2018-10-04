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
        /*int numeroIngresado = pedirEntero("Ingrese un número hasta el que mostrar números primos: ", 1);
        for(int i = 1; i < numeroIngresado; i++){
            if(esPrimo(i)){
                mostrarMensajeSinRetorno(i + ";");
            }
        }*/
        
        //Ejercicio 3
        /*float numero1 = pedirFlotante("Ingrese primer número: ");
        float numero2 = pedirFlotante("Ingrese segundo número: ");
        float numeroMayor;
        if(numerosIguales(numero1, numero2)){
            mostrarMensaje("Los números ingresados son iguales");
        }
        else{
            numeroMayor = numeroMayor(numero1, numero2);
            mostrarMensaje("El mayor de los números ingresados es " + numeroMayor);
        }*/
        
        //Ejercicio 4
        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadPares = 0;
        int cantidadImpares = 0;
        int sumatoriaPositivos = 0;
        int cantidadTotal = 0;
        float promedioPositivos;
        float porcentajePositivos;
        float porcentajeNegativos;
        int numeroIngresado;
        String continuaIngreso;
        
        do{
            do{
                numeroIngresado = pedirEntero("Ingrese un numero: ");
                if(numeroIngresado == 0){
                    mostrarMensaje("El número no puede ser igual a 0");
                }
            }while(numeroIngresado == 0);
            
            cantidadTotal++;

            if(numeroIngresado > 0){
                cantidadPositivos++;
                sumatoriaPositivos = sumatoriaPositivos + numeroIngresado;
            }
            else if(numeroIngresado < 0){
                cantidadNegativos++;
            }

            if(numeroIngresado % 2 == 0 && numeroIngresado != 0){
                cantidadPares++;
            }
            else if(numeroIngresado % 2 != 0){
                cantidadImpares++;
            }
            
            continuaIngreso = pedirString("¿Continúa ingresando números?: ");
        }while("s".equalsIgnoreCase(continuaIngreso));
        
        promedioPositivos = (float)sumatoriaPositivos / cantidadPositivos;
        porcentajePositivos = ((float)cantidadPositivos / cantidadTotal) * 100;
        porcentajeNegativos = ((float)cantidadNegativos / cantidadTotal) * 100;
        
        mostrarMensaje("Cantidad de números positivos: " + cantidadPositivos);
        mostrarMensaje("Cantidad de números negativos: " + cantidadNegativos);
        mostrarMensaje("Cantidad de números pares: " + cantidadPares);
        mostrarMensaje("Cantidad de números impares: " + cantidadImpares);
        mostrarMensaje("Promedio de los números positivos: " + promedioPositivos);
        mostrarMensaje("Porcentaje de números positivos: " + porcentajePositivos);
        mostrarMensaje("Porcentaje de números negativos: " + porcentajeNegativos);
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
    
    private static float pedirFlotante(String mensaje){
        float retorno;
        Scanner lector = new Scanner(System.in);
        mostrarMensaje(mensaje);
        retorno = lector.nextFloat();
        
        return retorno;
    }

    private static String pedirString(String mensaje){
        String retorno;
        Scanner lector = new Scanner(System.in);
        mostrarMensaje(mensaje);
        retorno = lector.next();
        
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
    
    private static float numeroMayor(float num1, float num2){
        float mayor;
        
        if(num1 > num2){
            mayor = num1;
        }
        else{
            mayor = num2;
        }
        
        return mayor;
    }

        private static boolean numerosIguales(float num1, float num2){
        boolean sonIguales;
        
        if(num1 == num2){
            sonIguales = true;
        }
        else{
            sonIguales = false;
        }
        
        return sonIguales;
    }
}
