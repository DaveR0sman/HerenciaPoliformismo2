package com.generation.animales;

public abstract class Animal {
    protected String nombre;
    protected int edad;


    public Animal () {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Animal(String nombre) {
        this.nombre = nombre;
        System.out.println("constructor padre");

    }


    public void comunicarse() {
        System.out.println("Hola");
    }

    public void comer() {

        System.out.println("Estoy comiendo alpiste");
    }

    public abstract void respirar();

}
