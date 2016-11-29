/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * poo2201
 */
public class Libro extends Documento{
    private boolean prestamo;

    //constructor
    public Libro(boolean prestamo, String titulo, String autor, String editorial, int codigo, int acno) {
        super(titulo, autor, editorial, codigo, acno);
        this.prestamo = prestamo;
    }

    //accesadores y mutadores
    public boolean isPrestamo() {
        return prestamo;
    }

    public void setPrestamo(boolean prestamo) {
        this.prestamo = prestamo;
    }

    //mostrar atributos
    @Override
    public String toString() {
        return super.toString() + " Libro{" + "prestamo=" + prestamo + '}';
    }  
}
