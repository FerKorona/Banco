/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;
import java.util.Scanner;


/**
 *
 * @author Korona
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        int op, cantidad;
        char nombre[];
        
        Scanner scan = new Scanner (System.in);
        //se crea la cuenta
        
        Cuenta Cuenta1 = new Cuenta(11111, 2500.70);
        Cuenta Cuenta2 = new Cuenta(22222, 5001.40);
        Persona Cliente1 = new  Persona("Jorge Nitales", 40);
        Persona Cliente2 = new Persona("Sergay Putin", 41);
        System.out.println("1) Depositar");
        System.out.println("2) Retirar");
        System.out.println("3) Trans");
        System.out.println("Elige una opcion");
        System.out.println("Cliente: "+Cliente1.getNombre()+" No."+Cuenta1.numeroCuenta1);
        System.out.println("Cliente: "+Cliente2.getNombre()+" No."+Cuenta2.numeroCuenta2);
        op=scan.nextInt();
        switch(op){
            case 1: Cuenta1.depositar(5); break;
            case 2: System.out.println("Cuanto vas a retirar? ");
                    cantidad = scan.nextInt();
                        try{
                            Cuenta1.retirar(cantidad);
                        }catch(Exception ex){
                            System.out.println("No es posible, cantidad no valida");
                          }
        System.out.println("Retiro correcto"); break;
            case 3: System.out.println("Cuanto quieres Trans?");
                    cantidad=scan.nextInt();
                    Cuenta1.retiro(cantidad);
                    Cuenta2.deposito(cantidad);
                    System.out.println("Trans Exitoso");
                    Cuenta1.saldo();
                    Cuenta2.saldo();
                    break;
            
        }
    }
    
}


