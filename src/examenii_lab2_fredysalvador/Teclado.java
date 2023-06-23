/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Teclado extends Parte{
    
    String Material;
    String Color;

    public Teclado(String Material, String Color, double tiempo_Ensamblaje) {
        super(tiempo_Ensamblaje);
        this.Material = Material;
        this.Color = Color;
    }
    

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public double getTiempo_Ensamblaje() {
        return tiempo_Ensamblaje;
    }

    public void setTiempo_Ensamblaje(double tiempo_Ensamblaje) {
        this.tiempo_Ensamblaje = tiempo_Ensamblaje;
    }
    
    
    
    
    
}
