/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author A17016274
 */
class Event {
    private String peticion;
    private Object contenido;
    
    public Event(String peticion, Object contenido){
        this.peticion = peticion;
        this.contenido = contenido;
    }
    
    public void setPeticion(String peticion){
        this.peticion = peticion;
    }
    public String getPeticion(){
        return peticion;
    }
    
    public void setContenido(Object contenido){
        this.contenido = contenido;
    }
    public Object getContenido(){
        return contenido;
    }
}
