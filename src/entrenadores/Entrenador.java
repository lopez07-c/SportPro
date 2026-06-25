/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenadores;
import Personas.persona;
import java.time.LocalDate;
/**
 *
 * @author josea
 */
public class Entrenador extends persona{
    private int experiencia;
    private String especialidad;
    
    public Entrenador(int experiencia,String especialidad,String nombre, int identificacion,String nacionalidad,LocalDate fechaNaci,int telefono) {
        super(nombre,identificacion, nacionalidad, fechaNaci,telefono);
        this.experiencia=experiencia;
        this.especialidad=especialidad;
    }
        
        public int getExperiencia(){
            return this.experiencia;
        }
        
        public void setExperiencia(int experiencia){
            this.experiencia=experiencia;
        }
}

