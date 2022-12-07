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
 * @author Emir Alejandro Bellos
 */
public class ControladorCliente implements TiendaInterface{

    
    public void AñadirCliente()throws PropiaException{
        System.out.println("Identificador del cliente: ");
        Scanner sc= new Scanner(System.in);
        int ide = sc.nextInt();
        if((ide < 4) && (ide > 4)){
            throw new PropiaException("Error: El número de ID es distinto a 4 dígitos.");
        }
        
        System.out.println("Nombre del cliente: ");
        Scanner sc1= new Scanner(System.in);
        String nom=sc1.nextLine();
        
        System.out.println("Apellido del Cliente: ");
        Scanner sc2= new Scanner(System.in);
        String ape=sc2.nextLine();
        
        System.out.println("Calle: ");
        Scanner sc3= new Scanner(System.in);
        int calle=sc3.nextInt();
        
        System.out.println("Número de casa: ");
        Scanner sc4= new Scanner(System.in);
        int num=sc4.nextInt();
              
        System.out.println("Colonia: ");
        Scanner sc5= new Scanner(System.in);
        String col=sc5.nextLine();
        
        System.out.println("Codigo Postal: ");
        Scanner sc6= new Scanner(System.in);
        int cp=sc6.nextInt();
        if((cp < 5) && (cp > 5)){
            throw new PropiaException("Error: El códgio postal es incorrecto.");
        }
        
        System.out.println("Ciudad: ");
        Scanner sc7= new Scanner(System.in);
        String ciudad=sc7.nextLine();
        
        System.out.println("Estado: ");
        Scanner sc8= new Scanner(System.in);
        String estado=sc8.nextLine();
        
        
        System.out.println("Teléfono: ");
        Scanner sc9= new Scanner(System.in);
        long tel=sc9.nextLong();
        if((tel < 10) && (tel > 10)){
            throw new PropiaException("Error: La cantidad de dígitos es menor o mayor a los 10 dígitos.");
        }
        
        Direccion direccion = new Direccion(calle, num, col, cp, ciudad, estado, tel);
        Cliente c1= new Cliente(ide, nom, ape, direccion);
        
        clientes.add(c1);
    }
    
}
