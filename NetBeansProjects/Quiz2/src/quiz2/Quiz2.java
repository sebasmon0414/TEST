/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Quiz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Atributos generarAtributos = new Atributos ();
       generarAtributos.setId("001");
       generarAtributos.setTitulo("Back To Black");
       generarAtributos.setAutor("Amy Whinehouse");
       generarAtributos.setDuracion("4:01");
       generarAtributos.setAnho("2006");
       
        
        JOptionPane.showMessageDialog(null, "La canción con el ID: " + generarAtributos.getId() + ", es titulada: " + generarAtributos.getTitulo() + ", fue escrita por el/la autor(a): " + generarAtributos.getAutor() + " y tiene una duración de: " + generarAtributos.getDuracion() + ". " +generarAtributos.getTitulo() + " fue lanzada el año:  " + generarAtributos.getAnho() );




    }
    
}
