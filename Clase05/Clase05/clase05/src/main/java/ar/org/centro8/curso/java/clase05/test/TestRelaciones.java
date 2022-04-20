package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.ClientePersona;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;

public class TestRelaciones {
    public static void main(String[] args) {
        /*
            Objetos MOCKS
            Testeo con objetos simulados.

            Tenemos visibilidad por defecto a clases del mismo paquete
                y clases del paquete java.lang.
                
        */

        System.out.println("-- cuenta1 --");
        Cuenta cuenta1=new Cuenta(1,"arg$");
        cuenta1.depositar(50000);
        cuenta1.depositar(80000);
        cuenta1.debitar(20000);
        System.out.println(cuenta1);

        System.out.println("-- cuenta2 --");
        Cuenta cuenta2=new Cuenta(2,"arg$");
        cuenta2.depositar(100000);
        cuenta2.debitar(50000);
        System.out.println(cuenta2);

        System.out.println("-- clientePersona1 --");
        ClientePersona clientePersona1 =new ClientePersona(1,"David",26,new Cuenta(3,"arg$"));
        clientePersona1.getCuenta().depositar(30000);
        System.out.println(clientePersona1);

        System.out.println("-- clientePersona2 --");
        ClientePersona clientePersona2 = 
                new ClientePersona(2, "Ana", 24, clientePersona1.getCuenta());
        clientePersona2.getCuenta().debitar(10000);
        System.out.println(clientePersona2);
        System.out.println(clientePersona1);    
        
        // temas pendientes.
        // Falta terminar constructores
        // tipo de datos referenciados
        // tipo de datos primitivos

    }
}
