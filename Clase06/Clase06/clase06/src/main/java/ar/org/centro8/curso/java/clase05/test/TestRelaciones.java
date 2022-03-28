package ar.org.centro8.curso.java.clase05.test;

import java.util.ArrayList;

import ar.org.centro8.curso.java.clase05.entities.Auto;
import ar.org.centro8.curso.java.clase05.entities.ClienteEmpresa;
import ar.org.centro8.curso.java.clase05.entities.ClientePersona;
import ar.org.centro8.curso.java.clase05.entities.Cuenta;
import ar.org.centro8.curso.java.clase05.entities.Gerente;
import ar.org.centro8.curso.java.clase05.entities.Peon;
import ar.org.centro8.curso.java.clase05.entities.Representante;

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
        
        Cuenta cuentaCliente=clientePersona1.getCuenta();
        cuentaCliente.depositar(30000);


        System.out.println(clientePersona1);

        System.out.println("-- clientePersona2 --");
        ClientePersona clientePersona2 = 
                new ClientePersona(2, "Ana", 24, clientePersona1.getCuenta());
        clientePersona2.getCuenta().debitar(10000);
        System.out.println(clientePersona2);
        System.out.println(clientePersona1);    
        
        
        // Tipos de relaciones

        //Tipo de relacion 

        //Asociación simple
        //Un peon usa momentaneamente un auto. 

        //El peon no tiene un atributo del tipo auto.
        //El peon se crea o nace sin auto

        Auto auto1=new Auto("WV","Gol","Blanco");
        Auto auto2=new Auto("Citroen","C4","Verde");

        Peon p1=new Peon(1,"Mariana");
        Peon p2=new Peon(2,"Javier");

        p1.usar(auto1);
        p2.usar(auto2);
        p1.usar(auto2);
        p2.usar(auto1);

        //Relación de Agregación 
        //Representante de Ventas puede tener un auto
        //y ese auto puede ser cambiado
        //El auto puede existir en la empresa y puede romperse
        //sin que deje de vivir el representante

        Representante r1=new Representante(1, "Daniela");
        r1.cambiarAuto("Ford", "Fiesta", "Negro");

        Representante r2=new Representante(2, "Lorena", "Fiat","Idea","Gris");
        r2.cambiarAuto("Renault", "Kangoo", "Negro");

        //Relación de Composición
        //El Gerente tiene una limosina.
        //El Gerente esta compuesto por una limosina.
        //Cuando ingresa un gerente nuevo, se le compra una limosina
        //Cuando el gerente se da de baja, se vende la limosina.
        Gerente g1=new Gerente(1, "Jhon", "Linconl", "Continental");


        System.out.println("-- clienteEmpresa1 --");
        ClienteEmpresa clienteEmpresa1=new ClienteEmpresa(1,"Todo Limpio srl","Lima 222");
        ArrayList<Cuenta> cuentas=clienteEmpresa1.getCuentas();
        cuentas.add(new Cuenta(10, "arg$"));                            // 0
        cuentas.add(new Cuenta(11, "reales"));                          // 1
        cuentas.add(new Cuenta(12, "U$S"));                             // 2
        cuentas.get(0).depositar(45000);
        cuentas.get(0).depositar(120000);
        cuentas.get(0).debitar(25000);
        cuentas.get(1).depositar(50000);
        cuentas.get(2).depositar(12000);

        System.out.println(clienteEmpresa1);
        for(int a=0; a<cuentas.size(); a++) System.out.println(cuentas.get(a));








    }
}
