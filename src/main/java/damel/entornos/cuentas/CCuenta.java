/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package damel.entornos.cuentas;

/**
 * La clase CCuenta representa una cuenta en la que se ralizan operaciones
 * básicas, como ingresar o retirar saldo y consultar el disponible.
 * También asegura que estas operaciones sean válidas.
 * 
 * @author Borja Piñero
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    /**
     * Crea una cuenta
     */
    public CCuenta() {
    }

    /**
     * Crea una nueva cuenta, con los siguientes parámetros
     *
     * @param nom nombre del titular
     * @param cue número de cuenta
     * @param sal saldo actual
     * @param tipo tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el nombre del titular de la cuenta
     *
     * @return el nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     *
     * @param nombre nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número de cuenta
     *
     * @return el número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     *
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo de la cuenta
     *
     * @return el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo de la cuenta
     *
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Establece el tipo de interés de la cuenta
     *
     * @param tipoInteres el tipo de interés de la cuenta
     */
    public void setTipoInterés(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Obtiene el tipo de interés de la cuenta
     *
     * @return el tipo de interés de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Ingresa una cantidad positva en la cuenta
     *
     * @param cantidad cantidad a ingresar, siempre positiva
     * @throws Exception Si la cantidad es negativa, arroja un error
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }

    /**
     * Retira una cantidad de la cuenta, siempre que sea positiva y haya saldo
     * suficiente
     *
     * @param cantidad cantidad a retirar, siempre positiva
     * @throws Exception Si la cantidad es negativa o menor que el saldo en la
     * cuenta, arroja un error
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (getSaldo() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
    
}
