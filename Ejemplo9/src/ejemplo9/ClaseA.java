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
public class ClaseA
{
    protected int protegido;
    private int privado;
    public int publico;
    
    public ClaseA(int protegido, int privado, int publico)
    {
        this.protegido = protegido;
        this.privado = privado;
        this.publico = publico;
    }
    
    public void mostrarPublic()
    {
        System.out.println("Metodo publico: " + publico);
    }

    protected void mostrarProtected()
    {
        System.out.println("Metodo protegido: " + protegido);
    }

    private void mostrarPrivate()
    {
        System.out.println("Metodo privado: " + privado);
    }
}
