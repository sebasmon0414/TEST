/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizfinal;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Proce {
    public void AgregarProd(Prod[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            String nomProd = JOptionPane.showInputDialog(null, "Agregue el nombre del producto a ingresar");
            int codProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Agregue el codigo del producto a ingresar"));
            int tipoProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoja el tipo de producto ;" + "\n 1.Alimentos" + "n 2.Bebidas" + "\n 3.Higiene" + "\n 4.Limpieza"));
            int precBase = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio base que tendra el producto"));
            int cantProd = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad unidades del producto que desea agregar:"));
            double precBrut = 0;
            String nomEmple = JOptionPane.showInputDialog(null, "Digite su nombre");
            int cedEmple= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su cedula"));
                                
            if (tipoProd == 1) {
                precBrut = precBase * 0.2 + precBase;
                JOptionPane.showMessageDialog(null, "El precio bruto del producto es : " + precBrut);
            } else if (tipoProd == 2) {
                precBrut = precBase * 0.3 + precBase;
                JOptionPane.showMessageDialog(null, "El precio bruto del producto es : " + precBrut);
            } else if (tipoProd == 3) {
                precBrut = precBase * 0.25 + precBase + 500;
                JOptionPane.showMessageDialog(null, "El precio bruto del producto es : " + precBrut);
            } else if (tipoProd == 4) {
                precBrut = precBase * 0.19 + precBase * 0.04 + 1000 + precBase;
                JOptionPane.showMessageDialog(null, "El precio bruto del producto es : " + precBrut);
            } else {
                JOptionPane.showInputDialog("Digite un numero válido de tipo");
            }
                        double ganancias = ((precBrut-precBase)*cantProd);

            arreglo[i] = new Prod(nomProd, codProd, tipoProd, precBase, cantProd, precBrut, ganancias, nomEmple, cedEmple);

        }

    }
    
    public void MostrarDatos(Prod[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            JOptionPane.showMessageDialog(null, "Codigo del producto: " + arreglo[i].getCodProd() + "\n" + "Nombre del producto: " + arreglo[i].getNomProd() + "\n" + "Nombre del empleado: " + arreglo[i].getNomEmple() + "\n" + "Cedula del empleado: " + arreglo[i].getCedEmple() + "\n" + "Precio base del producto: " + arreglo[i].getPrecBase() + "\n" + "Tipo de producto: " + arreglo[i].getTipoProd() + "\n" + "Precio bruto del producto: " + arreglo[i].getPrecBrut() + "\n" + "Ganancia estimada: " + arreglo[i].getGanancias());
        }
    }
    
}
