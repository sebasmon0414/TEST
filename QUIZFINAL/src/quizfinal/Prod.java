/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quizfinal;

/**
 *
 * @author sebas
 */
public class Prod {

    public String getNomProd() {
        return nomProd;
    }

    public int getCodProd() {
        return codProd;
    }

    public int getTipoProd() {
        return tipoProd;
    }

    public double getPrecBase() {
        return precBase;
    }

    public int getCantProd() {
        return cantProd;
    }

    public double getPrecBrut() {
        return precBrut;
    }

    public double getGanancias() {
        return ganancias;
    }

    public String getNomEmple() {
        return nomEmple;
    }

    public int getCedEmple() {
        return cedEmple;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public void setTipoProd(int tipoProd) {
        this.tipoProd = tipoProd;
    }

    public void setPrecBase(double precBase) {
        this.precBase = precBase;
    }

    public void setCantProd(int cantProd) {
        this.cantProd = cantProd;
    }

    public void setPrecBrut(double precBrut) {
        this.precBrut = precBrut;
    }

    public void setGanancias(double ganancias) {
        this.ganancias = ganancias;
    }

    public void setNomEmple(String nomEmple) {
        this.nomEmple = nomEmple;
    }

    public void setCedEmple(int cedEmple) {
        this.cedEmple = cedEmple;
    }

    public Prod(String nomProd, int codProd, int tipoProd, double precBase, int cantProd, double precBrut, double ganancias, String nomEmple, int cedEmple) {
        this.nomProd = nomProd;
        this.codProd = codProd;
        this.tipoProd = tipoProd;
        this.precBase = precBase;
        this.cantProd = cantProd;
        this.precBrut = precBrut;
        this.ganancias = ganancias;
        this.nomEmple = nomEmple;
        this.cedEmple = cedEmple;
    }

   
    public String nomProd;
    public int codProd;
    public int tipoProd;
    public double precBase;
    public int cantProd;
    public double precBrut;
    public double ganancias;
    public String nomEmple;
    public int cedEmple;
    
}
