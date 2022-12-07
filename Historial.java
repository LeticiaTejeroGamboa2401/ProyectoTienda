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
public class Historial {
    
   public int idCli;
   public String fecha;
   public float totalCompra;
   public int punAcumulados;

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public float getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(float totalCompra) {
        this.totalCompra = totalCompra;
    }

    public int getPunAcumulados() {
        return punAcumulados;
    }

    public void setPunAcumulados(int punAcumulados) {
        this.punAcumulados = punAcumulados;
    }

    
/**
 * 
 * @param idCli identificador del cliente
 * @param totalCompra cantidad total comprado
 * @param punAcumulados puntos acumulados totales
 * @param fecha fecha de la compra
 */
    public Historial(int idCli, float totalCompra, int punAcumulados, String fecha) {
        this.idCli = idCli;
        this.fecha = fecha;
        this.totalCompra = totalCompra;
        this.punAcumulados = punAcumulados;
    }

    @Override
    public String toString() {
        return "Historial: " + "idCliente: " + idCli + ", fecha=" + fecha + ", totalcompra=" + totalCompra + ", punacumulados=" + punAcumulados;
    }

    boolean getPunacumulados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean getTotalcompra() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
