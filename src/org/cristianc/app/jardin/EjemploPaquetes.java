package org.cristianc.app.jardin;

import org.cristianc.app.hogar.Persona;

public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Cristian");
        p.setApellido("Cristaldo");
        System.out.println("p.getNombre() = " + p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Hanna";
        perro.raza = "Perro panzón";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);

    }
}
