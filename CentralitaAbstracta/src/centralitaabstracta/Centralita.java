/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centralitaabstracta;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Centralita
{
    private ArrayList<Llamada> _listaDeLlamadas;
    protected String _razonSocial;

    public Centralita()
    {
        this._listaDeLlamadas = new ArrayList<>();
    }

    public Centralita(String nombreEmpresa)
    {
        this();
        this._razonSocial = nombreEmpresa;
    }

    public ArrayList<Llamada> Llamadas()
    {
        return _listaDeLlamadas;
    }
    
    public float GananciaPorLocal()
    {
        return this.CalcularGanancia(TipoLlamada.LOCAL);
    }
    
    public float GananciaPorProvincial()
    {
        return this.CalcularGanancia(TipoLlamada.PROVINCIAL);
    }
    
    public float GananciaTotal()
    {
        return this.CalcularGanancia(TipoLlamada.TODAS);
    }
    
    private float CalcularGanancia(TipoLlamada tipo)
    {
        float ganancia = 0.0F;
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local && tipo != TipoLlamada.PROVINCIAL)
            {
                ganancia += ((Local) unaLlamada).getCostoLlamada();
            }
            else if(unaLlamada instanceof Provincial && tipo != TipoLlamada.LOCAL)
            {
                ganancia += ((Provincial) unaLlamada).getCostoLlamada();
            }
        }
        
        return ganancia;
    }
    
    public void Mostrar()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("Resumen de Centralita").append("\n");
        cadena.append("---------------------").append("\n");
        cadena.append("         Razón Social: ").append(this._razonSocial).append("\n");
        cadena.append("     Ganancia Locales: ").append(this.GananciaPorLocal()).append("\n");
        cadena.append("Ganancia Provinciales: ").append(this.GananciaPorProvincial()).append("\n");
        cadena.append("    Ganancias Totales: ").append(this.GananciaTotal()).append("\n");
        cadena.append("---------------------").append("\n");
        cadena.append("Detalle de Llamadas").append("\n");
        cadena.append("---------------------");
        
        for (Llamada unaLlamada : _listaDeLlamadas)
        {
            if(unaLlamada instanceof Local)
            {
                cadena.append("\n").append(((Local) unaLlamada).toString());
            }
            else if(unaLlamada instanceof Provincial)
            {
                cadena.append("\n").append(((Provincial) unaLlamada).toString());
            }
        }

        System.out.println(cadena.toString());
    }
    
    public void OrdenarLlamadas()
    {
        
    }
}
