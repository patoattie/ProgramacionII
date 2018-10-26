/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo8;

import java.util.Queue;

/**
 *
 * @author capacita_mecon
 */
public class Turno
{
    private int orden;
    private Paciente paciente;
    private eTipo tipo;
    private static int seqUrgentes;
    private static int seqNormales;
    
    static //Inicializo las secuencias para asignar turnos
    {
        seqUrgentes = 0;
        seqNormales = 0;
    }

    public Turno(Paciente paciente, eTipo tipo)
    {
        this.paciente = paciente;
        this.tipo = tipo;
        this.orden = Turno.asignarTurno(tipo);
    }
    
    private static int asignarTurno(eTipo tipo)
    {
        int retorno = -1;
        
        switch(tipo)
        {
            case URGENTE:
                seqUrgentes++;
                retorno = seqUrgentes;
                break;
            case NORMAL:
                seqNormales++;
                retorno = seqNormales;
                break;
        }
        
        return retorno;
    }

    public int getOrden()
    {
        return orden;
    }

    public Paciente getPaciente()
    {
        return paciente;
    }

    public eTipo getTipo()
    {
        return tipo;
    }
    
    public boolean encolarPaciente(Queue<Turno> colaUrgente, Queue<Turno> colaNormal)
    {
        boolean retorno = false;
        
        switch(this.getTipo())
        {
            case URGENTE:
                retorno = colaUrgente.offer(this);
                break;
            case NORMAL:
                retorno = colaNormal.offer(this);
                break;
        }
        
        return retorno;
    }
    
    public static boolean atenderPaciente(Queue<Turno> colaUrgente, Queue<Turno> colaNormal)
    {
        boolean retorno;
        
        if(colaUrgente.size() > 0)
        {
            System.out.println(Turno.mostrarTurnoAtendido(colaUrgente.poll()));
            retorno = true;
        }
        else if(colaNormal.size() > 0)
        {
            System.out.println(Turno.mostrarTurnoAtendido(colaNormal.poll()));
            retorno = true;
        }
        else
        {
            System.out.println("NO QUEDAN PACIENTES SIN ATENDER");
            retorno = false;
        }
        
        return retorno;
    }
    
    public static String mostrarTurnoAtendido(Turno unTurno)
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("TURNO ATENDIDO").append("\n");
        cadena.append("--------------").append("\n");
        cadena.append("Tipo: ").append(unTurno.getTipo()).append("\n");
        cadena.append("Orden: ").append(unTurno.getOrden()).append("\n");
        cadena.append("DNI Paciente: ").append(unTurno.getPaciente().getDni()).append("\n");
        cadena.append("Nombre Paciente: ").append(unTurno.getPaciente().getNombre()).append("\n");
        
        return cadena.toString();
    }
}
