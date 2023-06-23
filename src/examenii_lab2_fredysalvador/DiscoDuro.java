/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class DiscoDuro extends Parte{
      String tamaño;
    String marca;

    public DiscoDuro(String tamaño, String marca, double tiempo_Ensamblaje) {
        super(tiempo_Ensamblaje);
        this.tamaño = tamaño;
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTiempo_Ensamblaje() {
        return tiempo_Ensamblaje;
    }

    public void setTiempo_Ensamblaje(double tiempo_Ensamblaje) {
        this.tiempo_Ensamblaje = tiempo_Ensamblaje;
    }
    
    
}
