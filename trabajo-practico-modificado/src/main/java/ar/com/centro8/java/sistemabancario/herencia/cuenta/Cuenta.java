package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import ar.com.centro8.java.sistemabancario.herencia.clientes.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Cuenta {
    // Atributos
    private final int nroCuenta;
    private Cliente cliente;
    private double saldo;
    // Metodos
    /** Metodo para decir el tipo de cuenta */
    public abstract void tipoCuenta();
    /**
     * Depositar efectivo en la cuenta
     */
    public void depositarEfectivo(double monto) {
        if (saldo < monto) {
            saldo += monto;
        } else {
            System.out.println("No hay saldo suficiente");
        }
    };
    /**
     * Extraer efectivo de la cuenta
     */
    public void extraerEfectivo(double monto) {
        saldo -= monto;
    };
}
