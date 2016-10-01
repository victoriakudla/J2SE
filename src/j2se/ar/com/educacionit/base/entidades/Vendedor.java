/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2se.ar.com.educacionit.base.entidades;

/**
 *
 * @author educacionit
 */
public class Vendedor extends Persona {
    private int cantAutosVendido;

    public int getCantAutosVendido() {
        return cantAutosVendido;
    }

    public void setCantAutosVendido(int cantAutosVendido) {
        this.cantAutosVendido = cantAutosVendido;
    }

    public Vendedor(int cantAutosVendido, String nombre, String apellido, String numeroDocumento) {
        super(nombre, apellido, numeroDocumento);
        this.cantAutosVendido = cantAutosVendido;
    }

    @Override
    public String toString() {
        return "Vendedor{"+super.toString() + "cantAutosVendido=" + cantAutosVendido + '}';
    }




    
}
