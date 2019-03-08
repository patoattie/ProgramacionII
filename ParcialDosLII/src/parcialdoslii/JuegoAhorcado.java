/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author pattie
 */
public class JuegoAhorcado
{
    private int fallosMaximos;
    private Palabra palabraSeleccionada;
    private String letrasJugadas;
    private int cantidadFallos;
    private int jugadaMuestraAyuda;
    private int fallosMinimosPermitidos;
    private String caracterMascara;
    private boolean juegoFinalizado;
    private boolean juegoSinGuardar;
    
    public JuegoAhorcado()
    {
        this.letrasJugadas = "";
        this.cantidadFallos = 0;
        this.fallosMinimosPermitidos = 5;
        this.juegoFinalizado = false;
        this.juegoSinGuardar = false;
    }

    public JuegoAhorcado(String caracterMascara, int fallosMaximos, Diccionario unDiccionario) throws DiccionarioVacioException
    {
        this();

        if(unDiccionario == null)
        {
            throw new DiccionarioVacioException("ERROR. El Diccionario esta vacío");
        }
        else
        {
            if(fallosMaximos < this.fallosMinimosPermitidos)
            {
                this.fallosMaximos = this.fallosMinimosPermitidos;
            }
            else
            {
                this.fallosMaximos = fallosMaximos;
            }

            this.jugadaMuestraAyuda = this.fallosMaximos - 3;
            this.palabraSeleccionada = getPalabraAleatoria(unDiccionario);
            this.caracterMascara = caracterMascara;
        }
    }

    public void setPalabraSeleccionada(Palabra palabraSeleccionada)
    {
        this.palabraSeleccionada = palabraSeleccionada;
    }

    public Palabra getPalabraSeleccionada()
    {
        return palabraSeleccionada;
    }

    public String getLetrasJugadas()
    {
        return letrasJugadas;
    }

    public void setLetrasJugadas(String letrasJugadas)
    {
        this.letrasJugadas = this.letrasJugadas.concat(letrasJugadas.toUpperCase());
    }

    public int getCantidadFallos()
    {
        return cantidadFallos;
    }

    public void setCantidadFallos()
    {
        this.cantidadFallos++;
    }

    public int getFallosMaximos()
    {
        return fallosMaximos;
    }
    
    public int getCantidadJugadas()
    {
        return this.letrasJugadas.length();
    }

    public void setFallosMaximos(int fallosMaximos)
    {
        this.fallosMaximos = fallosMaximos;
    }

    public void setCantidadFallos(int cantidadFallos)
    {
        this.cantidadFallos = cantidadFallos;
    }

    public void setJugadaMuestraAyuda(int jugadaMuestraAyuda)
    {
        this.jugadaMuestraAyuda = jugadaMuestraAyuda;
    }

    public void setCaracterMascara(String caracterMascara)
    {
        this.caracterMascara = caracterMascara;
    }

    public int getFallosMinimosPermitidos()
    {
        return fallosMinimosPermitidos;
    }

    public void setFallosMinimosPermitidos(int fallosMinimosPermitidos)
    {
        this.fallosMinimosPermitidos = fallosMinimosPermitidos;
    }

    public int getJugadaMuestraAyuda()
    {
        return jugadaMuestraAyuda;
    }

    public String getCaracterMascara()
    {
        return caracterMascara;
    }

    public boolean isJuegoFinalizado()
    {
        return juegoFinalizado;
    }

    public void setJuegoFinalizado(boolean juegoFinalizado)
    {
        this.juegoFinalizado = juegoFinalizado;
    }

    public boolean isJuegoSinGuardar()
    {
        return juegoSinGuardar;
    }

    public String getPalabra() throws JuegoException
    {
        String retorno = this.palabraSeleccionada.getPalabra();
        boolean faltanLetras = false;

        for (int i = 0; i < retorno.length(); i++)
        {
            String caracterLeido = retorno.substring(i, i + 1);
            if(!caracterLeido.equalsIgnoreCase(this.caracterMascara) && !this.letrasJugadas.contains(caracterLeido))
            {
                retorno = retorno.replace(caracterLeido.charAt(0), this.caracterMascara.charAt(0));
                faltanLetras = true;
            }
        }
        
        if(!faltanLetras)
        {
            this.juegoFinalizado = true;
            throw new JuegoGanadoException("FELICITACIONES!! GANASTE EL JUEGO");
        }
        
        return retorno;
    }
    
    public String getDefinicion()
    {
        String retorno = "";
        
        if(this.cantidadFallos >= this.jugadaMuestraAyuda)
        {
            retorno = this.palabraSeleccionada.getDefinicion();
        }
        
        return retorno;
    }
    
    public void jugarLetra(String letraJugada) throws LetraJugadaException, JuegoException
    {
        if(this.cantidadFallos < this.fallosMaximos)
        {
            String letraJugadaUpper = letraJugada.substring(0, 1).toUpperCase();
            //char letraJugadaChar = letraJugadaUpper.charAt(0);

            //if(letraJugadaChar < 'A' || letraJugadaChar > 'Z')
            if(Palabra.existeCaracterEspecial(letraJugadaUpper))
            {
                throw new LetraJugadaException("ERROR. La letra '" + letraJugada + "' es un caracter especial y no puede ser jugado");
            }
            else if(this.letrasJugadas.contains(letraJugadaUpper))
            {
                throw new LetraJugadaException("ERROR. La letra '" + letraJugada + "' ya fue jugada");
            }
            else
            {
                this.setLetrasJugadas(letraJugadaUpper);
                this.juegoSinGuardar = true;

                if(!this.palabraSeleccionada.getPalabra().contains(letraJugadaUpper))
                {
                    this.setCantidadFallos();

                    if(this.cantidadFallos == this.fallosMaximos)
                    {
                        this.juegoFinalizado = true;
                        throw new JuegoPerdidoException("FUISTE DECAPITADO!!");
                    }
                }
            }
        }
        else
        {
            this.juegoFinalizado = true;
            throw new JuegoPerdidoException("FUISTE DECAPITADO!!");
        }
    }
    
    public void arriesgarPalabra(String palabra) throws JuegoException
    {
        if(!palabra.isEmpty())
        {
            if(palabra.equalsIgnoreCase(this.palabraSeleccionada.getPalabra()))
            {
                throw new JuegoGanadoException("FELICITACIONES!! GANASTE EL JUEGO");
            }
            else
            {
                throw new JuegoPerdidoException("FUISTE DECAPITADO!!");
            }
        }
        
        this.juegoFinalizado = true;
    }

    public static void jugarPorConsola(JuegoAhorcado miJuego)
    {
        Scanner lector = new Scanner(System.in);
        final String TERMINA = "0";
        String letraJugada = "";
        String palabra = "";
        
        do
        {
            try
            {
                palabra = miJuego.getPalabra();
                System.out.println(palabra);
                System.out.println(miJuego.getDefinicion());

                System.out.print("Ingrese letra a jugar (o '" + TERMINA + "' para finalizar): ");
                letraJugada = lector.next();

                if(!letraJugada.equalsIgnoreCase(TERMINA))
                {
                    miJuego.jugarLetra(letraJugada);
                }
            }
            catch (LetraJugadaException e)
            {
                System.out.println(e.getMessage());
            }
            catch(JuegoException e)
            {
                System.out.println(e.getMessage());
                System.out.println("Palabra: " + miJuego.getPalabraSeleccionada().getPalabra());
            }
        } while(!letraJugada.equalsIgnoreCase(TERMINA) && !miJuego.isJuegoFinalizado());
    }
    
    public static void jugarPorEntornoGrafico(JuegoAhorcado miJuego)
    {
        //frmAhorcado ventana = new frmAhorcado(miJuego, 102, 133, 208);
        frmAhorcado ventana = new frmAhorcado(miJuego, 102, 113, 185);
        ventana.setVisible(true);
    }

    private Palabra getPalabraAleatoria(Diccionario diccionario) throws DiccionarioVacioException
    {
        Palabra unaPalabra = null;
        int indiceAleatorio;
        if (diccionario.getListaPalabras().isEmpty())
        {
            throw new DiccionarioVacioException("ERROR. El Diccionario esta vacío");
        } else
        {
            indiceAleatorio = (int) (Math.random() * (diccionario.getListaPalabras().size()));
            unaPalabra = diccionario.getListaPalabras().get(indiceAleatorio);
        }
        return unaPalabra;
    }

    public static JuegoAhorcado cargarJuego(String archivoXML) throws FileNotFoundException
    {
        return (JuegoAhorcado) XML.cargar(archivoXML);
    }

    public void guardarJuegoNuevo(String archivoXML) throws FileNotFoundException, ArchivoException
    {
        try
        {
            XML.guardarNuevo(archivoXML, this);
            this.juegoSinGuardar = false;
        }
        catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
        catch (ArchivoExisteException e)
        {
            throw new ArchivoExisteException(e.getMessage());
        }
    }

    public void guardarJuego(String archivoXML) throws FileNotFoundException
    {
        try
        {
            XML.guardar(archivoXML, this);
            this.juegoSinGuardar = false;
        }
        catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
    }
}
