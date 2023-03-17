/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luismontalvan;

/**
 *
 * @author luism
 */
public class SerVivo {
    private String nombre, uProcedencia, raza;
    private int id, anos, poder;

    public SerVivo() {
    }

    public SerVivo(String nombre, String uProcedencia, String raza, int id, int anos, int poder) {
        this.nombre = nombre;
        this.uProcedencia = uProcedencia;
        this.raza = raza;
        this.id = id;
        this.anos = anos;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getuProcedencia() {
        return uProcedencia;
    }

    public void setuProcedencia(String uProcedencia) {
        this.uProcedencia = uProcedencia;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnos() {
        return anos;
    }

    public void setAnos(int anos) {
        this.anos = anos;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
