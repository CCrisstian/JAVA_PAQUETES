package org.cristianc.app.jardin;

import org.cristianc.app.hogar.*;
import static org.cristianc.app.hogar.Persona.*;
import static org.cristianc.app.hogar.ColorPelo.*;
public class EjemploPaquetes {
    public static void main(String[] args) {

        Persona p = new Persona();
        p.setNombre("Cristian");
        p.setApellido("Cristaldo");
        p.setColorPelo(CAFE);
        System.out.println("p.getNombre() = " + p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Hanna";
        perro.raza = "Perro panzón";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
        System.out.println("generoMujer = " + generoMujer);
        System.out.println("generoHombre = " + generoHombre);


    }
}
