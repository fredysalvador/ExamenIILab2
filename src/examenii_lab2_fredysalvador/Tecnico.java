/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Tecnico {
    String nombre;
    int edad;
    String Genero;
    int cant_comp_ensambl;

    public Tecnico(String nombre, int edad, String Genero, int cant_comp_ensambl) {
        this.nombre = nombre;
        this.edad = edad;
        this.Genero = Genero;
        this.cant_comp_ensambl = cant_comp_ensambl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getCant_comp_ensambl() {
        return cant_comp_ensambl;
    }

    public void setCant_comp_ensambl(int cant_comp_ensambl) {
        this.cant_comp_ensambl = cant_comp_ensambl;
    }
    
    
    
}
