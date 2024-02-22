/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String profe = JOptionPane.showInputDialog("Ingrese su nombre");
        
        
        String numClases = JOptionPane.showInputDialog("Digite la cantidad de cursos que lleva desea incluir");
        int clases;
        clases= Integer.parseInt(numClases);
        
        int suma = 0;
        
        for (int i = 1; i <= clases; i++) {
            String valor = JOptionPane.showInputDialog("Digite los montos a pagar de cada curso");
            int valorInt;
            valorInt = Integer.parseInt(valor);
            int sumaDeValores;
            suma += valorInt;
            
        }
            System.out.println(suma + " colones");
            
            double hacienda;
            hacienda = suma * 0.02;
            
            JOptionPane.showMessageDialog(null, profe + ", la cantidad total por pagar a Hacienda es de: " + hacienda + " colones");
            
}
}