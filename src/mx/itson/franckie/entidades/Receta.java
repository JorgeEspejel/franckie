/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.franckie.entidades;

import java.util.List;
import mx.itson.franckie.enumeradores.Dificultad;

/**
 *
 * @author alumnog
 */
public class Receta {

    /**
     * @return the nombre
     */
    private String nombre;
private String desctipcion;
private int duracion;
private int porciones;
private List <Ingredientes> ingredietes;
    private List <Paso> pasos;
    private Dificultad dificultad;
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the desctipcion
     */
    public String getDesctipcion() {
        return desctipcion;
    }

    /**
     * @param desctipcion the desctipcion to set
     */
    public void setDesctipcion(String desctipcion) {
        this.desctipcion = desctipcion;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the porciones
     */
    public int getPorciones() {
        return porciones;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    /**
     * @return the ingredietes
     */
    public List <Ingredientes> getIngredietes() {
        return ingredietes;
    }

    /**
     * @param ingredietes the ingredietes to set
     */
    public void setIngredietes(List <Ingredientes> ingredietes) {
        this.ingredietes = ingredietes;
    }

    /**
     * @return the pasos
     */
    public List <Paso> getPasos() {
        return pasos;
    }

    /**
     * @param pasos the pasos to set
     */
    public void setPasos(List <Paso> pasos) {
        this.pasos = pasos;
    }

    /**
     * @return the dificultad
     */
    public Dificultad getDificultad() {
        return dificultad;
    }

    /**
     * @param dificultad the dificultad to set
     */
    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }
    

}
