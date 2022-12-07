/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

/**
 *
 * @author Leticia Tejero Gamboa
 * @author Jorge Armando Canche
 * @author Emir Bellos
 */

public class Venta {
    public String artNom;
    public int cantidad;
    public float precio;
    public float subtotal;
    public int point;

    public String getArtNom() {
        return artNom;
    }

    public void setArtNom(String artNom) {
        this.artNom = artNom;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public Venta() {
    }
/**
 * 
 * @param artNom nombre del articulo
 * @param cantidad cantidad que se desea comprar
 * @param precio precio del producto
 * @param subtotal subtotal
 * @param point puntos
 */
    public Venta(String artNom, int cantidad, float precio, float subtotal, int point) {
        this.artNom = artNom;
        this.cantidad = cantidad;
        this.precio = precio;
        this.subtotal = subtotal;
        this.point = point;
    }
}
