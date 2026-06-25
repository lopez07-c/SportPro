/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package disiplinas;

/**
 *
 * @author UTN
 */
public enum categoria {
    INFANTIL("Infantil"),
    JUVENIL("Juvenil"),
    ADULTA("Adulta");

    private final String nombre;

    categoria(String nombre) {
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

