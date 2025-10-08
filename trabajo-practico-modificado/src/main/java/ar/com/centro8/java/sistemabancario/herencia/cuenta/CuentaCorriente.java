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
    public CuentaCorriente(int nroCuenta, Cliente cliente, double saldo, double montoAutorizado) {
        super(nroCuenta, cliente, saldo);
        this.montoAutorizado = montoAutorizado;
    }
    @Override
    public void tipoCuenta() {
        System.out.println("Soy una Cuenta Corriente");
    }
    @Override
    public void extraerEfectivo(double monto) {
        if (monto > montoAutorizado || monto > getSaldo()) {
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
}
