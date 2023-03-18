/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luismontalvan;

import java.util.ArrayList;
import java.io.Serializable;
/**
 *
 * @author luism
 */
public class Universo implements Serializable{
    
    private String nombre;
    private int cantidad;
    ArrayList<SerVivo> seresVivos = new ArrayList();

    public Universo() {
    }

    public Universo(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public ArrayList<SerVivo> getSeresVivos() {
        return seresVivos;
    }

    public void setSeresVivos(ArrayList<SerVivo> seresVivos) {
        this.seresVivos = seresVivos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
