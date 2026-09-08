/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancaria;

/**
 *
 * @author chaaa
 */
public class CuentaBancaria {

    String titular;
    double saldo;

    void consignar(double monto) {
        saldo = saldo + monto;
        System.out.println("Consignacion realizada.");
        System.out.println("Nuevo saldo: " + saldo);
    }

    void retirar(double monto) {
        if (monto <= saldo) {
            saldo = saldo - monto;
            System.out.println("Retiro realizado.");
            System.out.println("Nuevo saldo: " + saldo);
        } else {
            System.out.println("No hay fondos suficientes.");
        }
    }
}
