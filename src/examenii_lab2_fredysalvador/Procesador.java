/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Procesador extends Parte{
    int num_nucleos;
    String Velocidad;

    public Procesador(int num_nucleos, String Velocidad, double tiempo_Ensamblaje) {
        super(tiempo_Ensamblaje);
        this.num_nucleos = num_nucleos;
        this.Velocidad = Velocidad;
    }

    public int getNum_nucleos() {
        return num_nucleos;
    }

    public void setNum_nucleos(int num_nucleos) {
        this.num_nucleos = num_nucleos;
    }

    public String getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(String Velocidad) {
        this.Velocidad = Velocidad;
    }

    public double getTiempo_Ensamblaje() {
        return tiempo_Ensamblaje;
    }

    public void setTiempo_Ensamblaje(double tiempo_Ensamblaje) {
        this.tiempo_Ensamblaje = tiempo_Ensamblaje;
    }

    @Override
    public String toString() {
        return "Procesador{" + "num_nucleos=" + num_nucleos + ", Velocidad=" + Velocidad + '}';
    }
    
    
}
