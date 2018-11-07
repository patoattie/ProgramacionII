/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pplii;

import java.util.ArrayList;

/**
 *
 * @author capacita_mecon
 */
public class PPLII
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Producto ProductoUno = new Producto(666,"JamonDelDiablo", eTipoComestible.Solido,2);
        Producto ProductoDos = new Producto(33, "JamonDeDios", eTipoComestible.Solido,10);
        Producto ProductoTres = new Producto(55, "Sprite", eTipoComestible.Liquido, 10); 
        Producto ProductoCuatro = new Producto(666, "JamonDelDiablo", eTipoComestible.Solido); 
        Container ContenerdorUno = new Container(2, "Skanka"); 
        Container ContenerdorDos = new Container(3, "Skanka");
        ArrayList<Producto> listaProducto = new ArrayList<>();
        ContenerdorUno.Agregar(ProductoUno);
        ContenerdorUno.Agregar(ProductoDos);

        if(!ContenerdorUno.Agregar(ProductoTres)) 
        {
            System.out.println("No se pudo");
        }
        ContenerdorDos.Agregar(ProductoUno);
        ContenerdorDos.Agregar(ProductoDos);
        if(!ContenerdorDos.Agregar(ProductoCuatro)) 
        {
            System.out.println("No se pudo");
        }
        ContenerdorDos.Agregar(ProductoTres);
        Container.Mostrar(ContenerdorUno); 
        Container.Mostrar(ContenerdorDos);

        listaProducto = Container.SeleccionarComestible(ContenerdorDos,eTipoComestible.Liquido);
        System.out.println(" Lista Extraida "); 
        for(Producto item : listaProducto)
        {
            item.Mostrar(); 
        } 

    }
    
}
