package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import ar.com.centro8.java.sistemabancario.herencia.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class CuentaCorriente extends Cuenta {
    private double montoAutorizado;

    public CuentaCorriente(int nroCuenta, Cliente cliente, String moneda, double saldo, double montoAutorizado) {
        super(nroCuenta, cliente, moneda, saldo);
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void tipoCuenta() {
        System.out.println("Soy una Cuenta Corriente");
    }

    @Override
    public void depositar(double monto) {
        setSaldo(getSaldo() + monto);
    }

    @Override
    public void extraer(double monto) {
        if (monto > montoAutorizado | monto > getSaldo() | getSaldo() <= 0) {
            System.out.println("No se puede realizar la operacion");
        } else {
            setSaldo(getSaldo() - monto);
        }
    }

    /**
     * Depositar cheque
     * 
     * @param cheque
     */
    public void depositarCheque(Cheque cheque) {

        setSaldo(getSaldo() + cheque.getMonto());

    }
     @Override
    public String toString() {
        return "Cuenta corriente  en: "+ getMoneda()+". Nro de cuenta:"+getNroCuenta()+ ". Del cliente: "+getCliente()+". \n % monto Autorizado "+montoAutorizado+ ", el saldo es  "+ getSaldo();
    }

}
