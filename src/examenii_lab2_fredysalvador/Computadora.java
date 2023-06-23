/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenii_lab2_fredysalvador;

/**
 *
 * @author Fredy Salvador
 */
public class Computadora {
    
    String num_serie;
    int year;
    String Color;
    String Material;
    String Ram;
    String Disco_Duro;
    String Bateria;
    String Teclado;
    String Pantalla;
    String Procesador;

    public Computadora(String num_serie, int year, String Color, String Material, String Ram, String Disco_Duro, String Bateria, String Teclado, String Pantalla, String Procesador) {
        this.num_serie = num_serie;
        this.year = year;
        this.Color = Color;
        this.Material = Material;
        this.Ram = Ram;
        this.Disco_Duro = Disco_Duro;
        this.Bateria = Bateria;
        this.Teclado = Teclado;
        this.Pantalla = Pantalla;
        this.Procesador = Procesador;
    }

    public String getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(String num_serie) {
        this.num_serie = num_serie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String Ram) {
        this.Ram = Ram;
    }

    public String getDisco_Duro() {
        return Disco_Duro;
    }

    public void setDisco_Duro(String Disco_Duro) {
        this.Disco_Duro = Disco_Duro;
    }

    public String getBateria() {
        return Bateria;
    }

    public void setBateria(String Bateria) {
        this.Bateria = Bateria;
    }

    public String getTeclado() {
        return Teclado;
    }

    public void setTeclado(String Teclado) {
        this.Teclado = Teclado;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }
    
    
    
    
}
