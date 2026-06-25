/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenamientos;

import participantes.Participante;

/**
 *
 * @author josea
 */
public class Asistencia {
    private Participante participante;
    private boolean asistencia;

    public Participante getParticipante() {
        return participante;
    }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

    public boolean isAsistencia() {
        return asistencia;
    }

    public void setAsistencia(boolean asistencia) {
        this.asistencia = asistencia;
    }

    public Asistencia(Participante participante, boolean asistencia) {
        this.participante = participante;
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "Asistencia{" + "participante=" + participante + ", asistencia=" + asistencia + '}';
    }
    
    s
    
}
