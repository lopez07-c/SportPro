/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenamientos;

import java.time.LocalDate;
import java.time.LocalTime;
import disiplinas.disiplina;

/**
 *
 * @author josea
 */
public class Entrenamiento {
    private LocalDate fecha;
    private LocalTime horaInicio;
    private int duracion;
    private disiplina disiplina;

    
    public Entrenamiento(LocalDate fecha, LocalTime horaInicio, int duracion, disiplina disiplina) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.duracion = duracion;
        this.disiplina = disiplina;
    }
    
    public String getNombreDisciplina() {
        return disiplina.getNombre();
    }
    
    public disiplina getDisciplina() {
        return disiplina;
    }
    
    
}
