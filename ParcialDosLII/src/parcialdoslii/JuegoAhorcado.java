/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.Scanner;

/**
 *
 * @author pattie
 */
public class JuegoAhorcado implements FilenameFilter
{
    private int fallosMaximos;
    private Palabra palabraSeleccionada;
    private String letrasJugadas;
    private int cantidadFallos;
    private int jugadaMuestraAyuda;
    private static int fallosMinimosPermitidos = 5;
    private String caracterMascara;
    private boolean juegoFinalizado;
    private boolean juegoGanado;
    private boolean juegoSinGuardar;
    private static String directorio = "juegos" + System.getProperty("file.separator");
    private String dificultad;
    private Ranking ranking;
    
    public JuegoAhorcado()
    {
        this.letrasJugadas = "";
        this.cantidadFallos = 0;
        this.fallosMaximos = JuegoAhorcado.fallosMinimosPermitidos;
        this.jugadaMuestraAyuda = JuegoAhorcado.fallosMinimosPermitidos - 3;
        this.juegoFinalizado = false;
        this.juegoSinGuardar = false;
        this.juegoGanado = false;
    }

    public JuegoAhorcado(String caracterMascara, int fallosMaximos, Diccionario unDiccionario, Ranking ranking) throws DiccionarioVacioException
    {
        this();

        if(unDiccionario == null)
        {
            throw new DiccionarioVacioException("ERROR. El Diccionario esta vacío");
        }
        else
        {
            if(ranking == null)
            {
                ranking = new Ranking();
            }
            
            if(fallosMaximos < this.fallosMinimosPermitidos)
            {
                this.fallosMaximos = this.fallosMinimosPermitidos;
            }
            else
            {
                this.fallosMaximos = fallosMaximos;
            }

            this.jugadaMuestraAyuda = this.fallosMaximos - 3;
            this.palabraSeleccionada = unDiccionario.getPalabraAleatoria();
            this.caracterMascara = caracterMascara;
            this.ranking = ranking;
        }
    }

    public JuegoAhorcado(String caracterMascara, int fallosMaximos, int jugadaMuestraAyuda, Diccionario unDiccionario, String dificultad, Ranking ranking) throws DiccionarioVacioException, DificultadPalabraException
    {
        this(caracterMascara, fallosMaximos, unDiccionario, ranking);
        this.setDificultad(dificultad);
        if(jugadaMuestraAyuda >= fallosMaximos)
        {
            this.jugadaMuestraAyuda = fallosMaximos - 1;
        }
        else if(jugadaMuestraAyuda < 0)
        {
            this.jugadaMuestraAyuda = 1;
        }
        else
        {
            this.jugadaMuestraAyuda = jugadaMuestraAyuda;
        }
    }
    
    public static String getDirectorio()
    {
        return directorio;
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

    public static int getFallosMinimosPermitidos()
    {
        return fallosMinimosPermitidos;
    }

    public static void setFallosMinimosPermitidos(int fallosMinimosPermitidos)
    {
        JuegoAhorcado.fallosMinimosPermitidos = fallosMinimosPermitidos;
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

    public boolean isJuegoGanado()
    {
        return juegoGanado;
    }

    public String getDificultad()
    {
        return dificultad;
    }

    public void setDificultad(String dificultad) throws DificultadPalabraException
    {
        this.palabraSeleccionada.validaDificultad(dificultad);
        this.dificultad = dificultad;
    }

    public Ranking getRanking()
    {
        return ranking;
    }

    public void setRanking(Ranking ranking)
    {
        this.ranking = ranking;
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
            this.juegoGanado = true;
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
    
    public String[] getListaJuegos()
    {
        File dir = new File(directorio);
        
        return dir.list(this);
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
    
    public void arriesgarPalabra(String palabra) throws LetraJugadaException, JuegoException
    {
        if(!palabra.isEmpty())
        {
            if(Palabra.existeCaracterEspecial(palabra))
            {
                throw new LetraJugadaException("ERROR. La palabra '" + palabra + "' contiene caracteres especiales");
            }
            else
            {
                this.juegoFinalizado = true;

                if(palabra.equalsIgnoreCase(this.palabraSeleccionada.getPalabra()))
                {
                    this.juegoGanado = true;
                    throw new JuegoGanadoException("FELICITACIONES!! GANASTE EL JUEGO");
                }
                else
                {
                    throw new JuegoPerdidoException("FUISTE DECAPITADO!!");
                }
            }
        }
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
        frmAhorcado ventana = new frmAhorcado(miJuego, 102, 113, 185);
        ventana.setVisible(true);
    }

    public static JuegoAhorcado cargarJuego(String archivoXML) throws FileNotFoundException
    {
        return (JuegoAhorcado) XML.cargar(directorio, archivoXML);
    }

    public void guardarJuegoNuevo(String archivoXML) throws FileNotFoundException, ArchivoException
    {
        try
        {
            XML.guardarNuevo(directorio, archivoXML, this);
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
            XML.guardar(directorio, archivoXML, this);
            this.juegoSinGuardar = false;
        }
        catch (FileNotFoundException e)
        {
            throw new FileNotFoundException();
        }
    }
    
    public void guardarRanking(Puntuacion nuevaPuntuacion) throws FileNotFoundException
    {
        int indice = this.ranking.buscarPuntuacion(nuevaPuntuacion.getJugador());
        
        if(indice < 0)
        {
            this.ranking.agregarPuntuacion(nuevaPuntuacion);
        }
        else
        {
            this.ranking.editarPuntuacion(indice, nuevaPuntuacion);
        }
        
        this.ranking.grabarRanking(Ranking.getARCHIVO_XML());
    }

    @Override
    public boolean accept(File dir, String name)
    {
        return name.endsWith(XML.getExtension());
    }
}
