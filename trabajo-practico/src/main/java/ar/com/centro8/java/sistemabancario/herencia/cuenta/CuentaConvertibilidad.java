package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import ar.com.centro8.java.sistemabancario.herencia.clientes.Cliente;
import ar.com.centro8.java.sistemabancario.herencia.clientes.ClienteEmpresa;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {
    private double saldoUsd;
    public CuentaConvertibilidad(int nroCuenta, ClienteEmpresa cliente, double saldo, double montoAutorizado,
            double saldoUsd) {
        super(nroCuenta, cliente, saldo, montoAutorizado);
        this.saldoUsd = saldoUsd;
    }
    /**
     * Depositar Dolares
     * 
     * @param monto
     */
    public void depositarDolares(double monto) {
        saldoUsd += monto;
    }
    /**
     * Para extraer los Dolares
     * 
     * @param monto
     */
    public void extrerDolares(double monto) {
        saldoUsd -= monto;
    }

    /**
     * Metodo para pasar el saldo en USD a Pesos
     * 
     * @param tasa -> tasa de cambio
     */
    public void pasarAPesos(double monto, double tasa) {
        if (saldoUsd == 0 || saldoUsd < monto) {
            System.out.println("No hay dolares suficiente");
        } else {
            setSaldo(getSaldo()+( Math.round(monto * tasa*100.0) / 100.0));
            saldoUsd-=monto;

        }
    }
    /**
     * Metodo para pasar el saldo de Pesos a USD
     * 
     * @param tasa -> tasa de cambio
     */
    public void pasarADolares(double monto, double tasa) {
        if (getSaldo() == 0 || getSaldo() < monto) {
            System.out.println("No hay Pesos suficiente");
        } else {
            saldoUsd +=( Math.round(monto/tasa * 100.0) / 100);
            setSaldo(getSaldo()-monto);
        }
    }
    /**
     * Solo permite asignar un cliente que sea instancia de ClienteEmpresa
     * @param clienteEmpresa
     */
    @Override
    public void setCliente(Cliente clienteEmpresa) {
        if (clienteEmpresa instanceof ClienteEmpresa) {
            super.setCliente(clienteEmpresa);
        } else {
            System.out.println("No se puede asignar un cliente que no sea cuenta empresa");
        }
    }
}
