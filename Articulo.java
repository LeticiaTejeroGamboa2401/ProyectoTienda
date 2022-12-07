/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

/**
 *
 * @author Leticia Tejero Gamboa
 * @author Jorge Armando Canche
 * @author Emir Alejandro Bellos
 */
public class Articulo {
    public int idArticulo;
    public String nomArticulo;
    public float prePublico;
    public float preProveedor;
    public int puntos;
    public int existencia;
    public int puntosCanje;
    
    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getNomArticulo() {
        return nomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public float getPrePublico() {
        return prePublico;
    }

    public void setPrePublico(float prePublico) {
        this.prePublico = prePublico;
    }

    public float getPreProveedor() {
        return preProveedor;
    }

    public void setPreProveedor(float preProveedor) {
        this.preProveedor = preProveedor;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public int getPuntosCanje() {
        return puntosCanje;
    }

    public void setPuntosCanje(int puntosCanje) {
        this.puntosCanje = puntosCanje;
    }
        
    public Articulo() {
    }
/**
 * 
 * @param idArticulo identificador del articulo
 * @param nomArticulo nombre del articulo
 * @param prePublico precio al publico
 * @param preProveedor precio al proveedor
 * @param puntos puntos por producto
 * @param existencia cantidad de existencia
 * @param puntoscanje  puntos para canjear
 */
    public Articulo(int idArticulo, String nomArticulo, float prePublico, float preProveedor, int puntos, int existencia, int puntoscanje) {
        this.idArticulo = idArticulo;
        this.nomArticulo = nomArticulo;
        this.prePublico = prePublico;
        this.preProveedor = preProveedor;
        this.puntos = puntos;
        this.existencia = existencia;
        this.puntosCanje = puntoscanje;
    }

    @Override
    public String toString() {
        return "Articulo:" + "idArticulo:" + idArticulo + "nomArticulo:" + nomArticulo + "prePublico:" + prePublico + "preProveedor: " + preProveedor + ", puntos:" + puntos + ", existencia:" + existencia + ", puntoscanje:" + puntosCanje;
    }

    int getPuntoscanje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
