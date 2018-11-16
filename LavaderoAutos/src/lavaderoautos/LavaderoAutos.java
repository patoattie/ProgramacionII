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
public class LavaderoAutos
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Lavadero miLavadero = new Lavadero("LavaTutti");
        Auto auto1 = new Auto(5, "HGF456", eMarcas.FORD);
        Auto auto2 = new Auto(4, "ABC123", eMarcas.FIAT);
        Moto moto1 = new Moto(125.0F, "CBA321", 2, eMarcas.HONDA);
        Camion camion1 = new Camion(1500.0F, "DSA654", 6, eMarcas.SCANIA);
        Moto moto2 = new Moto(250.0F, "MNB789", 2, eMarcas.ZANELLA);
        Auto auto3 = new Auto(4, "MNB987", eMarcas.HONDA);
        ArrayList<Vehiculo> listaOrdenada = new ArrayList<>();
        
        miLavadero.AgregarVehiculo(auto1);
        miLavadero.AgregarVehiculo(auto2);
        System.out.println("Quito vehículo no existente:");
        if(!miLavadero.QuitarVehiculo(auto3))
        {
            System.out.println("NO ES POSIBLE QUITAR\n" + auto3.Mostrar());
        }
        miLavadero.AgregarVehiculo(auto3);
        miLavadero.AgregarVehiculo(moto1);
        System.out.println("Agrego vehículo existente:");
        if(!miLavadero.AgregarVehiculo(auto1))
        {
            System.out.println("NO ES POSIBLE AGREGAR\n" + auto1.Mostrar());
        }
        miLavadero.AgregarVehiculo(moto2);
        miLavadero.AgregarVehiculo(camion1);
        
        System.out.println(miLavadero.LavaderoString());

        listaOrdenada = (ArrayList<Vehiculo>) miLavadero.getVehiculos().clone();

        System.out.println("Vehículos ordenados por patente");
        listaOrdenada.sort(Lavadero.OrdenarVehiculosPorPatente);
        for (Vehiculo vehiculo : listaOrdenada) 
        {
            System.out.println(vehiculo.Mostrar());
        }
        
        System.out.println("Vehículos ordenados por marca");
        listaOrdenada.sort(miLavadero.OrdenarVehiculosPorMarca);
        for (Vehiculo vehiculo : listaOrdenada) 
        {
            System.out.println(vehiculo.Mostrar());
        }
        
        System.out.println("Total Facturado AUTOS");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado(EVehiculos.AUTO)));
        System.out.println("Total Facturado CAMIONES");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado(EVehiculos.CAMION)));
        System.out.println("Total Facturado MOTOS");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado(EVehiculos.MOTO)));
        System.out.println("Total Facturado");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado()));

        System.out.println("Quito las motos");
        
        miLavadero.QuitarVehiculo(moto1);
        miLavadero.QuitarVehiculo(moto2);

        System.out.println(miLavadero.LavaderoString());
        
        System.out.println("Total Facturado AUTOS");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado(EVehiculos.AUTO)));
        System.out.println("Total Facturado CAMIONES");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado(EVehiculos.CAMION)));
        System.out.println("Total Facturado MOTOS");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado(EVehiculos.MOTO)));
        System.out.println("Total Facturado");
        System.out.println(String.format("%.2f", miLavadero.MostrarTotalFacturado()));
    }
    
}
