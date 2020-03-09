/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Almacen;

/**
 *
 * @author alumnot
 */
public class Articulo {

    private  String nombre;

    private   int codigo=0;
    private  double preciov;
    private  double pricec;
    private  int stock;
    

    public Articulo(String nombre, int codigo, double preciov, double prizec, int stock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.pricec = prizec;
        this.preciov = preciov;
        this.stock = stock;
        
    }

   public Articulo(){};
    
    
    //constructor copia
    public Articulo(Articulo p) {
        this.codigo = p.getCodigo();
        this.nombre = p.getNombre();
        this.stock = p.getStock();
    }

    public void listado() {
        System.out.println("===============");
        System.out.println("Nombre= " + this.nombre);
        System.out.println("Codigo= " + this.codigo);
        System.out.println("Precio de venta: " + this.preciov);
        System.out.println("Precio de compra:"+ this.pricec);
        System.out.println("Stock: "+this.stock);
      

    }
    
    public String nulo(){
    return this.nombre;
    
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreciov() {
        return preciov;
    }

    public void setPreciov(double preciov) {
        this.preciov = preciov;
    }

    public double getPricec() {
        return pricec;
    }

    public void setPricec(double pricec) {
        this.pricec = pricec;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
