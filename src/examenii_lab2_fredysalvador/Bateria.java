/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Bateria extends Parte{
    String capacidad_hora;
    String material;

    public Bateria(String capacidad_hora, String material, double tiempo_Ensamblaje) {
        super(tiempo_Ensamblaje);
        this.capacidad_hora = capacidad_hora;
        this.material = material;
    }

    public String getCapacidad_hora() {
        return capacidad_hora;
    }

    public void setCapacidad_hora(String capacidad_hora) {
        this.capacidad_hora = capacidad_hora;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTiempo_Ensamblaje() {
        return tiempo_Ensamblaje;
    }

    public void setTiempo_Ensamblaje(double tiempo_Ensamblaje) {
        this.tiempo_Ensamblaje = tiempo_Ensamblaje;
    }

}
