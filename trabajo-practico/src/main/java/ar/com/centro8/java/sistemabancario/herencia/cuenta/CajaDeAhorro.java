package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import ar.com.centro8.java.sistemabancario.herencia.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class CajaDeAhorro extends Cuenta {
    private String moneda;
    private double saldo;
    private double interes;

    public CajaDeAhorro(int nroCuenta, Cliente cliente, String moneda, double saldo, double interes) {
        super(nroCuenta, cliente);
        this.moneda = moneda;
        this.saldo = saldo;
        this.interes = interes;
    }

    @Override
    public void tipoCuenta() {
        System.out.println("Soy una Caja de Ahorro");
    }

    @Override
    public void depositar(double monto) {
        saldo += monto;
    }

    @Override
    public void extraer(double monto) {
        if (saldo <= 0 | saldo < monto) {
            System.out.println("No hay saldo suficiente");
        } else {
            saldo -= monto;
        }
    }

    public void cobrarInteres(double saldo, double interes) {
        double ganado = (saldo * (interes / 100) / 365);
        this.saldo = saldo + (Math.round(ganado * 100) / 100);
    }

}
