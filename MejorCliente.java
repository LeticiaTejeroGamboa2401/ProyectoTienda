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
public class MejorCliente implements TiendaInterface{
    
    public void MejorCliente(){
        
        System.out.println("Ingresa la fecha (yyyy-MM-dd): ");
        Scanner sc=new Scanner(System.in);
        String fech=sc.nextLine();
        
        float max=1;
        int ban=0;
        
        for(int i=0; i < Historiales.size();i++){
            if(Historiales.get(i).getFecha() == null ? fech == null : Historiales.get(i).getFecha().equals(fech)){
                float var=Historiales.get(i).getTotalCompra();
                if(var>max){
                    max=var;
                    
                    ban=i;
                }
            }
            
        }
        
        System.out.println(Historiales.get(ban).toString());
    }
}
