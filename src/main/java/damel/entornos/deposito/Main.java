/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package damel.entornos.deposito;

/**
 * Entornos de desarrollo DAM Modalidad Virtual
 *
 * Curso 2024/2025
 *
 * @author Borja Piñero
 */
public class Main {
    
    public static void main(String[] args) {
        CCuenta miCuenta;
        double saldoActual;

        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

}
