package ar.com.centro8.java.sistemabancario.herencia.clientes;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ClienteEmpresa extends Cliente {
     // Atributos
    private String nombreFantasia;
    private String cuit;
    // Constructores
    public ClienteEmpresa(int nroCliente, String nombreFantasia, String cuit) {
        super(nroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }   
}
