/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo20_ej2;

/**
 *
 * @author capacita_mecon
 */
public class PilaVaciaExcepcion extends Exception
{
    public PilaVaciaExcepcion(String mensaje)
    {
        super(mensaje);
    }
}
