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

    // Metodos
    /** Metodo para decir el tipo de cuenta */
    public abstract void tipoCuenta();

    /**
     * 
     * Depositar monto en la cuenta
     * monto ->cantidad a depositar
     */
    public abstract void depositar(double monto);

    /**
     * Extraer monto de la cuenta
     * 
     */
    public abstract void extraer(double monto);

}
