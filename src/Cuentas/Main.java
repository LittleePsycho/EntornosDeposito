package Cuentas;

/**
 * Main.class
 * @author Littlee_Psycho :)
 * @version 1.1
 * @since 09/03/2021
 */
public class Main {

    
    public static void main(String[] args) {
        operativa_cuenta(0);
    }  
    
    /**
     * @param cantidad
     * Este metodo devuelve un @throws Exception dentro de un try-catch
     */
    
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;
        
        cuenta1 = new CCuenta("Carlos Rodrigez", "1100-5689-35-1230456789", 3000, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);
        
        try{
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        
        try{
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e){
            System.out.println("Fallo al ingresar");
        }
    }     
}
