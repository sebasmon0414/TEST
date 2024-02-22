/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz2;

/**
 *
 * @author sebas
 */
public class Atributos {

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    private String id;
    private String titulo;
    private String autor;
    private String duracion;
    private String anho;

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setAnho(String anho) {
        this.anho = anho;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getAnho() {
        return anho;
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    }


