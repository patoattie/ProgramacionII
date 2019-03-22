/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

/**
 *
 * @author pattie
 */
public class ModeloTablaRanking extends ModeloTabla
{
    private static final int COL_JUGADOR = 0;
    private static final int COL_FECHA = 1;
    private static final int COL_PUNTAJE = 2;
    private static final int COL_ESTADO = 3;
    private static final int ANCHO_MAXIMO = 750;
    private static final int ANCHO_MINIMO = 100;
    public static final String[] TITULOS_COLUMNAS = {"Jugador", "Fecha", "Puntaje", ""};

    public ModeloTablaRanking(int fila, int columna)
    {
        super(fila, columna);
    }
    
    public static int getCOL_JUGADOR()
    {
        return COL_JUGADOR;
    }

    public static int getCOL_FECHA()
    {
        return COL_FECHA;
    }

    public static int getCOL_ESTADO()
    {
        return COL_ESTADO;
    }

    public static int getCOL_PUNTAJE()
    {
        return COL_PUNTAJE;
    }

    public static int getANCHO_MAXIMO()
    {
        return ANCHO_MAXIMO;
    }

    public static int getANCHO_MINIMO()
    {
        return ANCHO_MINIMO;
    }

    public String getJugador(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaString(fila, ModeloTablaRanking.getCOL_JUGADOR());
    }
    
    public void setJugador(String valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, ModeloTablaRanking.getCOL_JUGADOR());
    }
    
    public String getFecha(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaString(fila, ModeloTablaRanking.getCOL_FECHA());
    }
    
    public void setFecha(String valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, ModeloTablaRanking.getCOL_FECHA());
    }
    
    public int getPuntaje(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaInteger(fila, ModeloTablaRanking.getCOL_PUNTAJE());
    }
    
    public void setPuntaje(int valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, ModeloTablaRanking.getCOL_ESTADO());
    }
    
    public String getEstado(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaString(fila, ModeloTablaRanking.getCOL_ESTADO());
    }
    
    public void setEstado(String valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, ModeloTablaRanking.getCOL_ESTADO());
    }
    
    @Override
    public boolean isCellEditable(int fila, int columna)
    {
        return false;
    }

    @Override
     public Class<?> getColumnClass(int i)
    {
        Class<?> claseCelda;
        
        if(i == ModeloTablaRanking.getCOL_PUNTAJE())
        {
            claseCelda = Integer.class;
        }
        else
        {
            claseCelda = String.class;
        }
        
        return claseCelda;
    }
}
