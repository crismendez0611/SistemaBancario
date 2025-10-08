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
    /**
     * Calcula y cobra los intereses diario sobre el saldo actual de la cuenta.
     * El interés se calcula como (saldo * tasaDeInteres) y se suma al saldo.
     * el calculo es saldo*(tasaDeInteres/100) /365
     * la tasaDeInteres sta dividida por 100 para convertirla en porcentaje y por 365 para obtener el interés diario.
     */
    public void cobrarInteres() {
        double interes = (getSaldo() * (tasaDeInteres/100)/365);
        setSaldo(getSaldo() +(Math.round(interes*100)/100));
        System.out.println("Se han cobrado intereses por un monto de: " + interes);
        System.out.println("El nuevo saldo es: " + getSaldo());
    }
}
