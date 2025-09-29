package ar.com.centro8.java.sistemabancario.herencia.cuenta;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cheque {
    private final int nroCheque;
    private String bancoEmisor;
    private String fechaCobro;
    private double monto;
    
 
/**
 * Cheque en $
 * @param nroCheque
 * @param bancoEmisor
 * @param fechaCobro
 * @param monto
 */
    public Cheque(int nroCheque, String bancoEmisor, String fechaCobro, double monto) {
        this.nroCheque = nroCheque;
        this.bancoEmisor = bancoEmisor;
        this.fechaCobro = fechaCobro;
        this.monto = monto;
    }

}
