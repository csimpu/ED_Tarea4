/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package damel.entornos.cuentas;

/**
 * Clase que contiene el método pricipal del programa, donde se crean y 
 * manipulan objetos de la clase CCuenta.
 * 
 * Se encarga de probar las operaciones de ingreso y retirada de saldo,
 * mostrándolo en la consola.
 * 
 * @author Borja Piñero
 */
public class Main {
    
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es "+ saldoActual );

        cuenta1.operativa_cuenta();
    }

}
