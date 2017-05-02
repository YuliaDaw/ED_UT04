/*
 */

package examen;

public class Main {
    public static void main(String[] args) {
        CCuenta a;
        a = new CCuenta("Felipe Segundo","2222-2222-22-1230456789", 2222,0);
        CCuenta.ImprimeSaldo(a);
        CCuenta.Retirar(a, null);
        CCuenta.Ingresar(a, null);
        CCuenta.ImprimeDatosCuenta(a);
    }

}
