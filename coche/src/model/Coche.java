/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author brendaguapa.joan23
 */
public class Coche {
    String nombre;
    int telefono;
    String color;
    String model;
    String opciones;

    public Coche() {
    }

    public Coche(String nombre, int telefono, String color, String model, String opciones) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.color = color;
        this.model = model;
        this.opciones = opciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOpciones() {
        return opciones;
    }

    public void setOpciones(String opciones) {
        this.opciones = opciones;
    }
    
    
    
    
    
}
