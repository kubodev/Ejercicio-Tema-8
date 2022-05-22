package com.company;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(33);
        persona.setNombre("Moises");
        persona.setTelefono("+5698868905");


        System.out.println("Nombre: " + persona.getNombre() + " Edad:" + persona.getEdad() + " Telefono:" + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String Nombre;
    private String telefono;


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
