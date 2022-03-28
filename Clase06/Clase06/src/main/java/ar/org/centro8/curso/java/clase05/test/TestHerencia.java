package ar.org.centro8.curso.java.clase05.test;

import ar.org.centro8.curso.java.clase05.entities.Direccion;
import ar.org.centro8.curso.java.clase05.entities.Persona;
import ar.org.centro8.curso.java.clase05.entities.Vendedor;

public class TestHerencia {
    public static void main(String[] args) {
        
        System.out.println("-- dir1 --");
        Direccion dir1=new Direccion("Medrano",161,"1","a","Moron");
        System.out.println(dir1);

        System.out.println("-- dir2 --");
        Direccion dir2=new Direccion("Lima",200,"2","b");
        System.out.println(dir2);

        /* 
        Clase abstracta: Son clases que no se pueden instanciar, es decir, no se pueden
        crear objetos de la clase, se de clases hijas. 

        clase final: es una clase que no puede tener clases hijas. 
        si se pueden crear objetos de la clase final. 

        Metodos abstractos: son metodos que no tienen cuerpo, es decir, que no tienen codigo.
        solo pueden existir en clases abtractas. 
        Las clases que herdan de ben implementar los metodos abstractos. 


        */

        /*
        System.out.println("-- persona1 --");
        Persona p1=new Persona("Karina",38,dir1);
        System.out.println(p1);
        p1.saludar();

        System.out.println("-- persona2 --");
        Persona p2=new Persona("Laura",30, dir2);
        System.out.println(p2);
        p2.saludar();
        */

        System.out.println("-- v1 --");
        Vendedor v1=new Vendedor("Eliana", 28, dir2, 1, 90000);
        System.out.println(v1);
        v1.saludar();


        System.out.println("-- v2 --");
        Vendedor v2=new Vendedor("Debora", 23, new Direccion("Lima", 22, "1", "a"), 2, 150000);
        System.out.println(v2);
        v2.saludar();
    }
}
