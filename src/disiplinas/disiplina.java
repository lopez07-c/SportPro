/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package disiplinas;

/**
 *
 * @author UTN
 */
public class disiplina {
    private desiplina2 deporte;
    private categoria categoria;
    private int capacidadMaxima;
    private int cantidadInscritos;
    private String responsable;

    public disiplina(desiplina2 deporte, categoria categoria, int capacidadMaxima, String responsable) {
        this.deporte = deporte;
        this.categoria = categoria;
        this.capacidadMaxima = capacidadMaxima;
        this.responsable = responsable;
        this.cantidadInscritos = 0;
    }

    public boolean inscribirParticipante() {
        if (hayEspaciosDisponibles()) {
            cantidadInscritos++;
            return true;
        }
        System.out.println("No hay espacios disponibles en " + deporte.getNombre());
        return false;
    }

    public boolean hayEspaciosDisponibles() {
        return cantidadInscritos < capacidadMaxima;
    }

    public boolean alcanzaCapacidadMaxima() {
        return cantidadInscritos >= capacidadMaxima;
    }

   
    public desiplina2 getDeporte(
    )     { return deporte; }
    
    public String getNombre(
    )         { return deporte.getNombre(); }
    
    public categoria getCategoria(
    )   { return categoria; }
    
    public int getCapacidadMaxima(
    )   { return capacidadMaxima; }
    
    public int getCantidadInscritos(
    ) { return cantidadInscritos; }
    
    public String getResponsable(
    )    { return responsable; }

   
    public void setDeporte(desiplina2 deporte)    
    { this.deporte = deporte; }
    
    public void setCategoria(categoria categoria)  
    { this.categoria = categoria; }
    
    public void setCapacidadMaxima(int capacidadMaxima)
    { this.capacidadMaxima = capacidadMaxima; }
    
    public void setResponsable(String responsable) 
    { this.responsable = responsable; }

    @Override
    public String toString() {
        return "=== Disciplina: " + deporte.getNombre() + " ===" +
               "\n  Categoría:   " + categoria.getNombre() +
               "\n  Responsable: " + responsable +
               "\n  Inscritos:   " + cantidadInscritos + "/" + capacidadMaxima +
               "\n  Disponible:  " + hayEspaciosDisponibles();
    }
} 


