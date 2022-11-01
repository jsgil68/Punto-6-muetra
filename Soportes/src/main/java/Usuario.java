
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class Usuario {
    Scanner leer = new Scanner(System.in);
    String nombre = "  ";
    int num=0, conf=0;
    
    private ArrayList<EmpresaPrincipal> inve = new ArrayList();

    public void setInve(ArrayList<EmpresaPrincipal> inve) {
        this.inve = inve;
    }

    public ArrayList<EmpresaPrincipal> getInve() {
        return inve;
    }

    @Override
    public String toString() {
        return "Usuario{" + "inve=" + inve + '}';
    }

   public void confirmarCompra(){     
       System.out.println("..::PAGO PSE::..");
       System.out.print("Ingrese su nombre: ");
       nombre=leer.nextLine();
       System.out.print("Ingrese el numero de la targeta: ");
       num=leer.nextInt();
       System.out.print("Escriba 1 para confirmar el pago ");
       conf=leer.nextInt();
       if(conf == 1){
           System.out.println("Pago confirmado");
           System.out.println("El pedido sera enviado a nombre de: " + nombre);
       } else{
           System.out.println("Pedido cancelado");
       }
   }
    
    public String enviarQueja(String Queja){
  
    
        return Queja;
    }
    public void recibirCatalogo(String catalogo){
        System.out.println(catalogo);
    
    }
    
    
}
