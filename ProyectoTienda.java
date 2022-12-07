/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectotienda;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Leticia Tejero Gamboa
 * @author Jorge Armando Canche
 * @author Emir Alejandro Bellos
 */
public class ProyectoTienda {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     * @throws proyectotienda.PropiaException
     */
    public static void main(String[] args) throws IOException, PropiaException{
        try{
                int menu;

                ControladorArticulo obj1 = new ControladorArticulo();
                ControladorCliente obj2 = new ControladorCliente();
                ControladorHistorial obj3 = new ControladorHistorial();
                ControladorVenta obj4 = new ControladorVenta();
                MejorCliente obj5 = new MejorCliente();
                PuntosPorCliente obj6 = new PuntosPorCliente();
                CanjearPuntos obj7 = new CanjearPuntos();


                do{
                    System.out.println("""
                                       1. Registrar Cliente
                                       2. Registrar Art\u00edculo
                                       3. Realizar Compra""");
                    System.out.println("""
                                       4. Historial de Compras por Clientes
                                       5. Mejor Cliente por rango de fecha
                                       6. Ver puntos acumulados por cliente
                                       7. Canjear Puntos
                                       8. Salir"""); 
                    System.out.println("Opcion: ");

                    Scanner scan=new Scanner(System.in);

                    int opcion;
                    opcion = scan.nextInt();
                    menu = opcion;

                    switch(menu)
                    {
                        case 1 : obj2.AñadirCliente();
                        case 2 : obj1.AgregarArticulo();
                        case 3 : obj4.RealizarCompra();
                        case 4 : obj3.Historial();
                        case 5 : obj5.MejorCliente();
                        case 6 : obj6.PuntosporCliente();
                        case 7 : obj7.CanjearPuntos();
                        default : {
                        }    
                    }

                    System.out.println (" Presione Enter para continuar ..."); 
                    System.in.read ();

                }while(menu != 8);
        }
        catch(java.lang.RuntimeException e){
                System.out.println("Error");
        }
    }
    
}
