package org.cristianc.app.hogar;

import org.cristianc.app.jardin.Perro;
import static org.cristianc.app.hogar.Persona.saludar;
public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();

        Perro perro = new Perro();

        String saludo = saludar();
    }
}
