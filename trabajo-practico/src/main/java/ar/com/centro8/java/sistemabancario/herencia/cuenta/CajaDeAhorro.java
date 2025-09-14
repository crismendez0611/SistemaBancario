package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import ar.com.centro8.java.sistemabancario.herencia.clientes.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class CajaDeAhorro extends Cuenta {
   
    private double interes;
   
    public CajaDeAhorro(int nroCuenta, Cliente cliente, String moneda, double saldo, double interes) {
        super(nroCuenta, cliente, moneda, saldo);
        this.interes = interes;
    }

    @Override
    public void tipoCuenta() {
        System.out.println("Soy una Caja de Ahorro");
    }

    @Override
    public void depositar(double monto) {
        setSaldo(getSaldo()+monto);
    }

    @Override
    public void extraer(double monto) {
        if (getSaldo() <= 0 | getSaldo() < monto) {
            System.out.println("No hay saldo suficiente");
        } else {
            setSaldo(monto+getSaldo());
        }
    }

    public void cobrarInteres(double saldo, double interes) {
        double ganado = (saldo * (interes / 100) / 365);
        setSaldo(getSaldo()+(Math.round(ganado * 100) / 100) );
    }

    @Override
    public String toString() {
        return "CajaDeAhorro en: "+ getMoneda()+". Nro de cuenta:"+getNroCuenta()+ ". Del cliente: "+getCliente()+". \n % de interres para cobrar "+interes + ", el saldo es  "+ getSaldo();
    }
  
}
