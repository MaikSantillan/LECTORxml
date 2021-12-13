/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsax;

/**
 *
 * @author user
 */
class Version {
    
    private double numero;
    private String nombre;
    private int api; 

    public Version() {
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getApi() {
        return api;
    }

    public void setApi(int apli) {
        this.api = apli;
    }

    @Override
    public String toString() {
        return "Version{" + "numero=" + numero + ", nombre=" + nombre + ", apli=" + api + '}';
    }
    
    
}
