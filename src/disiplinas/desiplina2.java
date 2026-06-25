/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package disiplinas;

/**
 *
 * @author UTN
 */
   public enum desiplina2 {
    FUTBOL("Fútbol"),
    BALONCESTO("Baloncesto"),
    VOLEIBOL("Voleibol"),
    NATACION("Natación"),
    ATLETISMO("Atletismo");

    private final String nombre;

    desiplina2(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}



    

