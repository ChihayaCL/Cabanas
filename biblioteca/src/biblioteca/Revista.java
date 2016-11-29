/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * poo2201
 */
public class Revista extends Documento{
    private int volumen, numero;
    private String mes;

    //constructor
    public Revista(int volumen, int numero, String mes, String titulo, String autor, String editorial, int codigo, int acno) {
        super(titulo, autor, editorial, codigo, acno);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }

    //accesadores y mutadores
    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    //mostrar atributos
    @Override
    public String toString() {
        return super.toString() + " Revista{" + "volumen=" + volumen + ", numero=" + numero + ", mes=" + mes + '}';
    }   
}
