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
}
