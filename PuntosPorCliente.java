/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

import java.util.Scanner;

/**
 *
 * @author Leticia Tejero Gamboa
 * @author Jorge Armando Canche
 * @author Emir Bellos
 */
public class PuntosPorCliente implements TiendaInterface {
    public void PuntosporCliente(){
        
        System.out.println("Ingresa la clave del cliente: ");
        Scanner sc=new Scanner(System.in);
        int cla=sc.nextInt();
        
         for(int i=0; i < Historiales.size();i++){
            if(Historiales.get(i).getIdCli()==cla){
                System.out.println("El Cliente: ");
                System.out.println(clientes.get(i).getNomCliente());
                System.out.println("La acumulacion de puntos es de:");
                System.out.println(Historiales.get(i).getPunAcumulados());
                break;
            }
        }
    }
}
