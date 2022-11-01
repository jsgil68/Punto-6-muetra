/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class EmpresaPrincipal {
    
   private int codigo;
   private String descripcion;
   private int precio;
   private int cantidadDisponible;

    public EmpresaPrincipal(int codigo, String descripcion, int precio, int cantidadDisponible) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Inventario{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", precio=" + precio + ", cantidadDisponible=" + cantidadDisponible + '}';
    }
    
   public void recibirQueja(String Queja){
       System.out.println("Queja recibida con exito");
       System.out.println(Queja);
   } 
    
}
