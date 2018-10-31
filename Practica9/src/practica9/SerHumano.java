/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica9;

/**
 *
 * @author capacita_mecon
 */
public class SerHumano
{
    private String _nombre;
    private byte _peso;
    private byte _altura;
    private String _sexo;

    public SerHumano(String _nombre, byte _peso, byte _altura, String _sexo)
    {
        this._nombre = _nombre;
        this._peso = _peso;
        this._altura = _altura;
        this._sexo = _sexo;
    }
    
    protected String comer(String comida)
    {
        StringBuilder cadena = new StringBuilder();
        cadena.append("Menú: ").append(comida).append("\n");
        
        return cadena.toString();
    }
    
    protected void dormir()
    {
        System.out.println("Me fui a dormir");
    }

    public String getNombre()
    {
        return _nombre;
    }

    public void setNombre(String _nombre)
    {
        this._nombre = _nombre;
    }

    public byte getPeso()
    {
        return _peso;
    }

    public void setPeso(byte _peso)
    {
        this._peso = _peso;
    }

    public byte getAltura()
    {
        return _altura;
    }

    public void setAltura(byte _altura)
    {
        this._altura = _altura;
    }

    public String getSexo()
    {
        return _sexo;
    }

    public void setSexo(String _sexo)
    {
        this._sexo = _sexo;
    }
    
    public String mostrarHumano()
    {
        StringBuilder cadena = new StringBuilder();
        
        cadena.append("Nombre: ").append(this._nombre).append("\n");
        cadena.append("Peso: ").append(this._peso).append("\n");
        cadena.append("Altura: ").append(this._altura).append("\n");
        cadena.append("Sexo: ").append(this._sexo).append("\n");
        
        return cadena.toString();
    }
}
