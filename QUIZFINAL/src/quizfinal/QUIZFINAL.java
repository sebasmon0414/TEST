/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class QUIZFINAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int leng = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos que desea agregar"));
        Prod arrProd[] = new Prod[leng];
        Proce proce = new Proce();
        proce.AgregarProd(arrProd);
        proce.MostrarDatos(arrProd);

        }
    
}
