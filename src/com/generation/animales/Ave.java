package com.generation.animales;

public class Ave extends Animal{
    private int alas;
    private int patas;
    private boolean vuela;

    public Ave () {

    }

    public Ave(String nombre) {
        this.nombre = nombre;
        System.out.println("Constructor hijo");
    }



    public void hacerNido(){
        System.out.println("Estoy haciendo mi nido");
    }

    public void ponerHuevo() {
        System.out.println("Estoy poniendo un huevo");
    }


    @Override
    public void comer() {
        System.out.println("Estoy comiendo alpiste");

    }
    @Override
    public void respirar() {
        System.out.println("Estoy respirando por la nariz");

    }

}
