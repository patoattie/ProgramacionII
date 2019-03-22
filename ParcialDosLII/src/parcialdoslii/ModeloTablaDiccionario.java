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
public class ModeloTablaDiccionario extends ModeloTabla implements TablaDiccionarioAptaAhorcado
{
    private static final int COL_PALABRA = 0;
    private static final int COL_DEFINICION = 1;
    private static final int COL_ESTADO = 2;
    private int colDificultad;
    private static final int ANCHO_MAXIMO = 750;
    private static final int ANCHO_MINIMO = 100;
    public static final String[] TITULOS_COLUMNAS = {"Palabra", "Definición", "", "Dificultad"};

    public ModeloTablaDiccionario(int fila, int columna)
    {
        super(fila, columna);
        this.setColDificultad(-1);
    }
    
    public static int getCOL_PALABRA()
    {
        return COL_PALABRA;
    }

    public static int getCOL_DEFINICION()
    {
        return COL_DEFINICION;
    }

    public static int getCOL_ESTADO()
    {
        return COL_ESTADO;
    }

    public static int getANCHO_MAXIMO()
    {
        return ANCHO_MAXIMO;
    }

    public static int getANCHO_MINIMO()
    {
        return ANCHO_MINIMO;
    }

    public String getPalabra(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaString(fila, ModeloTablaDiccionario.getCOL_PALABRA());
    }
    
    public void setPalabra(String valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, ModeloTablaDiccionario.getCOL_PALABRA());
    }
    
    public String getDefinicion(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaString(fila, ModeloTablaDiccionario.getCOL_DEFINICION());
    }
    
    public void setDefinicion(String valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, ModeloTablaDiccionario.getCOL_DEFINICION());
    }
    
    public String getEstado(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaString(fila, ModeloTablaDiccionario.getCOL_ESTADO());
    }
    
    public void setEstado(String valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, ModeloTablaDiccionario.getCOL_ESTADO());
    }
    
    public boolean existePalabra(String unaPalabra) throws ExistePalabraException
    {
        boolean retorno = false;
        
        for (int i = 0; i < this.getRowCount(); i++)
        {
            if(this.getEstado(i).equals(ModeloTablaDiccionario.getINSERTA()) && this.getPalabra(i).equalsIgnoreCase(unaPalabra))
            {
                retorno = true;
                break;
            }
        }
        
        if(retorno)
        {
            throw new ExistePalabraException("ERROR. La palabra '" + unaPalabra + "' ya existe en el Diccionario");
        }
        
        return retorno;
    }

    @Override
    public boolean isCellEditable(int fila, int columna)
    {
        return false;
    }

    @Override
     public Class<?> getColumnClass(int i)
    {
        return String.class;
    }

    @Override
    public int getColDificultad()
    {
        return this.colDificultad;
    }

    @Override
    public void setColDificultad(int posicionColumna)
    {
        this.colDificultad = posicionColumna;
    }

    @Override
    public String getDificultad(int fila) throws IndexOutOfBoundsException
    {
        return this.getCeldaString(fila, this.getColDificultad());
    }

    @Override
    public void setDificultad(String valor, int fila) throws IndexOutOfBoundsException
    {
        this.setCelda(valor, fila, this.getColDificultad());
    }
}
