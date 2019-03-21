/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcialdoslii;

/**
 *
 * @author Sil y Pato
 */
public interface DiccionarioAptoAhorcado
{
    public abstract Palabra getPalabraAleatoria(String dificultad) throws DiccionarioVacioException;
}
