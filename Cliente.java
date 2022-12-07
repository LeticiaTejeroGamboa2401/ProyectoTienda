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
public class Cliente {
    public int idCliente;
    public String nomCliente;
    public String apellidoP;
    public int acumulacionPuntos;
    public Direccion direccion;


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public int getAcumulacionPuntos() {
        return acumulacionPuntos;
    }

    public void setAcumulacionPuntos(int acumulacionPuntos) {
        this.acumulacionPuntos = acumulacionPuntos;
    }
    
    public Cliente() {
    }
/**
 * 
 * @param idCliente identificador del cliente
 * @param nomCliente nombre del cliente
 * @param apellidoP apellido paterno
 */
    public Cliente(int idCliente, String nomCliente, String apellidoP) {
        this.idCliente = idCliente;
        this.nomCliente = nomCliente;
        this.apellidoP = apellidoP;
    }
/**
 * 
 * @param idCliente identificador del cliente
 * @param nomCliente nombre del cliente
 * @param apellidoP apellido paterno
 * @param direccion direccion
 */
    public Cliente(int idCliente, String nomCliente, String apellidoP,Direccion direccion) {
        //super(calle, numero, colonia, cp, estado, ciudad, telefono);
        this.direccion = direccion;
        this.idCliente = idCliente;
        this.nomCliente = nomCliente;
        this.apellidoP = apellidoP;
    }

    @Override
    public String toString() {
        return "Cliente:" + "idCliente:" + idCliente + ", nomCliente:" + nomCliente + ", apellidoP:" + apellidoP;
    }
}
