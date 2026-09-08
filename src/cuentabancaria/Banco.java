/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author chaaa
 */
public class Banco {
       public static void main(String[] args) {

        // Crear la primera cuenta
        CuentaBancaria cuenta1 = new CuentaBancaria();

        cuenta1.titular = "Santiago";
        cuenta1.saldo = 50000;

        System.out.println("CUENTA 1");
        System.out.println("Titular: " + cuenta1.titular);
        System.out.println("Saldo: " + cuenta1.saldo);

        // Consignar dinero
        cuenta1.consignar(20000);

        // Retirar dinero
        cuenta1.retirar(10000);

        // Intentar retirar más dinero del disponible
        cuenta1.retirar(100000);

        // Crear una segunda cuenta
        CuentaBancaria cuenta2 = new CuentaBancaria();

        cuenta2.titular = "Carlos";
        cuenta2.saldo = 80000;

        System.out.println("\nCUENTA 2");
        System.out.println("Titular: " + cuenta2.titular);
        System.out.println("Saldo: " + cuenta2.saldo);

        // Operación sobre la segunda cuenta
        cuenta2.consignar(10000);

        // Mostrar saldos finales
        System.out.println("\nSALDOS FINALES");
        System.out.println("Saldo cuenta 1: " + cuenta1.saldo);
        System.out.println("Saldo cuenta 2: " + cuenta2.saldo);
    }
}
