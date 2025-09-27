package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import ar.com.centro8.java.sistemabancario.herencia.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CajaDeAhorro extends Cuenta {

    private double tasaDeInteres;

    public CajaDeAhorro(int nroCuenta, Cliente cliente, double saldo, double tasaDeInteres) {
        super(nroCuenta, cliente, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }
    @Override
    public void tipoCuenta() {
        System.out.println("Soy una Caja de Ahorro");
    }

    public void cobrarInteres() {
        double interes = (getSaldo() * tasaDeInteres);
        setSaldo(getSaldo() + interes);
    }
}
