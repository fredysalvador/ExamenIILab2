/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Orden_Ensamblaje {
    String Tecnico;
    int Computadora;

    public Orden_Ensamblaje(String Tecnico, int Computadora) {
        this.Tecnico = Tecnico;
        this.Computadora = Computadora;
    }

    public String getTecnico() {
        return Tecnico;
    }

    public void setTecnico(String Tecnico) {
        this.Tecnico = Tecnico;
    }

    public int getComputadora() {
        return Computadora;
    }

    public void setComputadora(int Computadora) {
        this.Computadora = Computadora;
    }
    
    
}
