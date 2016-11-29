/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * poo2201
 */
public class Documento {
    //atributos
    private String titulo, autor, editorial;
    private int codigo, acno;

    //constructor
    public Documento(String titulo, String autor, String editorial, int codigo, int acno) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.codigo = codigo;
        this.acno = acno;
    }

    //accesadores y mutadores
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAcno() {
        return acno;
    }

    public void setAcno(int acno) {
        this.acno = acno;
    }   

    //mostrar atributos
    @Override
    public String toString() {
        return "Documento{" + "titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", codigo=" + codigo + ", acno=" + acno + '}';
    }   
}
