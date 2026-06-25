/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package participantes;

import Personas.persona;
import java.time.LocalDate;

/**
 *
 * @author sharys
 */
public class Participante extends persona{
     
    public Participante (String nombre, int identificación,String nacionalidad, LocalDate fechaNaci, int telefono){
        super (nombre, identificación, nacionalidad, fechaNaci,telefono); 
      
    }
}
