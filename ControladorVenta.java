/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lae Tejero Gamboa
 */
public class ControladorVenta implements TiendaInterface{
    public void RealizarCompra(){
        int b = 0;
        int suma = 0;
        int unidad = 0;
        int nuevo = 0;
        int cb = 0;
        int point = 0;
        float subtotal = 0;
        float precio = 0;
        String nom = "";
        
        System.out.println("Clave del Cliente: ");
        Scanner sc4=new Scanner(System.in);
        int clave=sc4.nextInt();
        
        //REALIZAR COMPRA ¡CORRECTO!
        
        int bandera=0;
        
        for(int j=0; j<clientes.size();j++){
            if(clientes.get(j).getIdCliente()==clave){
             cb=j;
             bandera=1;
            }//Fin del if
            
            
        }//Fin del for j
               
        if(bandera==0){
                System.out.println("El cliente no esta en la lista");
        }
    
       
        
                do{

                    System.out.println("Identificador del Articulo Comprado: ");
                    Scanner sc= new Scanner(System.in);
                    int art=sc.nextInt();

                    int ba=0;

                    for(int i=0;i<articulos.size();i++){
                        if(articulos.get(i).getIdArticulo()==art){

                            System.out.println("Cantidad: ");
                            Scanner sc2=new Scanner(System.in);
                            int can=sc2.nextInt();

                            if(articulos.get(i).getExistencia()<=0 || articulos.get(i).getExistencia()<can){
                                System.out.println("El articulo no tiene unidades suficientes");
                            }

                            if(articulos.get(i).getExistencia()>0 && articulos.get(i).getExistencia()>can){

                                int existente= articulos.get(i).getExistencia()- can;                     
                                articulos.get(i).setExistencia(existente);
                                
                                nom=articulos.get(i).getNomArticulo();
                                precio=articulos.get(i).getPrePublico();
                                unidad=can;                               
                                subtotal= precio*unidad;
                                point=articulos.get(i).getPuntos();
                                
                            }

                        }
                        ba=1;

                    }

                    if(ba==0){
                        System.out.println("\nEl articulo no existe en la lista\n");
                    }
                    
                    //Agregar ArrayList ventas
                    
                    Venta v1= new Venta(nom,unidad,precio,subtotal, point);
                    ventas.add(v1);
                    
                    System.out.println("Desea Agregar otro Articulo: ");
                    Scanner sc1=new Scanner(System.in);
                    String opcion=sc1.nextLine();

                    if("si".equals(opcion)){
                        b = 1;
                    }

                    if("no".equals(opcion)){
                        b = 0;
                    }

                }while(b == 1); //FIN DE REALIZAR COMPRA ¡CORRECTO!

                //IMPRIMIR TICKET

                float total = 0, t;
                int puntos = 0, acumulacion = 0, p;

                System.out.println("Articulos: " );
                System.out.println("\n");

                //Proceso para calcular precio de productos e Imprimri nombres
                for(int i=0; i<ventas.size();i++){
                
                    System.out.println("Articulo: "+ventas.get(i).getArtNom());
                    System.out.println("Unidad: "+ventas.get(i).getCantidad());
                    System.out.println("Precio: "+ventas.get(i).getPrecio());
                    //calcular importe
                    t=ventas.get(i).getSubtotal();
                    total=t+total;
                    //Acumulacion de puntos
                    p=ventas.get(i).getPoint();
                    puntos=(p*unidad)+puntos;
                }
                
                int anterior=clientes.get(cb).getAcumulacionPuntos();
                //System.out.println("ver  " + anterior);
                int n= anterior + puntos;
                //System.out.println("ver2  " + n);
                clientes.get(cb).setAcumulacionPuntos(n);
                nuevo= clientes.get(cb).getAcumulacionPuntos();

                System.out.println("Importe Total: " + total);
                System.out.println("Puntos de la compra: " + puntos);
                System.out.println("Acumulacion de puntos: "+ nuevo);
                System.out.println("Cliente: "+ clientes.get(cb).getNomCliente());

                //Imprimir fecha
                System.out.println("Fecha: ");
                Date now = new Date(System.currentTimeMillis());
                DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
                System.out.println(date.format(now));
                //FIN DE IMPRIMIR TICKET ¡CORRECTO!

                //Convertir Fecha a String ¡Correcto!
                String strDate= date.format(now);

                //ArrayList para el Historial ¡Correcto!
                Historial h1= new Historial(clave,total,nuevo,strDate);
                Historiales.add(h1);  

                ventas.clear();
    }
}
