/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericas;

import java.util.Scanner;

/**
 *
 * @author capacita_mecon
 */
public class Genericas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    }
    
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
    
    public static void mostrarMensajeSinRetorno(String mensaje) {
        System.out.print(mensaje);
    }
    
    public static int pedirEntero(String mensaje) {
        int retorno;
        Scanner lector = new Scanner(System.in);
        mostrarMensaje(mensaje);
        retorno = lector.nextInt();
        
        return retorno;
    }
    
    public static int pedirEntero(String mensaje, int minimo) {
        int retorno;
        Scanner lector = new Scanner(System.in);
        do {
            mostrarMensaje(mensaje);
            retorno = lector.nextInt();
            if (retorno < minimo) {
                mostrarMensaje("El número ingresado debe ser mayor a " + minimo + ". Por favor reingrese");
            }
        } while (retorno < minimo);
        
        return retorno;
    }
    
    public static float pedirFlotante(String mensaje) {
        float retorno;
        Scanner lector = new Scanner(System.in);
        mostrarMensaje(mensaje);
        retorno = lector.nextFloat();
        
        return retorno;
    }
    
    public static String pedirString(String mensaje) {
        String retorno;
        Scanner lector = new Scanner(System.in);
        mostrarMensaje(mensaje);
        retorno = lector.next();
        
        return retorno;
    }
    
    public static char pedirChar(String mensaje) {
        char retorno = ' ';
        String ingresoUsuario;
        Scanner lector = new Scanner(System.in);
        mostrarMensaje(mensaje);
        ingresoUsuario = lector.next();
        
        if (ingresoUsuario.length() == 1) {
            retorno = ingresoUsuario.charAt(0);
        }
        
        return retorno;
    }
    
    public static boolean esPrimo(int numero) {
        int cantidadDivisores = 0;
        boolean retorno;
        
        for (int i = numero; i > 0; i--) {
            if (numero % i == 0) {
                cantidadDivisores++;
            }
        }
        
        if (cantidadDivisores <= 2) {
            retorno = true;
        } else {
            retorno = false;
        }
        
        return retorno;
    }
    
    public static float numeroMayor(float num1, float num2) {
        float mayor;
        
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
        
        return mayor;
    }
    
    public static boolean numerosIguales(float num1, float num2) {
        boolean sonIguales;
        
        if (num1 == num2) {
            sonIguales = true;
        } else {
            sonIguales = false;
        }
        
        return sonIguales;
    }
}
