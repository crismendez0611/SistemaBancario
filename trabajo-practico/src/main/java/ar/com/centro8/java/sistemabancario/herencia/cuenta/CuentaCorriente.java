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
    private String moneda;
    private double saldo;
   

  

    public CuentaCorriente(int nroCuenta, Cliente cliente, double montoAutorizado, String moneda, double saldo) {
        super(nroCuenta, cliente);
        this.montoAutorizado = montoAutorizado;
        this.moneda = moneda;
        this.saldo = saldo;
    }


    @Override
    public void tipoCuenta() {
    System.out.println("Soy una Cuenta Corriente");
}


    @Override
    public void depositar(double monto) {
        saldo+=monto;
    }


    @Override
    public void extraer(double monto) {
        if (monto > montoAutorizado | monto >saldo | saldo<=0) {
            System.out.println("No se puede realizar la operacion");
        }
        else{
            saldo-=monto;
        }
    }

    public void depositarCheque(Cheque cheque){

        saldo+= cheque.getMonto();


    }

 

}
