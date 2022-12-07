/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package proyectotienda;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leticia Tejero Gamboa
 * @author Jorge Armando Canche
 * @author Emir Alejandro Bellos
 */
public interface TiendaInterface {
    List <Cliente> clientes = new ArrayList<>();
    List <Articulo> articulos = new ArrayList<>();
    List <Historial> Historiales = new ArrayList<>();
    List <Venta> ventas = new ArrayList<>();
    
}
