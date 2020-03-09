/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class GestionALmacen {

    public static void main(String[] args) {
        //Articulo p1=new Articulo("x-men",001,20,5,100);

        Scanner n = new Scanner(System.in);
        Scanner x=new Scanner(System.in);
        Articulo[] todo = new Articulo[10];
        todo[0] = new Articulo("papayas", 001, 10, 2, 1000);
        todo[1] = new Articulo("aguacates", 002, 7, 1, 2000);
        todo[2] = new Articulo("piñas", 003, 5, 2, 750);
        todo[3] = new Articulo("limones", 004, 3, 1, 1200);
        todo[4] = new Articulo("sardinas", 005, 6, 1, 100);
        todo[5] = new Articulo();
        todo[6] = new Articulo();
        todo[7] = new Articulo();
        todo[8] = new Articulo();
        todo[9] = new Articulo();
        int opcion;

        do {

            System.out.println("Que desea hacer?");
            System.out.println("1.Listado");
            System.out.println("2.Nuevo producto");
            System.out.println("3.Quitar producto");
            System.out.println("4.Modificacion");
            System.out.println("5.Entrada de mercancia");
            System.out.println("6.Venta ");
            System.out.println("7.Salida");
            System.out.println("Opcion:");
            opcion = n.nextInt();

            int conta = 0;

            for (int i = 0; i < todo.length; i++) {
                if (todo[i].nulo() != null) {
                    conta++;
                }
            }

            switch (opcion) {

                case 1://LISTADO
                    for (int i = 0; i < todo.length; i++) {
                        if (todo[i].nulo() != null) {
                            todo[i].listado();
                        }
                    }
                    System.out.println("===============");
                    break;

                case 2:///AÑADIR A LA LISTA

                    if (conta >= 10) {
                        System.out.println("No se puede almacenar mas articulos,pero puede comprar mas espacio de almacenamiento");
                        break;
                    }

                    int c;
                    do {
                        System.out.println("Inserte el numero de articulos a adjuntar,Max " + (10 - conta) + " articulos");
                        c = n.nextInt();

                    } while (c + conta > 10);
                    System.out.println("vale  " + c);
                    while (c > 0) {
                        System.out.println("Introduzca nombre");
                        String nombre = n.next();
                        System.out.println("Introduzca código");
                        int codigo = n.nextInt();
                        System.out.println("Introduzca precio de venta");
                        double pve = n.nextDouble();
                        System.out.println("Introduzca precio de compra");
                        double compra = n.nextDouble();
                        System.out.println("Introduzca cantidad en stock");
                        int stock = n.nextInt();
                        todo[conta] = new Articulo(nombre, codigo, compra, pve, stock);
                        conta++;
                        c--;

                    }
                    break;

                case 3://QUITAR DE LA LISTA
                    System.out.println("Que articulo desea quitar?");
                    for (int g = 0; g < todo.length; g++) {
                        System.out.println("Pulse " + g + " para " + todo[g].getNombre());
                    }
                    ;
                    int pulse = n.nextInt();

                    todo[pulse] = todo[conta - 1];
                    todo[conta - 1] = new Articulo();
                    conta--;
                    break;

                case 4://Modificacion
                    int g;

                    System.out.println("Que articulo desea Modificar?");
                    for (g = 0; g < todo.length; g++) {
                        System.out.println("Pulse " + g + " para " + todo[g].getNombre());
                    }
                    g=x.nextInt();
                    int op;
                    do{
                    System.out.println("que desea modificar?");
                    System.out.println("1.nombre");
                    System.out.println("2.codigo");
                    System.out.println("3.precio de venta");
                    System.out.println("4.precio de compra");
                    System.out.println("5.cantidad en stock");
                    System.out.println("6.Nada mas");
                    op=n.nextInt();
                    
                    switch (op){
                    case 1:
                        System.out.println("Introduzca nombre");
                        String nombre = n.next(); 
                        todo[g].setNombre(nombre);break;
                        
                    case 2:
                        System.out.println("Introduzca código");
                        int codigo = n.nextInt();
                        todo[g].setCodigo(codigo);break;
                        
                    case 3:
                        System.out.println("Introduzca precio de venta");
                        double pve = n.nextDouble();
                        todo[g].setPreciov(pve);break;
                        
                    case 4:   
                        System.out.println("Introduzca precio de compra");
                        double compra = n.nextDouble();
                        todo[g].setPricec(compra);break;
                        
                    case 5:   
                        System.out.println("Introduzca cantidad en stock");
                        int stock = n.nextInt();
                        todo[g].setStock(stock);break;
                        
                    case 6:break;    
                    
                    
                    }}while(op!=6);break;
                    
                case 5://ENTRADA DE PRODUCTOS
                  int s;

                    System.out.println("Que articulo quiere aumentar de cantidad?");
                    for (s = 0; s < todo.length; s++) {
                        System.out.println("Pulse " + s + " para " + todo[s].getNombre()+" con stock de "+todo[s].getStock());
                    }
                    s=x.nextInt();   
                    
                    System.out.println("Cuanto ha llegado?");
                    int au=x.nextInt();
                    todo[s].setStock(todo[s].getStock()+au);
                    System.out.println("Ahora hay en "+todo[s].getNombre()+" un total de "+todo[s].getStock()+" unidades");break;
                    
                case 6://Ventas
                     System.out.println("Que articulo quiere declarar en ventas?");
                    for (s = 0; s < todo.length; s++) {
                        System.out.println("Pulse " + s + " para " + todo[s].getNombre()+" con stock de "+todo[s].getStock());
                    }
                    s=x.nextInt();   
                    
                    System.out.println("Cuanto se ha venido?");
                    int ua=x.nextInt();
                    if(ua>todo[s].getStock()){System.out.println("No has podido vender tanto mentiroso");break;}
                    else{
                    todo[s].setStock(todo[s].getStock()-ua);
                    System.out.println("Ahora hay en "+todo[s].getNombre()+" un total de "+todo[s].getStock()+" unidades");break;
                    }
                    
                    
                case 7:
                    System.out.println("Y hasta aqui el programa de hoy,espero que les haya gustado un saludo y hasta la proxima");break;
                    
                    
                    
                    

            }
        } while (opcion != 7);

    }
}
