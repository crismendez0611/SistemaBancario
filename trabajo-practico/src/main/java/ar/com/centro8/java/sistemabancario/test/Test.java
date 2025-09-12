package ar.com.centro8.java.sistemabancario.test;

import ar.com.centro8.java.sistemabancario.herencia.clientes.ClienteEmpresa;
import ar.com.centro8.java.sistemabancario.herencia.clientes.ClienteIndividual;
import ar.com.centro8.java.sistemabancario.herencia.cuenta.CajaDeAhorro;
import ar.com.centro8.java.sistemabancario.herencia.cuenta.Cheque;
import ar.com.centro8.java.sistemabancario.herencia.cuenta.CuentaConvertibilidad;
import ar.com.centro8.java.sistemabancario.herencia.cuenta.CuentaCorriente;

public class Test {
    public static void main(String[] args) {
        System.out.println("*** Test Cliente Indivudial");
        ClienteIndividual cliente1 = new ClienteIndividual(1, "Cristian", "Mendez", "123456");
        System.out.println(cliente1);
        cliente1.getCliente();
        System.out.println("El nombre del cliente 1 es:" + cliente1.getNombre());
        System.out.println("El apellido del cliente 1 es:" + cliente1.getApellido());
        System.out.println("El DNI del cliente 1 es:" + cliente1.getDni());
        System.out.println("El Nro de cliente  del cliente 1 es:" + cliente1.getNroCliente());
        System.out.println("***Test Cliente Empresa***");
        ClienteEmpresa cliente2 = new ClienteEmpresa(2, "Pikachu", "222222");
        cliente2.getCliente();
        System.out.println(cliente2);
        System.out.println("El nro de cliente es: " + cliente2.getNombreFantasia());
        System.out.println("El cuit es: " + cliente2.getCuit());
        ClienteEmpresa cliente3 = new ClienteEmpresa(3, "Agumon", "1");
        System.out.println("****Test Caja de ahorro***");
        CajaDeAhorro cuenta1 = new CajaDeAhorro(1, cliente1, "Pesos argentinos", 0,8);
        cuenta1.tipoCuenta();
        System.out.println(cuenta1.getCliente());
        System.out.println("*** Test depositar***");
        cuenta1.depositar(6000);
        System.out.println(cuenta1.getSaldo());
        System.out.println("***Test de Extraer***");
        // cuenta1.extraer(7000); No hay saldo
        cuenta1.extraer(900);// 0
        System.out.println(cuenta1.getSaldo());
        System.out.println("***Cobrar Interes***");
        cuenta1.cobrarInteres(cuenta1.getSaldo(), cuenta1.getInteres());
        System.out.println(cuenta1.getSaldo());
        System.out.println("*** Cuenta Corriente ***");
        CuentaCorriente cuenta2 = new CuentaCorriente(2, cliente2, "Pesos Argentinos", 0, 6000);
        cuenta2.tipoCuenta();
        // Depositar
        cuenta2.depositar(9000);
        System.out.println(cuenta2.getSaldo());
        // Extraer
        cuenta2.extraer(7000);// supera el monto autorizado
        cuenta2.extraer(6000);
        System.out.println(cuenta2.getSaldo());
        cuenta2.extraer(3000);// la cuenta queda en 0
        cuenta2.extraer(1000);// no deja extraer porque ya el saldo es 0
        System.out.println(cuenta2.getSaldo());
        System.out.println("*** Cuenta convertivilidad ***");
        CuentaConvertibilidad cuenta3 = new CuentaConvertibilidad(3, cliente3, "Pesos Argentinos", 0, 6000, 0);
        System.out.println(cuenta3);
        // Depositar pesos
        cuenta3.depositar(6000);
        System.out.println("El saldo de la cuenta3 en $:" + cuenta3.getSaldo());
        // depositar dolares
        cuenta3.depositarDolares(6000);
        System.out.println("El saldo de la cuenta 3 en USD:" + cuenta3.getSaldoUsd());
        System.out.println("El saldo de la cuenta 2:" + cuenta2.getSaldo());
        // Depositar cheque en pesos
        System.out.println(cuenta3.getSaldo());
        // depositar cheque en dolares
        Cheque cheque1 = new Cheque(1, "BBVA", "11/09/2025", 230000);
        cuenta2.depositarCheque(cheque1);
        Cheque cheque3=new Cheque(3, "Creedicoop", "5/5/23", 600);
        System.out.println(cheque3.getMoneda());
        System.out.println("el saldo de la cuenta 2 es $:" + cuenta2.getSaldo());
        Cheque cheque2 = new Cheque(2, "Banco Galicia", "11/09/2025", 1000);
        cuenta3.depositarCheque(cheque2);
        System.out.println("el saldo de la cuenta 3 en USD:" + cuenta3.getSaldoUsd());
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
    }
}
