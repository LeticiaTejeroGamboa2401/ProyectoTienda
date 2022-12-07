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
public class ControladorArticulo implements TiendaInterface {
    
    public void AgregarArticulo(){
        System.out.println("Identificador del Articulo: ");
        Scanner sc= new Scanner(System.in);
        int ide=sc.nextInt();
        
        System.out.println("Nombre del Articulo: ");
        Scanner sc1= new Scanner(System.in);
        String nom=sc1.nextLine();
        
        System.out.println("Precio al Publico: ");
        Scanner sc2= new Scanner(System.in);
        float pub=sc2.nextFloat();
              
        System.out.println("Precio al Proveedor: ");
        Scanner sc3= new Scanner(System.in);
        float pro=sc3.nextFloat();
         
        System.out.println("Puntos del Articulo: ");
        Scanner sc4= new Scanner(System.in);
        int pun=sc4.nextInt();
        
        System.out.println("Puntos para cambiar este producto por el cliente: ");
        Scanner sc6= new Scanner(System.in);
        int puncanje=sc6.nextInt();
        
        System.out.println("Cantidad Existente: ");
        Scanner sc5= new Scanner(System.in);
        int ex=sc5.nextInt();
        
        Articulo a1= new Articulo(ide, nom, pub, pro, pun, ex, puncanje);
        
        articulos.add(a1);       
    }

    
}
