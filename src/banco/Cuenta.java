package banco;
import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Korona
 */
public class Cuenta {
    
    int numeroCuenta1=153296, numeroCuenta2=547896;
    private double saldo;
    Scanner scan = new Scanner (System.in);
    public int op;
    public Cuenta(int cuenta, double inicial){
    }//fin del constructor
    
    public void depositar(double cantidad){
        System.out.println("Cuanto vas a depositar? ");
        cantidad=scan.nextDouble();
        saldo= saldo + cantidad;
        System.out.println("deposito correcto");
        System.out.println("El saldo es de: "+saldo);
    }//fin 
    public void retirar(double cantidad){
        saldo= saldo - cantidad;       
        System.out.println("Retiro correcto");
        System.out.println("El saldo es de: "+saldo);
    }// fin
    
    
    public void retiro(int cantidad){
        saldo= saldo - cantidad;
    }
        public void deposito(int cantidad){
        saldo= saldo - cantidad;
    }
    public double saldo(){
        return saldo;
    }// se acaba el metodo
   
}
