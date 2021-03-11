package Cuentas;

/**
 * CCuenta.class
 * @author Littlee_Psycho :)
 * @version 1.0
 * @since 02/03/2021
 * Si pones autor pones tu nombre real
 * El enlace al repositorio se tenía que incluir en el trabajo
 */
public class CCuenta {
    
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
    public CCuenta(String nom, String cue, double sal, double tipo){
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }
    
    /**
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nom y lo iguala a nombre
     */
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    /**
     * @return cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuent y lo iguala a cuenta
     */
    public void setCuenta(String cuent) {
        this.cuenta = cuent;
    }

    /**
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param sald y lo iguala a saldo
     */
    public void setSaldo(double sald) {
        this.saldo = sald;
    }

    /**
     * @return tipoInteres
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param tipoIntereses y lo iguala a tipoInteres
     */
    public void setTipoInteres(double tipoIntereses) {
        this.tipoInteres = tipoIntereses;
    }
    
    /**
     * @return el metodo getSaldo
     */
    
    public double estado(){
        return getSaldo();
    }
    
    /**
     * @param cantidad
     * @throws Exception
     */
    
    public void ingresar(double cantidad) throws Exception{
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * @param cantidad
     * @throws Exception
     */
    
    public void retirar(double cantidad) throws Exception{
        if (cantidad <= 0){
            throw new Exception ("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad){
            throw new Exception ("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
