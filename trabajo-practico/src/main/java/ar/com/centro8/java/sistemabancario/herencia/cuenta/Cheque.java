package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cheque {
    private final int nroCheque;
    private double monto;
    public Cheque(int nroCheque, double monto) {
        this.nroCheque = nroCheque;
        this.monto = monto;
    }
    
}
