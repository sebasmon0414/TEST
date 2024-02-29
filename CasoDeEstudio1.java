/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casodeestudio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class CasoDeEstudio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numeroDeFacturas = JOptionPane.showInputDialog("¿Cuantas facturas desea guardar? "); //acá se solicita la cantidad de facturas que se deben guardar
        int totalFactu = Integer.parseInt(numeroDeFacturas);
        
        int montoFinal =  0; //variable para guardar el monto final a pagar fuera del for
        String anhoFactura = JOptionPane.showInputDialog("Digite el año de las facturas"); //Solicita el año en las que las facturas se agregaron
        
        for (int i = 0; i < totalFactu; i++) { // se solicita los valores de todos los datos necesarios
        String codeFactura = JOptionPane.showInputDialog("Digite el codigo de la factura");
        String montoFactura = JOptionPane.showInputDialog("Digite el monto de la factura");
        String mesFactura = JOptionPane.showInputDialog("Digite el mes de la factura");
        String estadoFactura = JOptionPane.showInputDialog("Digite si la factura esta pagada o sin pagar : 1.Pagada 2.Sin Pagar");
        int estado = Integer.parseInt(estadoFactura);
        int monto = Integer.parseInt(montoFactura);
        
        
            if (estado == 1) { // indica si la factura guardada está sin pagar o pagada
                JOptionPane.showMessageDialog(null,"Factura Pagada");
            } else {
                JOptionPane.showMessageDialog(null,"Factura No Pagada");
            }
            JOptionPane.showMessageDialog(null, "factura: "+i+1+ "\nCodigo de la factura " +": "+ codeFactura + "\n Monto de la factura: "+ montoFactura + "\n Mes de la factura: " + mesFactura + "\n Anho de la Factura: " + anhoFactura);
            
            
            if (estado == 2) { // si la factura está sin pagar, se debe sumar el monto a pagar con las demás facturas y se suman a la variable de apoyo montoFinal
                montoFinal = montoFinal + monto;
            }
        }
        double finalaPagar;
        finalaPagar = ((montoFinal * 0.15) + montoFinal)/4;// realiza la operación solicitada
        JOptionPane.showMessageDialog(null, "Cuota 1 a pagar Marzo del " + anhoFactura + ": " + finalaPagar + "\n Couta 2 a pagar en Abril del "+ anhoFactura +": "+ finalaPagar + "\n Cuota 3 a pagar en Mayo del "+ anhoFactura +": " + finalaPagar+ "\n Cuota 4 a pagar en Junio del "+ anhoFactura+ ": "+ finalaPagar);
           // muestra la cantidad final a pagar
    }
    
    
    
    
}
