package ar.com.centro8.java.sistemabancario.herencia.clientes;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data

public abstract class Cliente  {
    //Atributos

    private int nroCliente;
    
    
    //Metodo
    
    public abstract void getCliente();


}
