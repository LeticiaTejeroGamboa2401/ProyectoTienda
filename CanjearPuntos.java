/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

import java.util.Scanner;
import static proyectotienda.TiendaInterface.articulos;
import static proyectotienda.TiendaInterface.clientes;

/**
 *
 * @author Leticia Tejero Gamboa
 * @author Jorge Armando Canche
 * @author Emir Alejandro Bellos
 */
public class CanjearPuntos implements TiendaInterface{
    public void CanjearPuntos(){
        
        int obj = 0;
        int canjeo = 0;
        
        System.out.println("Ingresa la clave del cliente: ");
        Scanner sc=new Scanner(System.in);
        int cla=sc.nextInt();
        
        int b=0;
        do{
            
            for(int i=0;i<clientes.size();i++){
                if(clientes.get(i).getIdCliente() == cla){
                    int ca = clientes.get(i).getAcumulacionPuntos();
                    
                    System.out.println("Clave del artículo que desea canjear: ");
                    Scanner sc1 = new Scanner(System.in);
                    int arti = sc1.nextInt();//Bien lee el producto
                    
                    for(int j = 0; j<articulos.size(); j++){
                        if(articulos.get(j).getIdArticulo() == arti){
                            int pca = articulos.get(j).getPuntoscanje();
                            
                            if(pca <= ca){
                                canjeo = ca - pca;
                                System.out.println("Canjeo Exitoso.");
                                clientes.get(i).setAcumulacionPuntos(canjeo);
                                System.out.println("Puntos Restantes: ");
                                System.out.println(clientes.get(i).getAcumulacionPuntos());
                            }

                            if(ca < pca){
                                System.out.println("No tiene puntos suficientes");
                                break;
                            }
                            
                        }
                    }//Fin del for j
                }
            }//Fin del for i

            System.out.println("Desea Canjear otro producto: ");
            Scanner sc3=new Scanner(System.in);
            String opcion=sc3.nextLine();
            
            if("no".equals(opcion)){
                b = 0;
            }
            
            if("si".equals(opcion)){
                b = 1;
            }
        
        }while(b == 1 || canjeo == 1);

    }
}
