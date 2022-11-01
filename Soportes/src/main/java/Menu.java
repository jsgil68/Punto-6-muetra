
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author USUARIO
 */
public class Menu {

    Usuario usuario = new Usuario();
    Scanner leer = new Scanner(System.in);
    int confcompra = 0;
    int ca = 50, can = 20, cant = 70, a = 0, b = 0, c = 0, compra = 0, po = 0, total = 0;

    public void menuInicio() {

        do {
            EmpresaPrincipal inv1 = new EmpresaPrincipal(1234, "Audifonos", 15000, ca);
            EmpresaPrincipal inv2 = new EmpresaPrincipal(1235, "Celular", 600000, can);
            EmpresaPrincipal inv3 = new EmpresaPrincipal(1236, "Cargador", 10000, cant);
            System.out.println("1.Consultar catalogo");
            System.out.println("2.Agregar al carrito");
            System.out.println("3.Realizar el pago");
            System.out.println("4.Cancelar pedido");
            System.out.println("5.Realizar una queja");
            System.out.println("6.Salir");
            po = leer.nextInt();
            switch (po) {
                case 1:
                    System.out.println("                                  ..::CATALOGO::..");
                    System.out.print("1. ");
                    usuario.recibirCatalogo(inv1.toString());
                    System.out.print("2. ");
                    usuario.recibirCatalogo(inv2.toString());
                    System.out.print("3. ");
                    usuario.recibirCatalogo(inv3.toString());
                    break;
                case 2:
                    System.out.println("ingrese el numero del producto que desea comprar");
                    System.out.println("1.Audifonos");
                    System.out.println("2.Celular");
                    System.out.println("3.Cargador");
                    System.out.println("4.Salir");
                    compra = leer.nextInt();
                    switch (compra) {
                        case 1:
                            System.out.println("cuantos Audifonos desea comprar?");
                            a = leer.nextInt();
                            if (a <= ca) {
                                total = 15000 * a;
                                ca = ca - a;
                            } else {
                                System.out.println("No hay tantos audifonos");
                            }
                            break;
                        case 2:
                            System.out.println("cuantos Celulares desea comprar?");
                            b = leer.nextInt();
                            if (b <= can) {
                                total = 600000 * b;
                                can = can - b;
                            } else {
                                System.out.println("No hay tantos audifonos");
                            }
                            break;
                        case 3:
                            System.out.println("cuantos Cargadores desea comprar?");
                            c = leer.nextInt();
                            if (c <= cant) {
                                total = 10000 * c;
                                cant = cant - c;
                            } else {
                                System.out.println("No hay tantos audifonos");
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("El total de la compra es: " + total);
                    if (total > 0) {
                        System.out.println("DIGITE 1 SI: Desea realizar el pago?");
                        confcompra = leer.nextInt();
                        if (confcompra == 1) {
                            usuario.confirmarCompra();
                        }
                    } else {
                        System.out.println("no tiene productos para pagar");
                    }
                    break;
                case 4:
                    System.out.println("ingrese el numero del producto que desea cancelar");
                    System.out.println("1.Audifonos");
                    System.out.println("2.Celular");
                    System.out.println("3.Cargador");
                    System.out.println("4.Salir");
                    compra = leer.nextInt();
                    switch (compra) {
                        case 1:
                            if (a > 0) {
                                total = total - (15000 * a);
                                ca = ca - a;
                            } else {
                                System.out.println("no hay audifonos en el carrito");
                            }
                            break;
                        case 2:
                            if (b > 0) {
                                total = 600000 * b;
                                can = can - b;
                            } else {
                                System.out.println("no hay celulares en el carrito");
                            }
                            break;
                        case 3:
                            if (c > 0) {
                                total = 10000 * c;
                                cant = cant - c;
                            } else {
                                System.out.println("no hay cargadores en el carrito");
                            }
                            break;
                    }
                    break;
                case 5:
                    System.out.println("Escriba su queja:");
                    Quejas que = new Quejas();
                    que.quejasIN();

                    break;
            }

        } while (po != 6);
    }
}
