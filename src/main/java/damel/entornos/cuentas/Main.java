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
        float cantidad = 0f;

        operativa_cuenta(cantidad);
    }
    
    /**
     * Intenta ingresar una cantidad en euros y retirar otra cantidad en euros.
     * Si falla, devuelve un mensaje de error
     * 
     * @param cantidad cantidad a ingresar o retirar
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.getSaldo();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }

        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }

}
