/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Pantalla extends Parte{
    String Tactil;
    String Tipo;

    public Pantalla(String Tactil, String Tipo, double tiempo_Ensamblaje) {
        super(tiempo_Ensamblaje);
        this.Tactil = Tactil;
        this.Tipo = Tipo;
    }

    public String getTactil() {
        return Tactil;
    }

    public void setTactil(String Tactil) {
        this.Tactil = Tactil;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getTiempo_Ensamblaje() {
        return tiempo_Ensamblaje;
    }

    public void setTiempo_Ensamblaje(double tiempo_Ensamblaje) {
        this.tiempo_Ensamblaje = tiempo_Ensamblaje;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "Tactil=" + Tactil + ", Tipo=" + Tipo + '}';
    }
    
    
}
