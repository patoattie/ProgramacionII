/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo9;

/**
 *
 * @author capacita_mecon
 */
public class ClaseB extends ClaseA
{
    public ClaseB(int protegido, int privado, int publico)
    {
        super(protegido, privado, publico);
    }
    
    public void mostrarDerivada()
    {
        this.mostrarPublic();
        this.mostrarProtected();
        //this.mostrarPrivate(); No es posible acceder.
    }
}
