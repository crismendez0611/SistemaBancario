package ar.com.centro8.java.sistemabancario.herencia.clientes;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)
public class ClienteEmpresa extends Cliente {

    //Atributos
    private String cuit;
    private String nombre;
    
 

    public ClienteEmpresa(int nroCliente,String nombre, String cuit) {
        super(nroCliente);
        this.cuit = cuit;
        this.nombre = nombre;
    }



    @Override
    public void getCliente() {
        System.out.println("Soy una empresa");
    }

    
}
