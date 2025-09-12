package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import ar.com.centro8.java.sistemabancario.herencia.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class CuentaConvertibilidad extends CuentaCorriente {

    private double saldoUsd;


    public CuentaConvertibilidad(int nroCuenta, Cliente cliente, String moneda, double saldo, double montoAutorizado,
            double saldoUsd) {
        super(nroCuenta, cliente, moneda, saldo, montoAutorizado);
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
    public void pasarAPesos(double tasa) {
        setSaldo(saldoUsd * tasa);

    }

    /**
     * Metodo para pasar el saldo de Pesos a USD
     * 
     * @param tasa -> tasa de cambio
     */

    public void pasarADolares(double tasa) {
        setSaldoUsd(getSaldo() / tasa);

    }
     @Override
    public String toString() {
        return "Cuenta Coventibilidad  Nro de cuenta:"+getNroCuenta()+ ". Del cliente: "+getCliente()+". \n %Monto autorizado "+getMontoAutorizado() + "\n, el saldo en $:"+ getSaldo()+ ", Saldo en Dolares: "+ getSaldoUsd();
    }

}
