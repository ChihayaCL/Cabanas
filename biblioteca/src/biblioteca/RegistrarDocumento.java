/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * poo2201
 */
public class RegistrarDocumento {
    //declarar colección documentos que almacena objetos 
    //de la clase Documento
    static ArrayList<Documento> documentos;

    //crear colección
    public RegistrarDocumento() {
        documentos = new ArrayList<Documento>();
    }

    //agregar Documento a la colección sino existe, retorna true si lo agrega y false sino lo agrega
    public static boolean agregarDocumento(Documento nuevoDocumento) {
        if (verificarDocumento(nuevoDocumento.getCodigo()) == false) {
            documentos.add(nuevoDocumento);
            return true;
        } else{
            return false;
        }
    }

    //retorna Documentos almacenados en la colección
    public static String listar() {
        String datos = "";
        for (Documento temporalDocumento : documentos) {
            datos = datos + temporalDocumento.toString() + "\n";
        }
        return datos;
    }

    //método que devuelve true si el Documento se encuentra
    //en la colección sino retorna false
    public static boolean verificarDocumento(int codigo) {
        boolean valida = false;
        for (Documento temporalDocumento : documentos) {
            if (temporalDocumento.getCodigo() == codigo) {
                valida = true;
                break;
            }
        }
        return valida;
    }

    //eliminar documentos por código
    public static boolean eliminarDocumento(int codigo) {
        boolean valida = false;
        for (int i = 0; i < documentos.size(); i++) {
            if (documentos.get(i).getCodigo() == codigo) {
                documentos.remove(i);
                valida = true;
                break;
            }            
        }   
        return valida;
    }
}
