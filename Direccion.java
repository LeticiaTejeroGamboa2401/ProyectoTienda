/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

/**
 *
 * @author Leticia Tejero Gamboa
 * @author Jorge Armando Canche
 * @author Emir Ãlejanndro Bellos
 */
class Direccion {
    public int calle;
    public int numero;
    public String colonia;
    public int cp;
    public String estado;
    public String ciudad;
    public long telefono;

    
    public int getCalle() {
        return calle;
    }

    public void setCalle(int calle) {
        this.calle = calle;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

/**
 * 
 * @param calle calle
 * @param numero numero de casa
 * @param colonia colonia
 * @param cp codigo postal
 * @param estado estado
 * @param ciudad ciudad
 * @param telefono telefono
 */
    public Direccion(int calle, int numero, String colonia, int cp, String estado, String ciudad, long telefono) {
        this.calle = calle;
        this.numero = numero;
        this.colonia = colonia;
        this.cp = cp;
        this.estado = estado;
        this.ciudad = ciudad;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Direccion:" + "calle:" + calle + "numero:" + numero + "colonia:" + colonia + "cp:" + cp + "estado:" + estado + "ciudad:" + ciudad + ", telefono:" + telefono;
    }
}
