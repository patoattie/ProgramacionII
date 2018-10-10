/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

/**
 *
 * @author capacita_mecon
 */
public class Calculadora {
    private static float Resultado;
    private static char Operador;
    
    private static void Sumar(int num1, int num2){
        Resultado = num1 + num2;
    }
    
    private static void Restar(int num1, int num2){
        Resultado = num1 - num2;
    }
    
    private static void Multiplicar(int num1, int num2){
        Resultado = num1 * num2;
    }
    
    private static void Dividir(int num1, int num2){
        if(num2 == 0){
            Resultado = 0;
        }
        else{
            Resultado = (float)num1 / num2;
        }
    }
    
    public static void CalcularOperacion(int num1, int num2){
        switch(Operador){
            case '+':
                Sumar(num1, num2);
                break;
            case '-':
                Restar(num1, num2);
                break;
            case '*':
                Multiplicar(num1, num2);
                break;
            case '/':
                Dividir(num1, num2);
                break;
        }
    }
    
    public static void MostrarResultado(){
        System.out.print(Resultado);
    }
    
    public static void SetOperador(char operador){
        if(operador == '+' || operador == '-' || operador == '*' || operador == '/'){
            Operador = operador;
        }
    }
    
    public static char GetOperador(){
        return Operador;
    }
    
}
