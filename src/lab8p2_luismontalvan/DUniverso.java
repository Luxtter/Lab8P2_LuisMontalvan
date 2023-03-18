/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_luismontalvan;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author luism
 */
public class DUniverso extends ObjectOutputStream{

    public DUniverso() throws IOException {
        super();
    }
    
    public void escribirDocumento(Universo uni){
        try {
            File fichero = new File("Universos.lam");
            FileOutputStream archivo = new FileOutputStream(fichero);
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            escritura.writeObject(archivo);
            escritura.writeObject(uni);
        } catch (Exception e) {
        }
        
    }
    public void leerDocumento() throws ClassNotFoundException, FileNotFoundException, IOException{
       Universo uni; 
        try {
            FileInputStream archivo = new FileInputStream("Universos.lam");
             ObjectInputStream lectura = new ObjectInputStream(archivo);
            uni = (Universo) lectura.readObject();
        } catch (EOFException e) {
            
        }
      
    }
    
    private void añadirADocumento(Universo uni) throws IOException {
        
        Universo univ;
        try {
        try {
            FileInputStream archivo = new FileInputStream("Universos.lam");
             ObjectInputStream lectura = new ObjectInputStream(archivo);
            univ = (Universo) lectura.readObject();
            FileOutputStream archivo2 = new FileOutputStream("Universos.lam");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo2);
            escritura.writeObject(univ);
                    
        } catch (EOFException e) {
            
        }
            FileOutputStream archivo = new FileOutputStream("Universos.lam");
            ObjectOutputStream escritura = new ObjectOutputStream(archivo);
            
            escritura.writeObject(uni);
            escritura.close();
        } catch (Exception e) {
        }
    }
    
}
