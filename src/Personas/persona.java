/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personas;

import java.time.LocalDate;

/**
 *
 * @author UTN
 */
public class persona {
    protected String nombre;
    protected int identificación;
    protected String nacionalidad;
    protected LocalDate fechaNaci;
    protected int telefono;

    public String getNombre() {
        return nombre;
    }

    public int getIdentificación() {
        return identificación;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNaci() {
        return fechaNaci;
    }

    public int getTelefono() {
        return telefono;
        
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public persona(String nombre, int identificación, String nacionalidad, LocalDate fechaNaci, int telefono) {
        this.nombre = nombre;
        this.identificación = identificación;
        this.nacionalidad = nacionalidad;
        this.fechaNaci = fechaNaci;
        this.telefono = telefono;
    }
    
    
    
    
    public LocalDate getFecha(){
        return this.fechaNaci;
    }
    public int calcularEdad(){
        LocalDate hoy =LocalDate.now();
        return java.time.Period.between(fechaNaci, hoy).getYears();
    }
      @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", fechaNaci=" + fechaNaci + '}';
    }
}
