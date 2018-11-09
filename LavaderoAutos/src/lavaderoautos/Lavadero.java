/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lavaderoautos;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class Lavadero
{
    protected ArrayList<Vehiculo> _vehiculos;
    private static float _precioAuto = 0.0F;
    private static float _precioCamion = 0.0F;
    private static float _precioMoto = 0.0F;
    private String _razonSocial;
    
    static
    {
        final float PRECIO_MINIMO = 150.0F;
        final float PRECIO_MAXIMO = 565.0F;
        _precioAuto = (float) (Math.random() * PRECIO_MAXIMO) + PRECIO_MINIMO;
        do
        {            
            _precioCamion = (float) (Math.random() * PRECIO_MAXIMO) + PRECIO_MINIMO;
        } while (_precioCamion == _precioAuto);
        do
        {            
            _precioMoto = (float) (Math.random() * PRECIO_MAXIMO) + PRECIO_MINIMO;
        } while (_precioMoto == _precioAuto || _precioMoto == _precioCamion);
    }

    public Lavadero(String _razonSocial)
    {
        this();
        this._razonSocial = _razonSocial;
    }
    
    private Lavadero()
    {
        this._vehiculos = new ArrayList<>();
    }
    
    public String LavaderoString()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("Razón Social: ").append(this._razonSocial).append("\n");
        cadena.append("Lista de Precios vigente").append("\n");
        cadena.append("   Autos: ").append(Lavadero._precioAuto).append("\n");
        cadena.append("Camiones: ").append(Lavadero._precioCamion).append("\n");
        cadena.append("   Motos: ").append(Lavadero._precioMoto).append("\n");
        cadena.append("Vehículos atendidos").append("\n");
        for (Vehiculo unVehiculo : getVehiculos())
        {
            if(unVehiculo instanceof Auto)
            {
                cadena.append(((Auto) unVehiculo).Mostrar());
            }
            else if(unVehiculo instanceof Camion)
            {
                cadena.append(((Camion) unVehiculo).Mostrar());
            }
            else if(unVehiculo instanceof Moto)
            {
                cadena.append(((Moto) unVehiculo).Mostrar());
            }
            cadena.append("\n");
        }
        
        return cadena.toString();
    }

    public ArrayList<Vehiculo> getVehiculos()
    {
        return _vehiculos;
    }
    
    private static boolean EstaEnLavadero(Lavadero unLavadero, Vehiculo unVehiculo)
    {
        boolean retorno = false;
        
        for (Vehiculo miVehiculo : unLavadero._vehiculos)
        {
            if(Vehiculo.ComparaVehiculos(unVehiculo, miVehiculo))
            {
                retorno = true;
                break;
            }
        }
        
        return retorno;
    }
    
    private static int EstaEnLavadero(Vehiculo unVehiculo, Lavadero unLavadero)
    {
        int retorno = -1;
        int i = 0;
        
        for (Vehiculo miVehiculo : unLavadero._vehiculos)
        {
            if(Vehiculo.ComparaVehiculos(unVehiculo, miVehiculo))
            {
                retorno = i;
                break;
            }
            
            i++;
        }
        
        return retorno;
    }
    
    public boolean AgregarVehiculo(Vehiculo unVehiculo)
    {
        boolean retorno = false;
        
        if(!Lavadero.EstaEnLavadero(this, unVehiculo))
        {
            retorno = this._vehiculos.add(unVehiculo);
        }
        
        return retorno;
    }
    
    public boolean QuitarVehiculo(Vehiculo unVehiculo)
    {
        boolean retorno = false;
        int indice = Lavadero.EstaEnLavadero(unVehiculo, this);
        
        if(indice > -1)
        {
            this._vehiculos.remove(indice);
            retorno = true;
        }
        
        return retorno;
    }
}
