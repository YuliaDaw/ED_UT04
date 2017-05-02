/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
/**
 * @version 2/05/2017
 * @author verum_000
 */
public class CCuenta {
/**
 * 
 * @param a
 */
    public static void ImprimeSaldo(CCuenta a) {
        double saldoA;
        saldoA = a.Ver_saldo();
        System.out.println("El saldo actual es" + saldoA);
    }
/**
 * 
 * @param a
 */
    public static void ImprimeDatosCuenta(CCuenta a) {
        System.out.println("Datos de la cuenta: " + a.nombre + a.cc + a.saldo + a.tipoInteres);
    }
/**
 * 
 * @param a
 * @param Cantidad 
 */
    public static void Ingresar(CCuenta a, Double Cantidad) {
        try {
            System.out.println("Ingreso en cuenta");
            a.Ingresar(Cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
/**
 * 
 * @param a
 * @param Cantidad 
 */
    public static void Retirar(CCuenta a, Double Cantidad) {
        try {
            a.Retirar(Cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
    }
/**
 * Declaracion de las variables
 */
    String nombre;
    String cc;
    private String password; 
    double saldo;
    double tipoInteres;
    int contador;
/**
 * Constructor sin parametros
 */
    public CCuenta() {
    }
/**
 * Constructor con parametros
 * @param NombTitular
 * @param num_cuenta
 * @param saldo_cuenta
 * @param tipo_interes 
 */
    public CCuenta(String NombTitular, String num_cuenta, double saldo_cuenta, double tipo_interes) {
        nombre = NombTitular;
        cc = num_cuenta;
        saldo = saldo_cuenta;
    }
/**
 * 
 * @param nom 
 */
    public void asignaNom_Titular(String nom) {
        nombre = nom;
    }
/**
 * 
 * @return Nombre del Titular
 */
    public String Ver_nom_Titular() {
        return nombre;
    }
/**
 * 
 * @return Saldo de la cuenta
 */
    public double Ver_saldo() {
        return saldo;
    }
/**
 * 
 * @param cantidad
 * @throws Exception 
 */
    public void Ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        saldo = saldo + cantidad;
    }
/**
 * 
 * @param cantidad
 * @throws Exception 
 */
    public void Retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (Ver_saldo() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        saldo = saldo - cantidad;
    }
/**
 * 
 * @param tantoPorCiento
 * @return Procentage
 */
    public double porcentaje(double tantoPorCiento) {
        return saldo * tantoPorCiento / 100;

    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
/**
 * 
 * @param ContraseniaNueva
 * @param ContraseniaAntigua
 * @param a 
 */
    public void CambiaContraseña(String ContraseniaNueva, String ContraseniaAntigua, CCuenta a) {
        if (ContraseniaAntigua.equals(a.getPassword())) {
            this.password = ContraseniaNueva;
            System.out.println("Contraseña se ha cambiado");
        } else {
            contador++;
        }
        if (contador >= 3) {
            System.out.println("No se puede cambiar");
        }
    }
}
