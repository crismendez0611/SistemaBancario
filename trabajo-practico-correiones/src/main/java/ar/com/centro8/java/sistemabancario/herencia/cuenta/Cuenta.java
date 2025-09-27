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
     * 
     * Depositar monto en la cuenta
     * monto ->cantidad a depositar
     */
    public void depositarEfectivo(double monto){
        if (saldo< monto) {
            System.out.println("No hay saldo suficiente");
        } else {
            saldo+=monto;
        }


    };

    /**
     * Extraer monto de la cuenta
     * 
     */
    public void extraerEfectivo(double monto){
        saldo-=monto;
    };

}
