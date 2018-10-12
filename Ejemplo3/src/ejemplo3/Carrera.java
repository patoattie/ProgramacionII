/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author capacita_mecon
 */
public class Carrera
{
    public Auto auto1;
    public Auto auto2;
    public Auto auto3;
    public Auto auto4;
    public Auto auto5;
    public Auto auto6;

    public Carrera()
    {
        this.auto1 = new Auto();
        this.auto2 = new Auto();
        this.auto3 = new Auto();
        this.auto4 = new Auto();
        this.auto5 = new Auto();
        this.auto6 = new Auto();
    }
    
    public void MostrarCarrera()
    {
        System.out.println("Fabricante Auto 1: " + this.auto1.getFabricante());
        System.out.println("Fabricante Auto 2: " + this.auto2.getFabricante());
        System.out.println("Fabricante Auto 3: " + this.auto3.getFabricante());
        System.out.println("Fabricante Auto 4: " + this.auto4.getFabricante());
        System.out.println("Fabricante Auto 5: " + this.auto5.getFabricante());
        System.out.println("Fabricante Auto 6: " + this.auto6.getFabricante());
    }
    
    public void PorTiempo(int minutos)
    {
        int autoGanador;
        int mayorRecorrido;
        
        for (int i = 0; i < minutos; i++)
        {
            this.auto1.AgregarKilometros(Auto.azar.nextInt(4));
            this.auto2.AgregarKilometros(Auto.azar.nextInt(4));
            this.auto3.AgregarKilometros(Auto.azar.nextInt(4));
            this.auto4.AgregarKilometros(Auto.azar.nextInt(4));
            this.auto5.AgregarKilometros(Auto.azar.nextInt(4));
            this.auto6.AgregarKilometros(Auto.azar.nextInt(4));
        }
        
        System.out.println("Km. Auto 1: " + this.auto1.GetKms());
        System.out.println("Km. Auto 2: " + this.auto2.GetKms());
        System.out.println("Km. Auto 3: " + this.auto3.GetKms());
        System.out.println("Km. Auto 4: " + this.auto4.GetKms());
        System.out.println("Km. Auto 5: " + this.auto5.GetKms());
        System.out.println("Km. Auto 6: " + this.auto6.GetKms());
        
        autoGanador = 1;
        mayorRecorrido = this.auto1.GetKms();
        if(this.auto2.GetKms() > mayorRecorrido)
        {
            autoGanador = 2;
            mayorRecorrido = this.auto2.GetKms();
        }
        if(this.auto3.GetKms() > mayorRecorrido)
        {
            autoGanador = 3;
            mayorRecorrido = this.auto3.GetKms();
        }
        if(this.auto4.GetKms() > mayorRecorrido)
        {
            autoGanador = 4;
            mayorRecorrido = this.auto4.GetKms();
        }
        if(this.auto5.GetKms() > mayorRecorrido)
        {
            autoGanador = 5;
            mayorRecorrido = this.auto5.GetKms();
        }
        if(this.auto6.GetKms() > mayorRecorrido)
        {
            autoGanador = 6;
            mayorRecorrido = this.auto6.GetKms();
        }
        
        System.out.println("GANADOR: Auto " + autoGanador + " - Km. recorridos: " + mayorRecorrido);
    }
}
