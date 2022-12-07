/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

import java.util.Scanner;

/**
 *
 * @author Lae Tejero Gamboa
 */
public class ControladorHistorial implements TiendaInterface{
    public void Historial(){
        
        int b=0;
        
        System.out.println("Ingresa la clave del cliente: ");
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        
        for(int j=0; j<clientes.size();j++){
            if(clientes.get(j).getIdCliente()==c){
                                
                int ban=0;
                for(int i=0;i<Historiales.size();i++){
                        if(Historiales.get(i).getIdCli()==c){
                            System.out.println("Clave del Cliente: ");
                            System.out.println(Historiales.get(i).getIdCli());
                            System.out.println("Puntos Acumulados: ");
                            System.out.println(Historiales.get(i).getPunacumulados());
                            System.out.println("Total de Compra: ");
                            System.out.println(Historiales.get(i).getTotalcompra());
                        }
                        ban=1;
                }                
                
                if(ban==0){
                    System.out.println("El Cliente no Tiene Historial de Compras");
                }
            }
            b=1;
        }//Fin del For j
        
        if(b==0){
            System.out.println("No Existe este cliente en la lista");
        }
           
    }
    
    //Buscar por fechas Funcionando ¡CORRECTO!
    public void MejorCliente(){
        
        System.out.println("Ingresa la fecha (yyyy-MM-dd): ");
        Scanner sc = new Scanner(System.in);
        String fech = sc.nextLine();
        
        float max=1;
        int ban=0;
        
        for(int i = 0; i<Historiales.size(); i++){
            if(Historiales.get(i).getFecha() == null ? fech == null : Historiales.get(i).getFecha().equals(fech)){
                float var = Historiales.get(i).getTotalCompra();
                if(var > max){
                    max = var;
                    
                    ban = i;
                }
            }
            
        }
        
        System.out.println(Historiales.get(ban).toString());
    }
    
    //Buscar los puntos acumulados de los clientes ¡CORRECTO!
    public void PuntosporCliente(){
        
        System.out.println("Ingresa la clave del cliente: ");
        Scanner sc=new Scanner(System.in);
        int cla=sc.nextInt();
        
         for(int i=0;i<Historiales.size();i++){
            if(Historiales.get(i).getIdCli()==cla){
                System.out.println("El Cliente: ");
                System.out.println(clientes.get(i).getNomCliente());
                System.out.println("La acumulacion de puntos es de:");
                System.out.println(Historiales.get(i).getPunacumulados());
                break;
            }
        }
    }
}
